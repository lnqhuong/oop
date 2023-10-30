import java.util.Scanner;
class PHONGBAN {
    protected String maphong; // 5 ki tu
    protected String tenphong; // ten phong
    protected String trgphong; // ten truong phong
    protected static int slnv; // so luong nhan vien

    // constructor 
    public PHONGBAN () {
    }

    public PHONGBAN (String maphong, String tenphong, String trgphong, int slnv)
    {
        this.maphong=maphong;
        this.tenphong=tenphong;
        this.trgphong=trgphong;
        this.slnv=slnv;
    }

    // input
    public void nhapPhongBan ()
    {
        Scanner sc = new Scanner(System.in);
        // kiem tra dieu kien ma phong co 5 ki tu
        do {
            System.out.print("Nhap ma phong (5 ki tu): ");
            maphong=sc.nextLine();
            if (maphong == null || maphong.length() != 5)
                System.out.println("Vui long nhap lai ma phong co 5 ki tu...");
        } while (maphong == null || maphong.length() != 5);
        System.out.print("Nhap ten phong: ");
        tenphong = sc.nextLine();
        System.out.print("Nhap ten truong phong: ");
        trgphong = sc.nextLine();
        // kiem tra dieu kien so luong nhan vien phai > 0
        do {
            System.out.print("Nhap so luong nhan vien trong phong ban: ");
            slnv = sc.nextInt();
            if (slnv < 0)
                System.out.println("So luong nhan vien khong hop le, vui long nhap lai...");
        } while (slnv < 0);
    }

    // output
    public void xuatPhongBan () {
        System.out.println("MaPhong: " +maphong+ " TenPhong: " +tenphong+ " TruongPhong: " +trgphong+ " SLNhanvien: " +slnv);
    }
    // get&set maphong
    public String getMaphong () {
        return maphong;
    }
    public void setMaphong (String maphong) {
        this.maphong=maphong;
    }

    // get&set tenphong
    public String getTenphong () {
        return tenphong;
    }
    public void setTenphong (String tenphong) {
        this.tenphong=tenphong;
    }

    // get&set trgphong
    public String getTrgphong () {
        return maphong;
    }
    public void setTrgphong (String trgphong) {
        this.trgphong=trgphong;
    }

    // get&set slnv (so luong nhan vien)
    public int getSLNV () {
        return slnv;
    }
    public void setSLNV (int slnv) {
        this.slnv=slnv;
    }
}