import java.util.Scanner;

public class Frage0022_Fibonacci {
    public static void main(String[] args) {
        //Kullanicidan 1 sayi alalim ve o sayi kadar arda arda gelen fibonacci sayi dizisini yazdiralim.
        //girilen sayi: 10 ==>> 0 1 1 2 3 5 8 13 21 34

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz ");
        int sy=input.nextInt();

        int sayi1=0;
        int sayi2=1;
        int count=0;
        System.out.print(sayi1+" "+sayi2+" ");

        for (int i = 2; i <= sy; ++i) {
            count =sayi1+sayi2;
            sayi1=sayi2;
            sayi2=count;
            System.out.print(count+" ");


        }



        input.close();
    }
}
