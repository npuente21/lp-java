import java.io.*;
import java.util.*;
class Main {
  public static void main(String[] args){
    Pais Chile =new Pais();
    Empresa Enap =new Empresa();
    Camioneta Auto = new Camioneta();
    CamionCisterna Furgon= new CamionCisterna(Auto.consumo);
    int n,p;
    String [] cadena;
    try{
      FileReader l = new FileReader("edificaciones.txt"); //se encarga de leer el archivo edificaciones
      BufferedReader buffer = new BufferedReader(l);
      for (n=0;n<Chile.nNodes;n++){
        cadena= (buffer.readLine()).split(" ");
        if ( cadena.length<5){
          int iden = Integer.valueOf(cadena[0]);
          int Cas = Integer.valueOf(cadena[1]);
          int nEdi= Integer.valueOf(cadena[2]);
          Ciudad Stgo =new Ciudad(iden ,nEdi, Cas);   //creando cada ciudad del pais
          if (Cas !=0){
            cadena= (buffer.readLine()).split(" ");
            for (p=0;p<cadena.length;p++){
              Casas Casita =new Casas(Integer.valueOf(cadena[p]));  //con su correspondiente cantidad de casas
              Stgo.Agregar_Casa(Casita);  //y agregando cada casa a la lista de casas que tiene cada ciudad
            }
          }
          if (nEdi!=0){
            cadena= (buffer.readLine()).split(" ");
            for (p=0;p<cadena.length;p++){
              Edificios Torre =new Edificios(Integer.valueOf(cadena[p]));
              Stgo.Agregar_Edificio(Torre);    //hace lo mismo con los edificios
            }
          }
          Chile.addCiudad(Stgo);   //añade la ciudad Stgo a la Lista del Pais anteriormente creado
        }
      }  //en este FOR se crea cada ciudad con su respectiva cantidad de casa y edificios para luego almacenarla en la Lista de Ciudades del Pais
      Iterator<Ciudad> it =Chile.Ciudad.iterator();
      Chile.M=Chile.shortestPath(0,0);
      int elegido=Chile.Eleccion();
      System.out.println("La ciudad "+elegido+" es la ubicación más optima");
      while(it.hasNext()){    //se recorre la lista de cada una de las ciudades
        Ciudad ciudad= it.next();
        int camionetas = 0;
        if (ciudad.nCasas != 0){
          camionetas = 1;
        }
        int c=(ciudad.consumo_Casas()*Enap.Precio_Balon)+(ciudad.consumo_Edificios()*Enap.Precio_Litro) -((Chile.edgeWeight(elegido, ciudad.id)*(camionetas*Auto.consumo+Furgon.consumo*ciudad.nEdificios))*2);
        System.out.println("ciudad "+ciudad.id +":");
        System.out.println("Utilidad de "+c); //siendo "c" las ganancias- el valor del transporte de ida y vuelta de los vehiculos
        System.out.println("Se han utilizado "+ciudad.nEdificios+" camiones de cisterna y "+camionetas+" camionetas");
      }
    }
    catch(Exception a){  //por si ocurre algun tipo de error
      System.out.println(a.getMessage());
    }
  }
}
