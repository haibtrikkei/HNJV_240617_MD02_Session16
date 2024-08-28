package demo_bai4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] arr;

        Bai4 b4 = new Bai4();
        Scanner scanner = new Scanner(System.in);

        arr = b4.random_array(scanner);
        b4.display_array(arr);

        arr = b4.sort_ascending(arr);
        System.out.println("Nhap phan tu can tim: ");
        int value_search = scanner.nextInt();

        System.out.println(b4.searchBinary(arr,0,arr.length-1,value_search)?"Co":"Khong co");
    }
}
