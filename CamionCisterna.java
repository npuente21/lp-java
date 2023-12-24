public class CamionCisterna extends Vehiculo{
  public CamionCisterna(int consumo){
    this.consumo=consumo;
  }
  public int Get_consumo(){  //retorna el consumo
    return this.consumo;
  }
  public void Set_consumo(int c){ //Modifica el consumo
    this.consumo = c;
  }
}
