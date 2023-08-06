import java.util.Scanner;

public class BT1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu n = ");
		int n = sc.nextInt();
		
		int a[] = new int [n];
		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"]= ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("\nCac so nguyen duong vua nhap la: ");
		for( int i=0; i<n; i++) {
			System.out.println("a["+i+"]= "+ a[i]);
			
			int s = 0;
			if(a[i]%4==0 || a[i]/100==3) {
				s+=a[i];
				System.out.println("\nTong cac so chia het cho 4 hoac co chu so hang tram la 3: "+s);
			}
		}	
	}
}
