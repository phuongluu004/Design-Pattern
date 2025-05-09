package Thanhtoan;

public class Main {
    public static void main(String[] args) {
        IThanhToan thanhToanTienMat = new ThanhToanTienMat();
        IThanhToan thanhToanTheTinDung = new ThanhToanTheTinDung();

        thanhToanTienMat.ThanhToan(500000);
        thanhToanTheTinDung.ThanhToan(1500000);
    }
}
