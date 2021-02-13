public class Beispiel0017 {
    /*
	 * String içindeki birden fazla geçen karakter sayısını bulan program yazınız.
	 *  Mesela "Merhaba" kelimesinde sadece a harfi tekrar ettiği için bu String için
	 *  sonuç 1 olacak. Eğer herhangi tekrar eden bir harf yoksa 0 sayısını döndersin program.
	 *  Örnekler:
		duplicates("Hello World!")
		Çıktı : 3
		duplicates("foobar")
		Çıktı : 1
		duplicates("helicopter")
		Çıktı : 1
	 */


    public static void main(String[] args) {
        String str = "Merhaba";


        System.out.println("Çıktı : " + duplicates(str));
    }


    public static int duplicates(String str) {
        int count=0;
        int x=0;
        for(int i=0;i<str.length()-1;i++) {
            for(int k=i+1;k<str.length();k++) {
                if(str.substring(i, k)==str.substring(k, k+1)) {
                    count++;
                }
            }
        }if(count>0) {
            x++;
        }


        return count;
    }
}
