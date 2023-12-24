import java.io.*;
public class Camioneta extends Vehiculo{
  public Camioneta(){
    try{
      FileReader l = new FileReader("empresa.txt");
      BufferedReader buffer = new BufferedReader(l);
      int n;
      for (n=0;n<2;n++){
        buffer.readLine();}
      this.consumo= Integer.valueOf(buffer.readLine());
    }
    catch(Exception a){
      System.out.println(a.getMessage());
    }
  }
  public int Get_consumo(){  //retorna el consumo
    return this.consumo;
  }
  public void Set_consumo(int c){ //Modifica el consumo
    this.consumo = c;
  } 
}
