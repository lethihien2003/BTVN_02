import java.util.Scanner;

public class BT2 {
	
	public static void main(String[] args) {
		int m,n,k;
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("Nhap vao m = ");
		m = sc.nextInt();
		System.out.print("Nhap vao n (voi n<=m) = ");
		n = sc.nextInt();
		System.out.print("Nhap vao k = ");
		k = sc.nextInt();
		
		tinhTong(m,n,k);
		System.out.println("\nTong ca so chia het cho "+k+" trong khoang tu "+n+" den "+m+" la: "+tinhTong(m,n,k));
	}
	
	public static int tinhTong(int m, int n, int k) {
		int s=0;
		if(m>=n) {
			for(int i=n; i<=m; i++) {
				if(i%k == 0) {
					s+=i;
				}
			}
		}
		return s;
	}
}
