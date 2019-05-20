package com.notjustmichael.domain.items;

public class Starter extends Item
{
    private String meat;
    private int size;
    private boolean isVegetarian;

    private Starter(Builder builder)
    {
        super();
        this.meat = builder.meat;
        this.size = builder.size;
        this.isVegetarian = builder.isVegetarian;
    }

    public static class Builder
    {

        private String meat;
        private int size;
        private boolean isVegetarian;

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

        public Builder isVegetarian (boolean isVegetarian)
        {
            this.isVegetarian = isVegetarian;
            return this;
        }

        public Starter build() {return new Starter(this);}
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

    @Override
    public String toString() {
        return "Starter{" +
                "meat='" + meat + '\'' +
                ", size=" + size +
                ", isVegetarian=" + isVegetarian +
                '}';
    }
}

