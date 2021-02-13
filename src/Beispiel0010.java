import java.util.Arrays;

public class Beispiel0010 {

    /*
     * Verilen array'deki en büyük ve en küçük sayı arasındaki farkı return eden bir method yazınız.
     */

    public static void main(String[] args) {

        int[] nums = {10,15,20,2,10,6};
        System.out.println(farkBul(nums));

    }

    public static int farkBul(int[] nums) {
        Arrays.sort(nums);
        int fark=(nums[nums.length-1]-nums[0]);

        return fark;
    }

}
