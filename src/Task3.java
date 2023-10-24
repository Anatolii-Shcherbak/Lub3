import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double a, b, c, discriminant, X1, X2;
        int equality =0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please write A:");
        a = sc.nextDouble();
        while(a == 0)
        { System.out.println("a - can't equal 0, please write other number");a = sc.nextDouble();}

        System.out.println("Please write B:");
        b = sc.nextDouble();

        System.out.println("Please write C:");
        c = sc.nextInt();

        discriminant =(double)(Math.pow(b,2)-(4*a*c));
        if (discriminant > 0) equality = 1;
        if (discriminant < 0) equality = 2;


        switch(equality) {
            case 0:
                X1=((double) (-b) /(2*a));
                System.out.println("x1="+X1);
                break;
            case 1:
                X1=((-b)+Math.sqrt(discriminant)/(2*a));
                X2=((-b)-Math.sqrt(discriminant)/(2*a));
                System.out.println("x1="+X1);
                System.out.println("x2="+X2);
                break;
            case 2:
                System.out.println("No real root");
                break;

        }
    }

}
