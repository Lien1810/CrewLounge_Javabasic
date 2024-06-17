package javabasic.Bien;

public class Bientoancuc {
    String name = "Lan Phuong";
//    int age = 20;
//    String adress = "Ha Noi";

   public void getInfo() {
       System.out.println("Name: " + name);
}
    public static void main(String[] args) {
    Bientoancuc bientc = new Bientoancuc();
    System.out.println(" "+ bientc.name);
    }
}

