//Bai 2.11 Tinh tong S = 1 + 1/2 + 1/3 + ... + 1/n voi n nguyen duong nhap vao tu ban phim.

import java.util.Scanner;

public class BT5 {
	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so nguyen duong n = ");
		n = sc.nextInt();
		
		tinhTong(n);
		System.out.println("Tong S = "+tinhTong(n));
	}
	
	public static float tinhTong(int n) {
		float s=0;
		for(int i=1; i<=n ; i++) {
			s = (float) (s+ 1.0/i);
		}
		return s;
	}
}
