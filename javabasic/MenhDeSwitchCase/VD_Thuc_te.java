package javabasic.MenhDeSwitchCase;

public class VD_Thuc_te {
    public static void main(String[] args) {
        //nếu đăng nhập là admin thì có 14 quyền , nếu đk = tk khách hàng có 5 quyền, còn không thì thông báo bajn
        // không có quyền đăng nhập

        String Role = "admin1";
        switch(Role){
            case "admin":
                System.out.println("Bạn có thể sử dụng 14 quyền");
                break;
            case "customer":
                System.out.println("Bạn có thể sử dụng 5 quyền");
                break;
            default:
                System.out.println("Bạn không có quyền truy cập");
        }
    }

}
