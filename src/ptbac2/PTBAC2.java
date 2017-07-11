package ptbac2;

import java.util.Scanner;

public class PTBAC2 {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        a = NhapSoNguyen("Nhap a: ");
        b = NhapSoNguyen("Nhap b: ");
        c = NhapSoNguyen("Nhap c: ");
        GiaiPTBAC2(a, b, c);
    }

    public static int NhapSoNguyen(String str) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        x = sc.nextInt();
        return x;
    }

    public static void GiaiPTBAC2(int a, int b, int c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                System.out.println("Phuong trinh co 1 nghiem la x = " + (-c / b));
            }
        } else {
            double x1;
            double x2;
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co nghiem x1 = " + x1);
                System.out.println("Phuong trinh co nghiem x2 = " + x2);
            } else {
                System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + (-b / (2 * a)));
            }
        }
    }
}
