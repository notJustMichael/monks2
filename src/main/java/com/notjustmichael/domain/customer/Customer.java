package com.notjustmichael.domain.customer;

import java.util.Objects;

public class Customer {
    private String cAddress, cName, cPhNo, cNo;

    private Customer(Builder builder) {
        this.cNo = builder.cNo;
        this.cAddress = builder.cAddress;
        this.cName = builder.cName;
        this.cPhNo = builder.cPhNo;
    }

    public String getcAddress() {
        return cAddress;
    }

    public String getcName() {
        return cName;
    }

    public String getcPhNo() {
        return cPhNo;
    }

    public static class Builder{
        private String cAddress, cName, cPhNo, cNo;

        public Builder cPhNo( String cPhNo) {
            this.cPhNo = cPhNo;
            return this;
        }

        public Builder cNo (String cNo)
        {
            this.cNo = cNo;
            return this;
        }

        public Builder cName( String cName) {
            this.cName = cName;
            return this;
        }

        public Builder cAddress(String cAddress){
            this.cAddress = cAddress;
            return this;
        }


        public Customer build() {
            return new Customer(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "cAddress='" + cAddress + '\'' +
                    ", cName='" + cName + '\'' +
                    ", cPhNo='" + cPhNo + '\'' +
                    '}';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return cNo.equals(customer.cNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cNo);
    }

}