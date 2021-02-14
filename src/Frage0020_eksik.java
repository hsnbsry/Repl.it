import java.util.Scanner;

public class Frage0020_eksik {
    /*
	 * Fazla mesaiyi hesaplayan bir program yazınız.
	Yazacağınız program toplam kazancı return etsin.

	Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve fazla mesaiye
	 kalırsa kazancını kaç ile katlayacağını alalım.

	Daha sonra şu şekilde bir program yazınız :

	Örnek :
	saatlik çalışma ücreti : 40.0
	hangi saat başladı : 9.0
	hangi saat bitti : 20.0
	mesaiyi kaçla katlayacağız : 1.8

	ucretHesapla(9.0,20.0,40.0,1.8);

	9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
	17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

	toplam = 536.0
	 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("saatlik çalışma ücreti : ");
        double saatlikUcret = scan.nextInt();

        System.out.println("hangi saat başladı : ");
        double baslangic = scan.nextInt();

        System.out.println("hangi saat bitti : ");
        double bitis = scan.nextInt();


        System.out.println("mesaiyi kaçla katlayacağız : ");
        double oran = scan.nextFloat();

        double kazanc = ucretHesapla(baslangic,bitis,saatlikUcret,oran);

        System.out.println("toplam = " + kazanc);

        scan.close();
    }

    public static double ucretHesapla(double baslangic, double bitis, double saatlikUcret, double oran)
    {


        return baslangic;
    }


}
