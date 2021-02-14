import java.util.Scanner;

public class Frage0008 {
    /*
	 * Bir palindrom, madam veya racecar veya 10801 sayısı gibi ileriye doğru geriye doğru okuyan bir
	 * kelime, sayı, kelime öbeği veya diğer karakter dizisidir.

		Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın
	 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        word = word.toLowerCase().replace(" ", "");

        String str="";
        for(int i=word.length()-1;i>=0;i--){
            str=str+word.charAt(i);
        }
        if (word.equals(str)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


        scan.close();
    }

}
