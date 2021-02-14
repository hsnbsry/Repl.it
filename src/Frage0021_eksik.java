import java.util.Scanner;

public class Frage0021_eksik {
    /*
	 * Youtube video sayfasının urlsinde yer alan video id'sini return eden bir method yazınız :

 ÖRNEKLER
youtubeId("https://www.youtube.com/watch?v=XPEr1cArWRg")
ID : XPEr1cArWRg

youtubeId("https://youtu.be/BCDEDi5gDPo")
ID : BCDEDi5gDPo

youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4")
ID : vxP3bY-XxY4
	 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Youtube video adresini yazınız: ");
        String link = scan.next();

        System.out.println("ID : " + youtubeId(link));

        scan.close();
    }


    public static String youtubeId(String link) {
        //// KODUNUZU BURAYA YAZINIZ


        return link;
    }

}
