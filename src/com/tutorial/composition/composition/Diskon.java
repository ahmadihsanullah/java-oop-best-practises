package com.tutorial.composition.composition;

import java.math.BigDecimal;

public interface Diskon {
    String getNama();
    BigDecimal hitungDiskon(Transaksi t);
} 