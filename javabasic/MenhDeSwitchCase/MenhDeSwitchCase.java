package javabasic.MenhDeSwitchCase;

public class MenhDeSwitchCase {
    public static void main(String[] args) {
        int num = 20;
        switch (num){
            case 10:
                System.out.println(num);
                break;//để thoát câu lệnh Switch, không xét thêm câu lệnh nào nữa
            case 20:
                System.out.println(num);
                break;
            case 30:
                System.out.println(num);
                break;
            default:
                System.out.println("Khong tim thay gia tri trong danh sach");
        }
    }

}
