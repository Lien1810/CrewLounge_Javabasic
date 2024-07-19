package javabasic.CauLenhDK;

public class DieuKienIfElse_Coban {
    public static void main(String[] args) {
        int number1 = 10;
        int number2= 20;
        String message = "Add category successful";

// hàm equals để so sánh bằng , hàm contains để so sánh chứa, hàm length lấy độ dài của chuỗi
        if ((number1 < number2) && message.equals("Add success")){
            System.out.println("Thỏa mãn điều kiện");
        }else{
            System.out.println("Không thỏa mãn điều kiện");
        }
    }
    //VD thực tế
    /*
    Kiểm tra màu cảu button = blue và text button = login
    if(color of button equals blue && text of button equals "Login" ){
        //Thực thi nhấn vào nút Login
    }else{
       //Báo lỗi thiết kế của nút button chưa khớp ( not match)
    }
     */
}
