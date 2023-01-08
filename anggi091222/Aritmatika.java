/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anggi091222;

/**
 *
 * @author USER
 */
public class Aritmatika {
    public int tambah(int a, int b) {
        return a+b;
    }
    
    public int kurang(int a, int b) {
        return a-b;
    }
    
    public static void main(String[] args) {
        int a1 = 4;
        int a2 = 6;
        Aritmatika aritmatika = new Aritmatika();
        int hasil = aritmatika.tambah(a1,a2);
        int hasilkurang = Aritmatika.kurang(a1,a2);
    }
}
