import java.util.Scanner;

public class Beispiel0009 {
    //Anagram, bir kelimenin harflerinden başka bir kelime oluşturmaya denir.

    //Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  Java kodunu yazınız.

    public static void main(String[] args){
        Scanner scan=new Scanner (System.in);
        String word1=scan.next();
        String word2=scan.next();
        System.out.println(isAnagram(word1,word2));

        scan.close();
    }
    public static boolean isAnagram(String word1, String word2) {

        //write your code here
        int sum=0;
        for (int i=0;i<word1.length();i++){
            for (int j=0;j<word2.length();j++){
                if(word1.charAt(i)==word2.charAt(j)){
                    sum++;}
            }
        }
        if(word1.length()==word2.length()) {
            if (sum>=word1.length()) {
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }

    }

}
