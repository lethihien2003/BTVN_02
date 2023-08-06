/*Bai 3.3 Viết chương trình sử dụng hàm, kiểm tra số N bất kỳ nhập vào từ bàn phím là số lẻ hay số chẵn.
( số N được nhập trong hàm Main ).*/

import java.util.Scanner;

public class BT7 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap vao n = ");
		int n = sc.nextInt();
		kiemTra(n);
		System.out.println("So n = "+n+ " vua nhap la so chan: "+kiemTra(n));
	}
	
	public static boolean kiemTra(int n) {
		return n%2==0;
	}
	
}
