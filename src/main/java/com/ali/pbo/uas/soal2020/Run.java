package com.ali.pbo.uas.soal2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ali.pbo.Helper;

public class Run {
    public static Prodi matematika = new Prodi(61, "Matematika", "Universitas Airlangga");
    public static Prodi biologi = new Prodi(62, "Biologi", "Universitas Airlangga");
    public static Prodi kimia = new Prodi(63, "Kimia", "Universitas Airlangga");
    public static Prodi fisika = new Prodi(64, "Fisika", "Universitas Airlangga");
    public static Prodi tekin = new Prodi(65, "Teknik Informatika", "Universitas Airlangga");
    public static Prodi arsitektur = new Prodi(66, "Teknik Arsitektur", "Universitas Airlangga");

    public static Prodi getProdi(int id) {
        switch (id) {
            case 61:
                return matematika;
            case 62:
                return fisika;
            case 63:
                return kimia;
            case 64:
                return biologi;
            case 65:
                return tekin;
            case 66:
                return arsitektur;
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        boolean isRunning = true;

        Scanner scan = new Scanner(System.in);

        List<Mahasiswa> mahasiswaList = new ArrayList<>();

        while (isRunning) {
            Helper.println("1. Tambah entri mahasiswa, 2. Tampilkan data mahasiswa");
            Helper.println("Masukkan pilihan: ");
            int pilihan = scan.nextInt();
            scan.nextLine();

            if (pilihan == 1) {
                Helper.println("Masukkan Universitas: ");
                String universitas = scan.nextLine();

                Helper.println("Masukkan NIM: ");
                String nim = scan.nextLine();

                Helper.println("Masukkan Nama: ");
                String nama = scan.nextLine();

                Helper.println("Masukkan Alamat: ");
                String alamat = scan.nextLine();

                Helper.println("Masukkan Jurusan: ");
                int jurusan = scan.nextInt();
                scan.nextLine();

                Mahasiswa mhs = new Mahasiswa(nim, nama, alamat, jurusan, universitas);
                mahasiswaList.add(mhs);
            } else if (pilihan == 2) {
                Helper.println("Data Mahasiswa: ");
                for (Mahasiswa mhs : mahasiswaList) {
                    Helper.printBorder(20);
                    mhs.tampilMahasiswa();
                }
            }

            Helper.println("Apakah Anda ingin memasukkan data lagi ? (Y) Ya ; (T) Tidak: ");
            String answer = scan.next();

            if (answer.equals("T")) {
                isRunning = false;
            }
        }

    }
}
