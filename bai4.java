import java.util.Scanner;

public class bai4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so n:");
        int n  = input.nextInt();
        int tong=tinhtong(n);
        System.out.println("Tong cac so tu 1 den " + n + " la " + tong);

        input.close();
    }

    public static int  tinhtong(int so) {
        if(so<1) return 0;
        int tong = 0;
        for(int i=1; i <= so ; i++) {
            tong += i;
        }
        return tong;
    }
}