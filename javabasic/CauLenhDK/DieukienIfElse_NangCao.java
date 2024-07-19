package javabasic.CauLenhDK;

public class DieukienIfElse_NangCao {
    public static void main(String[] args) {
        double DTB = 4.0;

        if (DTB >= 8.0){
            System.out.println("Học sinh Giỏi!");
        }else if ((DTB >= 6.5) && (DTB < 8)){
            System.out.println("Học sinh Khá!");
        } else if ((DTB >= 5.0) && (DTB < 6.5)) {
            System.out.println("Học sinh Trung Bình!");
        } else {
            System.out.println("Học sinh Yếu");
        }
    }
}
