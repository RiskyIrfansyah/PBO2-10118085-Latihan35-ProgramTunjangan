/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author Risky
 * Nama     : Risky Irfansyah
 * Kelas    : PBO2
 * Nim      : 10118085
 * Deskripsi Tugas : Program Tunjangan
 */
public class ProgramTunjangan {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Pegawai pegawai = new Pegawai();
        
        System.out.println("======= Program Tunjangan =======");
        System.out.print("Berapa gahi pokok anda perbulan? : Rp. ");
        pegawai.setGaji(scanner.nextDouble());
        System.out.print("Status Anda? (Menikah/Belum)\t: ");
        pegawai.setStatus(scanner.next());
        pegawai.tampilHasilPerhitungan();
                
    }
}
