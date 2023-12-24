import java.util.*;
public class Ciudad{
  int id;   //identificacion de la ciudad
  int nEdificios;  //numero edificios
  int nCasas;   //numero casas
  List<Edificios> Edificios;  //una lista con los edificios de la ciudad
  List<Casas> Casas;  //una lista con las casas de la ciudad
  public Ciudad(int numero, int Edi, int casa){
    this.id = numero;
    this.nEdificios =Edi;
    this.nCasas =casa;
    this.Casas=new ArrayList<Casas>(casa);
    this.Edificios=new ArrayList<Edificios>(Edi);
  }
  public void Agregar_Casa(Casas casa){   //agrega la "casa" a la lista de casas
    Casas.add(casa);
  }
  public void Agregar_Edificio(Edificios edi){ //agrega el "edi" a la lista de edificos
    Edificios.add(edi);
  }
  public int consumo_Edificios(){ //recorre la lista de edificios para
    int c=0;        //conocer el consumo de gas total de los edificios
    Iterator <Edificios> it = Edificios.iterator();
    while(it.hasNext()){
      Edificios edfi= it.next();
      c+= edfi.consumo;
    }
    return c;
  }
  public int consumo_Casas(){ //recorre la lista de casas para conocer
    int c=0;      //el consumo de gas total de las casas en dicha ciudad
    Iterator <Casas> it = Casas.iterator();
    while(it.hasNext()){
      Casas edfi= it.next();
      c+= edfi.consumo;
    }
    return c;
  }
  public int Get_id(){ //Retorna el id de la ciudad
    return id;
  }
  public int Get_nEdificios(){ //Retorna el numero de edificios
    return nEdificios;
  }
  public int Get_nCasas(){ //Retorna el numero de casas
    return nCasas;
  }
  public void Set_id(int c){ //Modifica la id de la ciudad
    id = c;
  }
  public void Set_nEdificios(int c){ //Modifica la cantidad de edificios de la ciudad
    nEdificios = c;
  }
  public void Set_nCasas(int c){ //Modifica la cantidad de casas de la ciudad
    nCasas = c;
  }
}
