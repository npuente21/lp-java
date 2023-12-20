import java.io.*;
public class Archivos{
  public void leer(String nombreArchivo){
    try{
      FileReader l = new FileReader(nombreArchivo);
      BufferedReader buffer = new BufferedReader(l);
      System.out.println(buffer.readLine());

    }
    catch(Exception a){
      System.out.println(a.getMessage());
    }
    
  }
}
