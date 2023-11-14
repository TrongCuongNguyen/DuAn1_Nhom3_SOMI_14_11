/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.HoaDon;
import DomainModel.KhachHang;
import DomainModel.NhanVien;
import DomainModel.Vourcher;
import Utilities.DBConnection;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 84386
 */
public class HoaDonRepository {

    public ArrayList<HoaDon> all() {
        ArrayList<HoaDon> hd = new ArrayList<>();
        ArrayList<NhanVien> nv = new ArrayList<>();
        ArrayList<KhachHang> kh = new ArrayList<>();
        ArrayList<Vourcher> vc = new ArrayList<>();

        try {
            Connection conn = DBConnection.getConnection();
            String sql = "select * from hoa_don join khach_hang on hoa_don.id_khach_hang = khach_hang.id_khach_hang \n"
                    + "                     join nhan_vien on hoa_don.id_nhan_vien = nhan_vien.id_nhan_vien \n"
                    + "                    join vourcher on hoa_don.id_voucher = vourcher.id_voucher ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                int id_hoa_don = rs.getInt("id_hoa_don");
                NhanVien id_nhan_vien = new NhanVien(rs.getInt("id_nhan_vien"));
                KhachHang id_khach_hang = new KhachHang(rs.getInt("id_khach_hang"));
                Vourcher id_voucher = new Vourcher(rs.getInt("id_voucher"));
                Date ntt = rs.getDate("ngay_thanh_toan");
                String sdt = rs.getString("sdt");
                String dc = rs.getString("dia_chi");
                Float phiship = rs.getFloat("phi_ship");
                Float tt = rs.getFloat("tong_tien");
                Date ca = rs.getDate("created_at");
                Date ua = rs.getDate("updated_at");
                String cb = rs.getString("created_by");
                String ub = rs.getString("updated_by");
                String d = rs.getString("deleted");
                String httt = rs.getString("hinh_thuc_thanh_toan");
                int trangthai = rs.getInt("trang_thai");

                HoaDon hoadon = new HoaDon(id_hoa_don, id_nhan_vien, id_khach_hang, id_voucher, ntt, sdt, dc, phiship, tt, ca, ua, cb, ub, d, httt, trangthai);
                hd.add(hoadon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hd;
    }
//    public ArrayList<KhachHang> findbytrangthai() {
//        ArrayList<HoaDon> hd = new ArrayList<>();
//        ArrayList<NhanVien> nv = new ArrayList<>();
//        ArrayList<KhachHang> kh = new ArrayList<>();
//        ArrayList<Vourcher> vc = new ArrayList<>();
//
//        try {
//            Connection conn = DBConnection.getConnection();
//            String sql = "select * from khach_hang where trang_thai = 1";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.execute();
//            ResultSet rs = ps.getResultSet();
//            while (rs.next()) {
//                int id_hoa_don = rs.getInt("id_hoa_don");
//                NhanVien id_nhan_vien = new NhanVien(rs.getInt("id_nhan_vien"));
//                KhachHang id_khach_hang = new KhachHang(rs.getInt("id_khach_hang"));
//                Vourcher id_voucher = new Vourcher(rs.getInt("id_voucher"));
//                Date ntt = rs.getDate("ngay_thanh_toan");
//                String sdt = rs.getString("sdt");
//                String dc = rs.getString("dia_chi");
//                Float phiship = rs.getFloat("phi_ship");
//                Float tt = rs.getFloat("tong_tien");
//                Date ca = rs.getDate("created_at");
//                Date ua = rs.getDate("updated_at");
//                String cb = rs.getString("created_by");
//                String ub = rs.getString("updated_by");
//                String d = rs.getString("deleted");
//                String httt = rs.getString("hinh_thuc_thanh_toan");
//                int trangthai = rs.getInt("trang_thai");
//                
//               HoaDon hoadon = new HoaDon(id_hoa_don, id_nhan_vien, id_khach_hang, id_voucher, ntt, sdt, dc, phiship, tt, ca, ua, cb, ub, d, httt, trangthai);
//                hd.add(hoadon);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return hd;
//    }

    public static void main(String[] args) {
        List<HoaDon> lists = new HoaDonRepository().all();
        for (HoaDon x : lists) {
            System.out.println(x.toString());
        }
    }
}
