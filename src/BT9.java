import java.util.Scanner;

public class BT9 {
	public static void main(String[] args) {
		HocSinh a = new HocSinh();
		HocSinh b = new HocSinh();
		System.out.print("Nhap vao thong tin sinh vien a: \n ");
		a.nhapVao();
		System.out.print("Nhap vao thong tin sinh vien b: \n ");
		b.nhapVao();
		System.out.println("\n");
		
		System.out.println("Thong tin sinh vien da nhap la: \n");
		a.duaRa();
		b.duaRa();
		
		soSanh(a, b);
	
	}
	
	public static void soSanh(HocSinh a, HocSinh b) {
		if(a.diemTB > b.diemTB) {
			System.out.println("Diem TB cua hoc sinh a cao hon hoc sinh b");
		}
		else if(a.diemTB < b.diemTB) {
			System.out.println("Diem TB cua hoc sinh b cao hon hoc sinh a");
			}else {
				System.out.println("Diem TB cua hoc sinh a bang hoc sinh b");
			}
	}
	
}

class HocSinh{
	//Thuoc tinh
	String hoTen;
	String lop; 
	float diemTB;
	
	public void nhapVao() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\tHo ten: ");
		String hoTen = sc.nextLine();
		System.out.print("\tLop: ");
		String lop = sc.nextLine();
		System.out.print("\tDiem TB: ");
		float diemTB = sc.nextFloat();
		
	}

	public void duaRa() {
		System.out.print("\tHo ten: "+hoTen+"\n\tLop: "+lop+"\n\tDiem TB: "+diemTB);
		System.out.println("\n");
	}
	
}


