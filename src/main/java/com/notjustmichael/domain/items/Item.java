package com.notjustmichael.domain.items;


public class Item {
    private String itemNo;
    private double price;
    private int avail;
    private String desc;

    protected Item(){
        price = 0.00;
        avail = 0;
        desc = "undefined";
    }

    private Item(Builder builder){
        this.itemNo = builder.itemNo;
        this.price = builder.price;
        this.avail = builder.avail;
        this.desc = builder.desc;
    }

    public static class Builder{
        private String itemNo;
        private double price;
        private String desc;
        private int avail;

        public Builder price (double price)
        {
            this.price = price;
            return this;
        }

        public Builder itemNo (String itemNo)
        {
            this.itemNo = itemNo;
            return this;
        }

        public Builder avail (int avail)
        {
            this.avail = avail;
            return this;
        }

        public Builder desc (String desc)
        {
            this.desc = desc;
            return this;
        }

        public Item build() {return new Item(this); }



    }

    public String getItemNo() {return itemNo;}

    public String getDesc() {
        return desc;
    }

    public double getPrice() {
        return price;
    }

    public int getAvail() {
        return avail;
    }
}
