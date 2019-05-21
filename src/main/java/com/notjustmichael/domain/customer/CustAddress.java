package com.notjustmichael.domain.customer;

public class CustAddress {
    private String line1, line2, line3;

    public CustAddress (String line1, String line2, String line3)
    {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }

    public String getAd() {
        return  line1 +" \n" + line2 +"\n"+ line3;
    }
}
