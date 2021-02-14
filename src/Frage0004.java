import java.util.Scanner;

public class Frage0004 {

    //Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.

    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        int num=scan.nextInt();
        System.out.println(isPrime( num));


        scan.close();
    }


    public static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {

            if (num%i==0) {
                return false;
            }


        }

        return true;
    }
}
