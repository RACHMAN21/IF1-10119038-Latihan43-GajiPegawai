/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.latihan43.gajipegawai;

/**
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi untuk menampilkan total gaji seorang pegawai
 *                     dengan konsep object oriented
 */

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        GajiPegawai gaji = new GajiPegawai();
        Scanner sc = new Scanner(System.in);
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.print("Nama Karyawan  : ");gaji.setNama(sc.nextLine());
        System.out.print("Alamat         : ");gaji.setAlamat(sc.nextLine());
        System.out.print("Uang Transport : Rp.");gaji.setUangTransport(sc.nextInt());
        System.out.print("Uang Tunjangan : Rp.");gaji.setUangTunjangan(sc.nextInt());
        System.out.print("Gaji Pokok     : Rp.");gaji.setGajiPokok(sc.nextInt());

        System.out.println();

        String nama = gaji.getNama();
        String alamat = gaji.getAlamat();
        int uangTransport = gaji.getUangTransport();
        int uangTunjangan = gaji.getUangTunjangan();
        int gajiPokok = gaji.getGajiPokok();
        int totalGaji = gaji.totalGaji(uangTunjangan,uangTransport,gajiPokok);
        // menampilkan data yang telah di masukkan
        gaji.tampilData(nama,alamat,uangTunjangan,uangTransport,gajiPokok,totalGaji);
    }
}