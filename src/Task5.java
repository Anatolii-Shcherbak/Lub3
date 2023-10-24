import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int max = 0, min = 100, trigger=0;

        Random r = new Random();

        while (trigger<=10) {
            int result = r.nextInt(1, 100);
            if (result > max) max = result;
            if (result < min) min = result;
            trigger++;
        }
        System.out.println("Min:"+min);
        System.out.println("Max:"+max);
    }
}
