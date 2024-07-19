package javabasic.Bien;
/*
//Biến Static
+ là biến toàn cục
+ Gọi thông qua tên class chấm gọi trực tiếp, không cần khởi tạo đối tượng class
+ Nên cần dùng ở nhiều class dạng public
-Khi nào cần dùng biến static ? >> Khi cần lưu giá trị cố định toàn cục và dùng chung ở nhiều class khác nhau
 thì chúng ta nên dùng biến Staic
 VD: Trong auto Test thì URL , Email, Pw, Browser, mã pin, token
 // Phương thức Static
  - Phương thức ở trạng thái public
  - Đc gọi sử dụng ở nhiều class
  - Gọi phương thức static thông qua tên class chấm gọi trực tiếp
  - Sẽ dùng để viết những hàm xử lý chung
  VD: Hàm lấy giá trị trực tiếp config(getProperty), dùng để khai báo các hàm hành động dạng Keyword trong auto
   vd: Click, Settext, Verify)
  */
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

