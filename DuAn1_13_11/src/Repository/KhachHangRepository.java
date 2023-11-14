/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.KhachHang;

import Utilities.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 84386
 */
public class KhachHangRepository {

    public ArrayList<KhachHang> all() {
        ArrayList<KhachHang> kh = new ArrayList<>();

        try {
            Connection conn = DBConnection.getConnection();
            String sql = "select * from khach_hang";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                int id_khach_hang = rs.getInt("id_khach_hang");
                String ho_ten = rs.getString("ho_ten");
                String dia_chi = rs.getString("dia_chi");
                String email = rs.getString("email");
                Date created_at = rs.getDate("created_at");
                Date updated_at = rs.getDate("updated_at");
                String created_by = rs.getString("created_by");
                String updated_by = rs.getString("updated_by");
                String deleted = rs.getString("deleted");
                KhachHang hang = new KhachHang(id_khach_hang, ho_ten, dia_chi, email, created_at, updated_at, created_by, updated_by, deleted);
                kh.add(hang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kh;
    }

}