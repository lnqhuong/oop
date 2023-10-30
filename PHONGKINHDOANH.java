import java.util.Scanner;
class PHONGKINHDOANH extends PHONGBAN {
    protected long doanhthu;
    protected String duAnDauTu;
    protected long ngansach;

    // constructor
    public PHONGKINHDOANH () {
        doanhthu = 0;
        duAnDauTu = "";
        ngansach = 0;
    }

    public PHONGKINHDOANH (String maphong, String tenphong, String trgphong, int slnv, long doanhthu, String duAnDauTu, long ngansach) {
        super (maphong, tenphong, trgphong, slnv);
        this.doanhthu = doanhthu;
        this.duAnDauTu = duAnDauTu;
        this.ngansach = ngansach;
    }

    // input 
    public void nhapPhongKD () {
        super.nhapPhongBan();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap doanh thu cua phong Kinh doanh trong thang nay: ");
        doanhthu = sc.nextLong();
        System.out.print("Nhap du an dau tu cua phong Kinh doanh: ");
        duAnDauTu = sc.nextLine();
        System.out.print("Nhap ngan sach dau tu cua phong Kinh doanh: ");
        ngansach = sc.nextLong();
    }

    // output
    public void xuatPhongKD () {
        super.xuatPhongBan();
        System.out.println("Doanh thu cua Phong Kinh doanh: " + doanhthu);
        System.out.println("Du an dau tu cua phong Kinh doanh: " + duAnDauTu);
        System.out.println("Ngan sach cua phong Kinh doanh: " + ngansach);
    }

    // set&get doanh thu
    public long getDoanhThu () {
        return doanhthu;
    }
    public void setDoanhThu (int doanhthu) {
        this.doanhthu = doanhthu;
    }

    // get&set chienDichQuangCao
    public String getChienDichQuangCao () {
        return duAnDauTu;
    }
    public void setChienDichQuangCao (String chienDichQuangCao) {
        this.duAnDauTu = duAnDauTu;
    }
}
