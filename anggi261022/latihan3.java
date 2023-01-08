/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anggi26oktober2022;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class latihan3 {
    public static void main(String[] args) {
        
        int nomor;
        int i = 10;
        
        nilai1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai ke"[i])) ;
        nilai2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Kedua Anda")) ;
        nilai3 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Ketiga Anda")) ;
        
        avg = (nilai1 + nilai2 + nilai3)/3;
        
        if (avg >= 60){
            msg1 = "Rata-rata anda adalah "+avg;
            msg2= "Anda Berhasil !";
        }
        else{
            msg1 = "Rata-rata anda adalah "+avg;
            msg2 = "Maaf, Anda Gagal !";
        }
        JOptionPane.showMessageDialog(null, msg1+"\n"+msg2);
    }
}
