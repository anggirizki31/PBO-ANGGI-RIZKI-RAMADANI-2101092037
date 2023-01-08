/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anggi.dao;
import anggi.model.*;
import java.util.List;
/**
 *
 * @author USER
 */
public interface PeminjamanDao {
    void save(Peminjaman peminjaman);
    void update(int index,Peminjaman peminjaman);
    void delete (int index); 
    Peminjaman getPeminjaman(int index);
    List<Peminjaman>getAll();

    public List<Peminjaman> getAllPeminjaman();
}
