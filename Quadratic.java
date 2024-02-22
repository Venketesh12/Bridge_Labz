package Bridge_Labz;
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, D, x1, x2, rp, ip;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        D = b * b - 4 * a * c;

        if (D >= 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);

            System.out.println("Root 1 is " + x1);
            System.out.println("Root 2 is " + x2);
        } else {
            rp = -b / (2 * a);
            ip = (Math.sqrt(-D)) / (2 * a);

            System.out.println("Root 1 is" + rp + "+j(" + ip + ")");
            System.out.println("Root 2 is" + rp + "-j(" + ip + ")");
        }
        sc.close();
    }
}
