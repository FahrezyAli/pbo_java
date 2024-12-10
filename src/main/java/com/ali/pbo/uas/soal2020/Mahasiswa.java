package com.ali.pbo.uas.soal2020;

public class Mahasiswa extends Prodi {
    private String nim;
    private String nama;
    private String alamat;
    private int jurusan;

    public Mahasiswa(String nim, String nama, String alamat, int jurusan, String nama_univ) {
        super(Run.getProdi(jurusan).getIdProdi(), Run.getProdi(jurusan).getNamaProdi(), nama_univ);
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    public void tampilMahasiswa() {
        System.out.println("Universitas: " + this.getNamaUniv());
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jurusan: " + this.getNamaProdi());
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setJurusan(int jurusan) {
        this.jurusan = jurusan;
    }

    public int getJurusan() {
        return jurusan;
    }
}
