import java.util.Scanner;

public class Frage0005 {

    //Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazınız


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            String str2=str.replace(' ','a');
            System.out.println(str2);
            sesliHarf(str2);

            sc.close();
        }

        public static void sesliHarf(String str2) {
            str2.trim();
            int count=0;
            for(int i=0;i<str2.length();i++){
                if(str2.charAt(i)!='a' && str2.charAt(i)!='e' && str2.charAt(i)!='i' && str2.charAt(i)!='o' && str2.charAt(i)!='u' ){
                    count++;
                }
            }
            System.out.println("Stringdeki sesli harf sayısı: "+count);
        }
}
