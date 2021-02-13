import java.util.Scanner;

public class Beispiel0013 {
    //Girilen metindeki tüm kelimelerin ilk harflerini büyük yapınız.(diğer harflere dokunmayın, büyükse büyük, küçükse küçük kalsın).
	/*
	 * Örnek
		makeTitle("Bu bir başlıktır")
		Bu Bir Başlıktır

		makeTitle("tüm ilk harfler büyük olacak")
		Tüm İlk Harfler Büyük Olacak
	 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(makeTitle(scan.next()));
        scan.close();
    }

    public static String makeTitle(String s) {
        return s;


    }

}
