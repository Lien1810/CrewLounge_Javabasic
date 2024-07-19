package javabasic.Collection;

import java.util.ArrayList;

public class VD_ArrayList {
    public static void main(String[] args) {
        //Khai báo ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        //Thêm phần tử vào Array List
        arrayList.add("Nga");
        arrayList.add("Linh");
        arrayList.add("Trang");
        arrayList.add("Bảo");
        //Theem 1 phan tu vào ham co san
        arrayList.add(2, "Hoàng"); //thêm vào vị trí index 2 tên Hoàng
        //Duyệt phần tử trong ArrayList
        System.out.println("Danh sách lớp gồm: " + arrayList);

        //Dùng vòng lặp for
        for (int i =0; i< arrayList.size(); i++){   //.size tương đương với .length, để lấy độ dài của mảng
            System.out.println(arrayList.get(i)); //Hàm get để truy xuất các phân tử bên trong
        }

        //Kbao ArrayList2
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Nguyên");
        arrayList2.add("Bảo");

        //Add tat ca ArrayList2 sang ArrayList1
        arrayList.addAll(arrayList2);
        //Chạy lại vòng lặp
        System.out.println("----------------------------------------------------------");
        for (int i =0; i< arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        /*
        //Remove 1 phần tử trong ArrayList
        arrayList.remove("Trang"); //remove theo giá tri
        System.out.println("----------------------------------------------------------");
        for (int i=0; i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        arrayList.remove(0); //remove theo index ( vị trí)
        System.out.println("--------------------------------------------------------");
        for (int i=0; i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
         */
        //remove theo điều kiện
        for (int i=0; i < arrayList.size(); i++){
            if (arrayList.get(i).equals("Bảo")){
                arrayList.remove(i);
            }
        }
        System.out.println("--------------------------------------------------");
        for (int i=0; i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        // Tìm kiếm giá trị phần tử
        System.out.println(arrayList.contains("Nguyên")); //Hàm contains để tìm kiếm, giá trị đúng là True, sai là False


    }
}
