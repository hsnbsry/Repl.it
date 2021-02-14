import java.util.Scanner;

public class Frage0014 {
    /*
	 * İki farklı kelimeyi birleştirip, ilk harfini büyük kalan harfleri küçük yapan bir method yazınız.
	 *
		Örnekler
		getKelime("kal", "em") ? "Kalem"
		getWord("gözl", "emlemek") ? "Gözlemlemek"
		getWord("zor", "luk") ? "Zorluk"
	 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk kelimeyi giriniz : ");
        String ilk = scan.next();

        System.out.println("İkinci kelimeyi giriniz : ");
        String iki = scan.next();


        System.out.println(getKelime(ilk,iki));
        scan.close();
    }

    public static String getKelime(String ilk, String iki) {
        String son="";

        son=ilk.substring(0, 1).toUpperCase()+ilk.substring(1).toLowerCase()+iki.toLowerCase();


        return son;
    }
}
