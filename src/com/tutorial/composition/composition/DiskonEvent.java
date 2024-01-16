package com.tutorial.composition.composition;

import java.math.BigDecimal;

public class DiskonEvent implements Diskon {
    private String name;
    private BigDecimal totalDiskon;

    DiskonEvent(String name, BigDecimal diskon){
        this.name = name;
        this.totalDiskon = diskon;
    }

    @Override
    public String getNama() {
        return name;
    }

    @Override
    public BigDecimal hitungDiskon(Transaksi t) {
        return totalDiskon;
    }
    
}
