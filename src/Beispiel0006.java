import java.util.Arrays;

public class Beispiel0006 {

    //Bir arrayi tersine çeviren  method yazınız.



    public static void main(String[] args) {
        int arr []= {1, 2, 3, 4};
        reverse (arr);
        System.out.println("return"+ Arrays.toString(arr));

    }

    public static int [] reverse(int[] arr) {

        for (int i =0; i<arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }

        return arr;
    }
}
