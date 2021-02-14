import java.util.Scanner;

public class Frage0012 {
    private static final String[] tensNames = {"", " ten"," twenty"," thirty"," forty"," fifty"," sixty"," seventy"," eighty"," ninety"};
    private static final String[] numberNames = {""," one"," two"," three"," four"," five"," six"," seven"," eight"," nine"," ten"," eleven"," twelve"," thirteen"," fourteen"," fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};


    public static void main(String[] args) {
        // Girilen sayının ingilizce yazılışını return eden bir method yazınız  numToEng(0)=zero
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        System.out.println(sayi);
        numToEng(sayi);
        scan.close();
    }

    public static void numToEng(int sayi) {
        int birler = 0;
        int onlar = 0;


        if (sayi < 10) {
            birler = sayi % 10;
            System.out.println(numberNames[birler]);
        } else {
            birler = sayi % 10;
            onlar = sayi / 10;
            System.out.println(tensNames[onlar] + numberNames[birler]);
        }
    }
}
