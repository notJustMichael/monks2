package com.notjustmichael.domain.driver;

import java.util.Objects;

public class Driver {
    private String dNo, dName, dPhNo;

    private Driver(Builder builder) {
        this.dNo = builder.dNo;
        this.dName = builder.dName;
        this.dPhNo = builder.dPhNo;
    }

    public String getdNo() {
        return dNo;
    }

    public String getdName() {
        return dName;
    }

    public String getdPhNo() {
        return dPhNo;
    }

    public static class Builder{
        private String dNo, dName, dPhNo;

        public Builder dPhNo( String dPhNo) {
            this.dPhNo = dPhNo;
            return this;
        }

        public Builder dName( String dName) {
            this.dName = dName;
            return this;
        }

        public Builder dNo(String dNo){
            this.dNo = dNo;
            return this;
        }


        public Driver build() {
            return new Driver(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "dNo='" + dNo + '\'' +
                    ", dName='" + dName + '\'' +
                    ", dPhNo='" + dPhNo + '\'' +
                    '}';
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return dNo.equals(driver.dNo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dNo);
    }

}
