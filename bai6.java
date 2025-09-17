import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so nguyen a: ");
        int a=sc.nextInt();
        System.out.println("Nhap vao so nguyen b: ");
        int b=sc.nextInt();
        int ucln=UCLN(a,b);
        int bcnn=BCNN(a,b);
        System.out.println("UCLN cua " +a+ " va " +b+" la: "+ucln);
        System.out.println("BCNN cua "+a+" va "+b+" la: "+bcnn);
    }
    public static int UCLN(int a,int b){
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int tg = b;
            b = a % b;
            a = tg;
        }
        return a;
    }
    public static int BCNN(int a,int b){
        return (a*b)/UCLN(a,b);
     }
}
