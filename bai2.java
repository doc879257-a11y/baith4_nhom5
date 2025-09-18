import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap vao so b: ");
        int b = sc.nextInt();
        System.out.print("Nhap vao so c: ");
        int c = sc.nextInt();
        int min = a; 
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        System.out.println("So nho nhat trong 3 so la: " + min);
    }
}
