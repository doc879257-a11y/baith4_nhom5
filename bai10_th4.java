import java.util.ArrayList;
import java.util.Scanner;
public class bai10_th4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu ban dau: ");
        int n = sc.nextInt();
        ArrayList<Integer> ds = new ArrayList<>();
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            ds.add(sc.nextInt());
        }
        System.out.println("\n===== LUA CHON =====");
        System.out.println("1. Them phan tu");
        System.out.println("2. Xoa phan tu");
        System.out.print("Nhap lua chon: ");
        int chon = sc.nextInt();
        switch (chon)
        {
            case 1:
                System.out.print("Nhap vi tri muon them: ");
                int vtThem = sc.nextInt();
                System.out.print("Nhap gia tri can them: ");
                int giaTri = sc.nextInt();
                if (vtThem >= 0 && vtThem <= ds.size()) {
                    ds.add(vtThem, giaTri);
                } else {
                    System.out.println("Vi tri khong hop le!");
                }
                break;
            case 2:
                System.out.print("Nhap vi tri muon xoa: ");
                int vtXoa = sc.nextInt();
                if (vtXoa >= 0 && vtXoa < ds.size()) {
                    ds.remove(vtXoa);
                } else {
                    System.out.println("Vi tri khong hop le!");
                }
                break;
            default:
                System.out.println("Lua chon khong hop le!");
        }
        System.out.println("\nDanh sach sau khi thay doi:");
        for (int x : ds) {
            System.out.print(x + " ");
        }
    }
}
