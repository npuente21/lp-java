import java.io.*;
public class Empresa{
  int Precio_Balon;   //precio del balon de gas
  int Precio_Litro;   //precio del litro de gas
  public Empresa(){  //lee el archivo empresa para crear la empresa
    try{
      FileReader l = new FileReader("empresa.txt");
      BufferedReader buffer = new BufferedReader(l);
      this.Precio_Balon = Integer.valueOf(buffer.readLine());
      this.Precio_Litro = Integer.valueOf(buffer.readLine());
    }
    catch(Exception a){
      System.out.println(a.getMessage());
    }
  }
  public int Get_Precio_Balon(){ //Retorna el precio del Balon de la empresa
    return Precio_Balon;
  }
  public void Set_Precio_Balon(int c){  //Modifica el valor del Precio_Balon
    Precio_Balon = c;
  }
  public int Get_Precio_Litro(){  //Retorna el precio del Litro de la empresa
    return Precio_Litro;
  }
  public void Set_Precio_Litro(int c){  //Modifica el valor del Precio_Litro
    Precio_Litro = c;
  }
}
