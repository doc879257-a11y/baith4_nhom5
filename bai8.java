import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        int maxCount = 0;              
        int mostFrequent = a[0];      
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = a[i];
            }
        }
        System.out.println("Phan tu xuat hien nhieu nhat la: " + mostFrequent 
        );
        System.out.println("So " + mostFrequent + " xuat hien " + maxCount + " lan.\n");
    }
}
