/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan5kambingglobal;

/**
 *
 * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : Kambing global
 */
public class PBO10118045Latihan5KambingGlobal {

    // variabel untuk menampilkan jumlah kambing
    int jumlahKambing = 88;
    
    //method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    public void tambahKambing(){
        jumlahKambing = jumlahKambing +5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }
    public static void main(String[] args) {
        PBO10118045Latihan5KambingGlobal kambingSusu = new PBO10118045Latihan5KambingGlobal();
        
        //menampilkan jumlah kambing yang ada saat program pertama x berjaan
        kambingSusu.getJumlahKambing();
        
        //menambah satu kambing
        kambingSusu.tambahKambing();
        
        //menampilkan Jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
        
    }
    
}
