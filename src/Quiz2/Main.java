package Quiz2;

import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner str_reader = new Scanner(System.in);
    Scanner int_reader = new Scanner(System.in);
    
    System.out.print("Enter number of phones: ");
    int n = int_reader.nextInt();
    System.out.println();
    
    SmartPhone[] handy = new SmartPhone[n];
    
    for (int i = 0; i < handy.length; i++) {
      handy[i] = new SmartPhone();
      
      System.out.print("Enter brand of "+(i+1)+". phone: ");
      String brand = str_reader.nextLine();
      handy[i].marka = brand;
      
      System.out.print("Enter model of "+(i+1)+". phone: ");
      String modl = str_reader.nextLine();
      handy[i].model = modl;
      
      System.out.print("Enter storage of "+(i+1)+". phone: ");
      int storage = int_reader.nextInt();
      handy[i].hafiza = storage;
      System.out.println();
    }

    Random random = new Random();
    int rand = random.nextInt(n);
    int randm = random.nextInt(n);
    // check
    handy[0].BilgileriYazdir();
    System.out.println();
    handy[1].BilgileriYazdir();

    System.out.println();
    change(handy[rand], handy[randm]);
    System.out.println("--after random change--\n");
    // check
    handy[0].BilgileriYazdir();
    System.out.println();
    handy[1].BilgileriYazdir();
    System.out.println();
    
    //Object of Samsung class
    Samsung galaxy = new Samsung();
    
    System.out.print("Enter model of your Samsung phone: ");
    String mod = str_reader.nextLine();
    galaxy.model = mod;
    
    System.out.print("Enter storage of your Samsung phone: ");
    int depo = int_reader.nextInt();
    galaxy.hafiza = depo;
    
    System.out.print("Enter speed of your Samsung phone: ");
    int spd = int_reader.nextInt();
    galaxy.hiz = spd;
    
    System.out.print("Enter camera megapixel of your Samsung phone: ");
    int mp = int_reader.nextInt();
    galaxy.kamera= mp;
    
    System.out.println();
    galaxy.BilgileriYazdir();
    galaxy.HizDegerlendir();
    galaxy.KameraDegerlendir();
    
    str_reader.close();
    int_reader.close();
  }
  // change method
  public static void change(SmartPhone x, SmartPhone y){
    SmartPhone temp = new SmartPhone("","",0);
    
    temp.setID(x.getID());
    temp.marka = x.marka;
    temp.model = x.model;
    temp.hafiza = x.hafiza;

    x.setID(y.getID());
    x.marka = y.marka;
    x.model = y.model;
    x.hafiza = y.hafiza;

    y.setID(temp.getID());
    y.marka = temp.marka;
    y.model = temp.model;
    y.hafiza = temp.hafiza;
    
    SmartPhone.count--;
  }
}