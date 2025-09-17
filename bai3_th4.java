import java.util.Scanner;

public class bai3_th4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== CHUONG TRINH MAY TINH DON GIAN =====");
        System.out.println("1. Cong");
        System.out.println("2. Tru");
        System.out.println("3. Nhan");
        System.out.println("4. Chia");
        System.out.print("Nhap lua chon (1-4): ");
        int luaChon = sc.nextInt();

        System.out.print("Nhap so thu nhat: ");
        double a = sc.nextDouble();
        System.out.print("Nhap so thu hai: ");
        double b = sc.nextDouble();

        switch (luaChon)
        {
            case 1:
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case 2:
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case 3:
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println(a + " / " + b + " = " + (a / b));
                } else {
                    System.out.println("Khong the chia cho 0!");
                }
                break;
            default:
                System.out.println("Lua chon khong hop le!");
        }
    }
}
