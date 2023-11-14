/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

import java.util.Date;

/**
 *
 * @author 84386
 */
public class KhachHang  {

    private int id_khach_hang;

    private String ho_ten;

    private String dia_chi;

    private String email;

    private Date created_at;

    private Date updated_at;

    private String created_by;

    private String updated_by;

    private String deleted;

    public KhachHang() {
    }

    public KhachHang(int id_khach_hang, String ho_ten, String dia_chi, String email, Date created_at, Date updated_at, String created_by, String updated_by, String deleted) {
        this.id_khach_hang = id_khach_hang;
        this.ho_ten = ho_ten;
        this.dia_chi = dia_chi;
        this.email = email;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.created_by = created_by;
        this.updated_by = updated_by;
        this.deleted = deleted;
    }

    public KhachHang(int id_khach_hang, String ho_ten) {
        this.id_khach_hang = id_khach_hang;
        this.ho_ten = ho_ten;
    }

    public KhachHang(int id_khach_hang) {
        this.id_khach_hang = id_khach_hang;
    }

    public int getId_khach_hang() {
        return id_khach_hang;
    }

    public void setId_khach_hang(int id_khach_hang) {
        this.id_khach_hang = id_khach_hang;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return String.valueOf(id_khach_hang);
    }

//    public KhachHang(String id) {
//        this.id_khach_hang = id_khach_hang;
//    }
//
//    public KhachHang(String id, String ten) {
//        this.id_khach_hang = id_khach_hang;
//        this.ho_ten = ho_ten;
//    }

}
