package demo_bai4;

import java.util.Random;
import java.util.Scanner;

public class Bai4 {
    public int[] random_array(Scanner scanner){
        int n;
        int arr[];
        do{
            System.out.println("Nhập số phần tử của mảng: ");
            try{
                n = Integer.parseInt(scanner.nextLine());
                if(n<1)
                    System.out.println("Số phần tử phải >0");
                else
                    break;
            }catch (Exception e){
                System.out.println("Số phần tử phải là số dương");
            }
        }while (true);

        arr = new int[n];
        Random r = new Random();
        for(int i=0;i<n;i++){
            arr[i] = r.nextInt(1,500);
        }
        return  arr;
    }

    public int[] sort_ascending(int[] arr){
        boolean needForNext = true;
        for(int i=1;i<arr.length && needForNext;i++){
            needForNext = false;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int tg = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tg;

                    needForNext = true;
                }
            }
        }
        return arr;
    }

    public void display_array(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
            if((i+1)%25==0)
                System.out.println();
        }
        System.out.println();
    }

    public boolean searchBinary(int[] arr, int low, int hight, int value){
        if(low>hight){
            return false;
        }
        int mid = (low+hight)/2;
        if(value==arr[mid])
            return true;
        else{
            if(value>arr[mid])
                return searchBinary(arr,mid+1,hight,value);
            else
                return searchBinary(arr,low,mid-1,value);
        }
    }
}
