package com.notjustmichael.domain.items;

public class Entree extends Item
{
    private String meat;
    private int size;
    private boolean isVegetarian;
    private double price;



    private Entree(Builder builder)
    {
        super();
        this.price = builder.price;
        this.meat = builder.meat;
        this.size = builder.size;
        this.isVegetarian = builder.isVegetarian;
    }

    public static class Builder
    {

        private String meat;
        private int size;
        private boolean isVegetarian;
        private double price;

        public Builder meat (String meat)
        {
            this.meat = meat;
            return this;
        }

        public Builder size (int size)
        {
            this.size = size;
            return this;
        }

        public Builder price (double price)
        {
            this.price = price;
            return this;
        }

        public Builder isVegetarian (boolean isVegetarian)
        {
            this.isVegetarian = isVegetarian;
            return this;
        }

        public Entree build() {return new Entree(this);}
    }

    public String getMeat() {
        return meat;
    }

    public int getSize() {
        return size;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getPrice() {return price;}

    @Override
    public String toString() {
        return "Entree{" +
                "meat='" + meat + '\'' +
                ", size=" + size +
                ", isVegetarian=" + isVegetarian +
                '}';
    }
}

