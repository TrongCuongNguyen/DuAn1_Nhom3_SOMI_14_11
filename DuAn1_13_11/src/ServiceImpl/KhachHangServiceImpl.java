/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImpl;

import DomainModel.KhachHang;
import Repository.KhachHangRepository;
import java.util.ArrayList;

/**
 *
 * @author 84386
 */
public class KhachHangServiceImpl {
    KhachHangRepository repository;

    public KhachHangServiceImpl() {
        this.repository = new KhachHangRepository();
    }

    public ArrayList<KhachHang> all() {
        return this.repository.all();
    }
}
