import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen: ");
        int n=sc.nextInt();
        if(laSoNguyen(n))
            System.out.println(n+" la so nguyen to.");
        else
            System.out.println(n+" khong la so nguyen to.");
    }
    public static boolean laSoNguyen(int n){
        if (n<2)
            return false;
        for(int i=2;i<n;i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
}
