import java.util.ArrayList;
import java.util.Scanner;

public class bai9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ds = new ArrayList<>();
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            int x = sc.nextInt();
            ds.add(x);
        }
        System.out.println("\nDanh sách các số nguyên:");
        for (int so : ds) {
            System.out.print(so + " ");
        }
        System.out.println();
        sc.close();
    }
}
