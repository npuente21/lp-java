public class Edificios extends Edificacion{
  public Edificios(int consumo){
    this.consumo=consumo;  //consumo litros de gas
  }
  public int Get_consumo(){  //retorna el consumo
    return this.consumo;
  }
  public void Set_consumo(int c){ //Modifica el consumo
    this.consumo = c;
  }
}
