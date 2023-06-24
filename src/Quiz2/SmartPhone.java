package Quiz2;

class SmartPhone{
  private int id;
  public String marka;
  public String model;
  public int hafiza;
  public static int count = 0;

  public SmartPhone(){
	id = ++count;
  }
  public SmartPhone (String Marka, String Model, int Hafiza){
    id = ++count;
    marka = Marka;
    model = Model;
    hafiza = Hafiza;
  }

  public int getID(){
    return id;
  }

  public void setID(int q){
    id = q;
  }

  public void BilgileriYazdir(){
    System.out.println("ID: "+getID());
    System.out.println("Marka: "+marka);
    System.out.println("Model: "+model);
    System.out.println("Hafıza: "+hafiza+" GB");
  }

  private void HafizaDegerlendir(){
    System.out.println("Hafiza %80 dolu.");
  }
}