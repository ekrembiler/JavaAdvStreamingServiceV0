package be.pxl.ja.streamingservice.model;

import java.math.BigDecimal;

public enum StreamingPlan {
    BASIC(1,7.99),
    STANDAARD(2,11.99),
    PREMIUM(4,15.99);


    private int numberOfProfiles;
    private Double price;

    StreamingPlan(int numberOfProfiles, double price){
        this.numberOfProfiles = numberOfProfiles;
        this.price = price;
    }
}
