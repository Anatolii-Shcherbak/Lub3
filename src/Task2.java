import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double Weight, Height, IBM;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please write your Weith:");
        Weight = sc.nextFloat();
        System.out.println("Please write your Height:");
        Height = sc.nextFloat();
        IBM = Weight/(Math.pow((Height/100),2));
        System.out.println("IBM index: "+IBM);

        if(IBM == 16){System.out.println("Starvation");}

        else if(IBM > 16 && IBM <= 16.9){System.out.println("Emaciation");}

        if(IBM >= 17 && IBM <= 18.49){System.out.println("Underweight");}

        if(IBM >= 18 && IBM <= 22.9){System.out.println("Normal, low range");}

        if(IBM >= 23 && IBM <= 24.9){ System.out.println("Normal, high range");}

        if(IBM >= 25 && IBM <= 27.49){System.out.println("Overweight, low range");}

        if(IBM >= 27.50 && IBM <= 29.9){System.out.println("Overweight, high range");}

        if(IBM >= 30 && IBM <= 34.9){System.out.println("1st degree obesity");}

        if(IBM >= 35 && IBM <= 39.9){System.out.println("2nd degree obesity");}
    }
}
