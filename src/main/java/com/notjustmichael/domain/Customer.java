package com.notjustmichael.domain;

public class Customer {
    private String cAddress, cName, cPhNo;

    private Customer(Builder builder) {
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
        private String cAddress, cName, cPhNo;

        public Builder cPhNo( String cPhNo) {
            this.cPhNo = cPhNo;
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


}