public class Casas extends Edificacion{
  public Casas(int consumo){
    this.consumo=consumo;  //balones de gas
  }
  public int Get_consumo(){  //retorna el consumo
    return this.consumo;
  }
  public void Set_consumo(int c){ //Modifica el consumo
    this.consumo = c;
  }
}
