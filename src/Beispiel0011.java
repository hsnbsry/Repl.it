import java.util.Scanner;

public class Beispiel0011 {
    /*
	 * Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden
	 *  bir method(method ismi hackerDili) yazınız.

	Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
	s -> 5
	a -> 4
	e -> 3
	i -> 1
	o -> 0
	 */
    static String ceviri="";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(hackerDili(str));
        scan.close();

    }

    public static String hackerDili(String str) {
        /// Kodunuzu buraya yazınız.
        ceviri= str.replace('s', '5');
        str=ceviri.replace('a', '4');
        ceviri=str.replace('e', '3');
        str=ceviri.replace('i', '1');
        ceviri=str.replace('o', '0');

        return ceviri;
    }
}
