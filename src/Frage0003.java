import java.util.Arrays;
import java.util.Scanner;

public class Frage0003 {

    //Methoda iki sayı girelim ve  bize bir array dönsün.
    //Array elemanları 1.sayının 2. sayı kadar kendisi ile toplamından oluşsun.
    //Test Data:
    //arrayOfMultiples(7, 5)
    //sonuç: [7,14,21,28,35]

    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in);
        int num=scan.nextInt();
        int length=scan.nextInt();
        System.out.println(Arrays.toString(arrayOfMultiples(num,length)));


        scan.close();

    }

    public static int[] arrayOfMultiples(int num, int length) {

        int arr[]=new int[length];
        for (int i = 0; i < length; i++) {
            arr[i]=num*(i+1);


        }


        return arr;
    }
}
