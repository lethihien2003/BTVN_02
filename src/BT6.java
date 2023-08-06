//Bai 3.2 Ham tinh dien tich hinh tron ban kinh voi ban kinh r bat ki duoc nhap tu ban phim.(r duoc nhap trong ham main)
import java.util.Scanner;

public class BT6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("\nCHUONG TRINH TINH DIEN TICH HINH TRON");
		System.out.print("\nNhap vao ban kinh r = ");
		float r = sc.nextFloat();
		 
		tinhDT(r);
		System.out.print("Dien tich hinh tron voi ban kinh r = "+r+" la: "+tinhDT(r));
	}
	
	public static double tinhDT(float r) {
		return 3.14*r*r;
		
		
	}
}
