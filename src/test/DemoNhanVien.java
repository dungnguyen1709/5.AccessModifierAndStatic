package test;

public class DemoNhanVien {
    static {
        System.out.println("OK");
    }
    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien();
        nhanVien.setId(179);
        nhanVien.setName("Dung");
        nhanVien.setPhongBan("C0520K1");
        System.out.println(nhanVien + "-" + nhanVien.COMP + "\n");


    }
}
