import java.util.Arrays;

public class Frage0002 {

//String array dizisindeli 4 harfli kelimeleri return eden methodu yazınız.
    //isFourLetters(["Tomato", "Potato", "Pair"])

    public static void main(String[] args) {

        String s []= {"Tomato", "Potato", "Pair"};

        System.out.println(Arrays.toString(isFourLetters(s)));




    }

    public static String[] isFourLetters(String[] s) {
        String []x= new String[1];
        for (int i = 0; i < s.length; i++)  {
            if (s[i].length()==4) {
                x[0]=s[i];
            }
        }

        return x;

    }

}
