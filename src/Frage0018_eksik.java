import java.util.Scanner;

public class Frage0018_eksik {
    /*
	 * Ortadaki harfi alabileceğimiz bir program yazın. Eğer harf sayısı 2 nin
	 * katına eşitse, ortadaki 2 harfi alın, diğer durumda ortadaki 1 harfi alın.
	 * Examples

		ortadakiHarf("test")
		Çıktı : es
		ortadakiHarf("testing")
		Çıktı : t
		ortadakiHarf("middle")
		Çıktı : dd
		ortadakiHarf("A")
		Çıktı : A
	 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime yazınız : ");
        String kelime = scan.next();

        System.out.println(ortadakiHarf(kelime));
        scan.close();

    }
    public static String ortadakiHarf(String kelime){




        return kelime;
    }
}
