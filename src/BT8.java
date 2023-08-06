import java.util.Scanner;

public class BT8 {
	public static void main(String[] args) {
		SinhVien sv = new SinhVien();
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhap vao so luong sinh vien n = ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		for(int i=1; i<=n; i++) {
			System.out.print("\nNhap vao thong tin sinh vien\n");
			System.out.print("Sinh vien thu "+i+": \n");
			sv.nhapVao();	
		}
		
		System.out.println("\nThong tin sinh vien da nhap la: ");
		for(int i=1; i<=n; i++) {
			System.out.print("Sinh vien thu "+i+": \n");
			sv.duaRa();	
			System.out.println("\n");
		}
		
		System.out.println("\n");
		System.out.print("sv = "+sv.getLop());
		sv.setHoTen("L");
		System.out.print("Ho ten cua sv = "+sv.getHoTen());
	
	}
}

class SinhVien{
	//Thuoc tinh
	String hoTen;
	String gioiTinh;
	String lop;
	String khoa;
	String truong;
	String queQuan;
	int namSinh;
	int tuoi;
	int maSV;
	float diemTB;
	
	
	//Constructor
	public SinhVien() {

	}

	public SinhVien(String hoTen, String gioiTinh, String queQuan, int namSinh) {
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.queQuan = queQuan;
		this.namSinh = namSinh;
	}

	public SinhVien(String hoTen, String lop, String truong, int maSV, float diemTB) {
		this.hoTen = hoTen;
		this.lop = lop;
		this.truong = truong;
		this.maSV = maSV;
		this.diemTB = diemTB;
	}

	public SinhVien(String hoTen, String gioiTinh, String lop, String khoa, String truong, int maSV, float diemTB) {
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.lop = lop;
		this.khoa = khoa;
		this.truong = truong;
		this.maSV = maSV;
		this.diemTB = diemTB;
	}

	public SinhVien(String hoTen, String gioiTinh, String lop, String khoa, String truong, String queQuan, int namSinh,
			int tuoi, int maSV, float diemTB) {
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.lop = lop;
		this.khoa = khoa;
		this.truong = truong;
		this.queQuan = queQuan;
		this.namSinh = namSinh;
		this.tuoi = tuoi;
		this.maSV = maSV;
		this.diemTB = diemTB;
	}
	
	
	//Phuong thuc getter, setter
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public String getTruong() {
		return truong;
	}

	public void setTruong(String truong) {
		this.truong = truong;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	} 
	
	//Nhap vao
	public static void nhapVao() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\tHo ten: ");
		String hoTen = sc.nextLine();
		System.out.print("\tGioi tinh: ");
		String gioiTinh = sc.nextLine();
		System.out.print("\tLop: ");
		String lop = sc.nextLine();
		System.out.print("\tKhoa: ");
		String khoa = sc.nextLine();
		System.out.print("\tTruong: ");
		String truong = sc.nextLine();
		System.out.print("\tQue quan: ");
		String queQuan = sc.nextLine();
		System.out.print("\tNam sinh: ");
		int namSinh = sc.nextInt();
		System.out.print("\tTuoi: ");
		int tuoi = sc.nextInt();
		System.out.print("\tMa sinh vien: ");
		int maSV = sc.nextInt();
		System.out.print("\tDiem TB: ");
		float diemTB = sc.nextFloat();
		
	}
	
	//Dua ra
	public void duaRa() {
		System.out.print("\tHo ten: "+hoTen+"\n\tGioi tinh: "+gioiTinh+"\n\tLop: "+lop+"\n\tKhoa: "+khoa+"\n\tTruong: "+truong+"\n\tQue quan: "+queQuan+"\n\tNam sinh: "+namSinh+"\n\tTuoi: "+tuoi+"\n\tMa sinh vien: "+maSV+"\n\tDiem TB: "+diemTB);
		
	}
	
}
	
