import java.util.Scanner;
public class bai7 {
    public static void main (String args[]) {
         Scanner input = new Scanner (System.in);
         System.out.print("Nhap so phan tu: ");
         int n = input.nextInt();
         int arr[] = new int[n];
         for(int i = 0 ; i < arr.length; i++) {
            System.out.print("Nhap phan tu " + (i+1) + ": "  );
            arr[i] = input.nextInt(); 
         }
         int tong = 0;
         for(int i = 0; i < arr.length; i++) {
            tong += arr[i];
         }
         if (arr.length == 0){
            System.out.print("Mang rong!");
         }
         else if(arr.length == 1) {
            System.out.print("Tong " + arr[0]);
         }
         
         System.out.print("Tong cac phan tu " + tong);
        
         input.close();
    }
}
