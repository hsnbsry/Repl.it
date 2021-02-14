import java.util.Scanner;

public class Frage0001 {

    /*
     * Kredi kartı numarası alan ve yalnızca son dört karakteri görüntüleyen bir method yazın.
     *  Kart numarasının geri kalanı ************ ile değiştirilmelidir.
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        String c=scan.next();
        System.out.println(cardHide(c));

        scan.close();
    }

    public static String cardHide(String c) {

        String sayi=c.substring(c.length()-4);
        String yildiz=c.substring(0, c.length()-4);
        String yeni=yildiz.replaceAll("\\d", "*").concat(sayi);


        return yeni;
    }
}
