package com.notjustmichael.domain.items;

public class Drink extends Item
{
    private String brand;
    private int size;
    private boolean isCarbonated;

    private Drink(Builder builder)
    {
        super();
        this.brand = builder.brand;
        this.size = builder.size;
        this.isCarbonated = builder.isCarbonated;
    }

    public static class Builder
    {
        private String brand;
        private int size;
        private boolean isCarbonated;

        public Builder brand (String brand)
        {
            this.brand = brand;
            return this;
        }

        public Builder size (int size)
        {
            this.size = size;
            return this;
        }

        public Builder isCarbonated (boolean isCarbonated)
        {
            this.isCarbonated = isCarbonated;
            return this;
        }

        public Drink build() {return new Drink(this);}
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public boolean isCarbonated() {
        return isCarbonated;
    }
}

