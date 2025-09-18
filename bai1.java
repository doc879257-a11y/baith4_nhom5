import java.util.Scanner;
public class bai1 {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so:");
        int so = input.nextInt();
        
            if(so<0){
                System.out.println("So Am");
            }
            else if(so>0) {
                System.out.println("So Duong");
            }
            else {
                System.out.println("Bang 0");
            } 
        input.close();    
    }
}
