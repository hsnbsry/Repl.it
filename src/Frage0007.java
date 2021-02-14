import java.util.Scanner;

public class Frage0007 {
    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        int num=scan.nextInt();
        System.out.println(sayininTersi(num));


        scan.close();

    }
    public static boolean sayininTersi(int num) {

        int mod=0;
        int ters = 0;
        int x=num;
        while(x>1) {
            mod=x%10;
            x=x/10;

            ters=ters*10+mod;
        }
        System.out.println(num);
        System.out.println(ters);
        if(num>ters) {
            return true;
        }else {
            return false;
        }

    }
}
