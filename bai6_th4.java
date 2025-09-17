import java.util.Scanner;
public class bai6_th4 {
    public static int ucln(int a, int b)
    {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return Math.abs(a);
    }
    public static int bcnn(int a, int b)
    {
        return Math.abs(a * b) / ucln(a, b);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int a = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = sc.nextInt();
        int gcd = ucln(a, b);
        int lcm = bcnn(a, b);
        System.out.println("UCLN cua " + a + " va " + b + " la: " + gcd);
        System.out.println("BCNN cua " + a + " va " + b + " la: " + lcm);
    }
}
