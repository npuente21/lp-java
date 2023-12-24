import java.io.*;
import java.util.*;
public class Pais{
  int nNodes;   //numero de nodos
  int nEdges;   //numero de arcos
  int M[][];  //la matriz de adyacencia con valores enteros
  List<Ciudad> Ciudad;  //lista con las ciudades que tiene el pais
  public void addEdge(int a, int b, int w){ //añade los valores de las distancias entre los nodos en la matriz de adyacencia
    M[a][b]=w;
    M[b][a]=w;
  }
  public void addCiudad(Ciudad F){
    Ciudad.add(F);
  }  //añade a F a la lista de ciudades
  public Pais(){
    try{
      int n,p;
      FileReader l = new FileReader("mapa.txt");
      BufferedReader buffer = new BufferedReader(l);
      this.nNodes=Integer.valueOf(buffer.readLine());  //lee la primera linea del archivo
      this.Ciudad=new ArrayList<Ciudad>(nNodes);
       this.M= new int[nNodes][nNodes];
      for (n=0;n<nNodes;n++){
        for(p=0;p<nNodes;p++){
          M[n][p]=0;                //genera la matriz llena de 0
        }
      }
      String [] cadena;
      this.nEdges=Integer.valueOf(buffer.readLine()); //lee la sgda linea del archivo
      for (n=0;n<nEdges;n++){
        cadena = (buffer.readLine()).split(" ");
        int estoy = Integer.valueOf(cadena[0]); //nodo dd estoy
        int voy = Integer.valueOf(cadena[1]);    //nodo al que me dirijo
        int valor = Integer.valueOf(cadena[2]); //valor del arco
        addEdge(estoy,voy,valor);
      }

    }
    catch(Exception a){
      System.out.println(a.getMessage());
    }
  }

  public void Printea_Matriz(){
    int n,p;
    for (n=0;n<nNodes;n++){
      System.out.println(" ");    //printea la matriz
      for(p=0;p<nNodes;p++){
        System.out.print(M[n][p]+" ");
      }
    }
    System.out.println("");
  }
  public int edgeWeight(int a, int b){  //retorna el valor del arco entre los nodos
    return M[a][b];
  }
  public  int[][] shortestPath(int a, int b){       //Modifica la matriz de adyacencia
    int k, i, j, n;                               //Con el algortimo del Floyd-Warshall
    int cam=1;
    for (n=0;n<cam;n++){
      for(k=1;k<nNodes;k++){
        for(i=0;i<nNodes;i++){
          for(j=1;j<nNodes;j++){
            if ((M[i][j]>(M[i][k]+M[k][j]) && (M[i][k]!=0) && (M[k][j]!=0)) || (M[i][j]==0 && i!=j)){
              M[i][j]=(M[i][k]+M[k][j]);
              M[j][i]=(M[i][k]+M[k][j]);
              cam++;
            }
          }
        }
      }
    }
    return M;
  }
  public int Eleccion(){   //elige la ciudad más optima para instalar
    int i, j;              //la empresa
    int cosa=0;
    double inf= Double.POSITIVE_INFINITY;
    for (i=0;i<nNodes;i++){
      int aux=0;
      for(j=0;j<nNodes;j++){
        aux= aux + M[i][j];
      }
      if(inf>aux){
        inf=aux;
        cosa=i;
      }
    }
    return cosa;
  }
}
