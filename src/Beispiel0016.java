import java.util.Scanner;

public class Beispiel0016 {
    /*
	 * Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden bir program yazınız.

Şartlar:
* Bir mail adresinde @ karakteri olmalı
* Bir mail adresinde . (nokta) karakteri olmalı
* Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)
* validateEmail("gmail")
Çıktı : false

validateEmail("hello@gmail")
Çıktı : false

validateEmail("hello@edabit.com")
Çıktı : true
	 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        System.out.println("Çıktı : " +validateEmail(email));

        scan.close();
    }

    public static boolean validateEmail(String s) {






        return true;
    }
}
