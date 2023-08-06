import java.util.Scanner;

public class BT4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao n = ");
		int n = sc.nextInt();
		
		tinhTong(n);
		System.out.println("Tong S = "+tinhTong(n));
	}
	
	public static float tinhGT(int n) {
		float p=1;
		for(int i=1; i<=n; i++) {
			p*=i;
		}
		return p;
	}
	public static float tinhTong(int n) {
		float s=0;
		for(int i=1; i<=n; i++) {
			s+=i/tinhGT(i);
		}
		return s;
	}
}
