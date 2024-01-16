package com.tutorial.composition.composition;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Transaksi {
    // composition => merangkai transaksi dengan diskonnya
    private String referensi;
    private LocalDateTime waktuTransaksi;
    private BigDecimal nilai;

    private List<Diskon> daftarDiskon = new ArrayList<>();

    public BigDecimal hitungTotalPembayaran(){
        BigDecimal totalDiskon = BigDecimal.ZERO;
        for(Diskon d : daftarDiskon){
            totalDiskon = totalDiskon.add(d.hitungDiskon(this));
        }
        return nilai.subtract(totalDiskon);
    }

    public void setNilai(BigDecimal nilai) {
        this.nilai = nilai;
    }

    public BigDecimal getNilai() {
        return nilai;
    }

    public static void main(String[] args) {
        // Membuat objek Transaksi
        Transaksi transaksi = new Transaksi();
        transaksi.setNilai(new BigDecimal("100000.00")); // Nilai transaksi sebesar 100.00

        // Membuat objek DiskonProduk dan menambahkannya ke daftarDiskon
        DiskonProduk diskonProduk = new DiskonProduk("buku a", new BigDecimal("0.20"));
        transaksi.daftarDiskon.add(diskonProduk);

        DiskonEvent diskonEvent = new DiskonEvent("ramadhan", new BigDecimal("0.15"));
        transaksi.daftarDiskon.add(diskonEvent);

        // Memanggil metode hitungTotalPembayaran untuk menghitung total pembayaran setelah diskon
        BigDecimal totalPembayaran = transaksi.hitungTotalPembayaran();
        System.out.println("Total Pembayaran setelah Diskon: " + totalPembayaran);
    }

}
