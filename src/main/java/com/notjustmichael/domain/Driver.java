package com.notjustmichael.domain;

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


}
