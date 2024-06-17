package javabasic.PhuongThuc;

public class Company {
    public static String Company_name = "CrewLounge VietNam";
    public static String Adress = "Ha Noi";
    public static String Phone = "0123456789";
    public static String Email = "admin@crewlounge.aero";

    public static void getInfoCompany(){
        System.out.println("Company name: "+Company_name);
        System.out.println("Adress: "+Adress);
        System.out.println("Phone: "+Phone);
        System.out.println("Email: "+Email);
    }
    public static String getCompany_name(){
        return Company_name;
    }
    public static String getAdress(){
        return Adress;
    }
    public static String getPhone(){
        return Phone;
    }
    public static String getEmail(){
        return Email;
    }
}
