package com.tutorial.composition.composition;

import java.math.BigDecimal;

public class DiskonProduk implements Diskon {
    private String namaProduk;
    private BigDecimal nilaiDiskon;

    // Konstruktor
    public DiskonProduk(String namaProduk, BigDecimal nilaiDiskon) {
        this.namaProduk = namaProduk;
        this.nilaiDiskon = nilaiDiskon;
    }

    @Override
    public String getNama() {
        return "Diskon Produk untuk " + namaProduk;
    }

    @Override
    public BigDecimal hitungDiskon(Transaksi t) {
        // Implementasi perhitungan diskon untuk produk tertentu
        // Misalnya, diskon tetap untuk setiap produk
        return nilaiDiskon ;
    }
}
