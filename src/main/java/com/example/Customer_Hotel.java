package com.example;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;


class CustomerHotel {
    private String noKtp;
    private String nama;
    private String alamat;
    private String nomorKamar;
    private Date waktuCheckin;
    private Date waktuCheckout;
    private ArrayList<String> pesananMakanan;

    public CustomerHotel(String noKtp, String nama, String alamat, String nomorKamar) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.alamat = alamat;
        this.nomorKamar = nomorKamar;
        this.waktuCheckin = new Date(); // Set waktu check-in saat objek dibuat
        this.pesananMakanan = new ArrayList<>();
    }

    public void tambahPesananMakanan(String pesanan) {
        pesananMakanan.add(pesanan);
    }

   public void informasiPembayaran(double totalBiaya) {
        System.out.println("Informasi Pembayaran:");
        System.out.println("Nama: " + nama);
        System.out.println("Nomor Kamar: " + nomorKamar);

        // Mengubah total biaya menjadi format Rupiah (IDR)
        Locale localeID = new Locale("in", "ID");
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(localeID);
        String formattedTotalBiaya = rupiahFormat.format(totalBiaya);

        System.out.println("Total Biaya: " + formattedTotalBiaya);
    }

    public void infoTamu() {
        System.out.println("Informasi Tamu:");
        System.out.println("No. KTP: " + noKtp);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Kamar: " + nomorKamar);
        System.out.println("Waktu Check-in: " + waktuCheckin);
        System.out.println("Waktu Check-out: " + waktuCheckout);
    }

    public Date getWaktuCheckout() {
        return waktuCheckout;
    }

    public void setWaktuCheckout(Date waktuCheckout) {
        this.waktuCheckout = waktuCheckout;
    }

    public static void main(String[] args) {
        CustomerHotel customer = new CustomerHotel("20210140002", "Aldi Septiyanto", "jl.Pasopati Banguntapan, Bantul, Yogyakarta", "E101");

        customer.tambahPesananMakanan("Nasi Goreng");
        customer.tambahPesananMakanan("Es Teh");

        customer.infoTamu();
        System.out.println("Pesanan Makanan: " + customer.pesananMakanan);

        // Simulasi waktu check-out
        Date waktuCheckout = new Date();
        customer.setWaktuCheckout(waktuCheckout);

        double totalBiaya = 750000; // Contoh total biaya
        customer.informasiPembayaran(totalBiaya);
    }
}
