import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float firstNumber, secondNumber, sum, dif, pr, quot;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        firstNumber= sc.nextFloat();

        System.out.println("Enter second number: ");
        secondNumber = sc.nextFloat();

        sum = firstNumber+secondNumber;
        dif= firstNumber-secondNumber;
        pr = firstNumber*secondNumber;
        quot = firstNumber/secondNumber;

        BigDecimal Sum = new BigDecimal(sum);
        Sum = Sum.setScale(2, RoundingMode.HALF_UP);

        BigDecimal Dif = new BigDecimal(dif);
        Dif = Dif.setScale(2, RoundingMode.HALF_UP);

        BigDecimal Pr = new BigDecimal(pr);
        Pr = Pr.setScale(2, RoundingMode.HALF_UP);

        BigDecimal Quot = new BigDecimal(quot);
        Quot = Quot.setScale(2, RoundingMode.HALF_UP);

        System.out.println("Addition: "+ Sum);
        System.out.println("difference: "+Dif);
        System.out.println("product: "+ Pr);
        System.out.println("quotient: "+ Quot);

        sc.close();
    }
}
