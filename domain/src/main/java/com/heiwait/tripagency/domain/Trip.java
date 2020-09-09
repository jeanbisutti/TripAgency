package com.heiwait.tripagency.domain;

public class Trip {

    private final Integer agencyFees;
    private final Integer stayFees;
    private final Integer ticketPrice;

    public static final Trip MISSING_DESTINATION = new Trip(0, 0, 0);

    public Trip(Integer agencyFees, Integer stayFees, Integer ticketPrice) {
        this.agencyFees = agencyFees;
        this.stayFees = stayFees;
        this.ticketPrice = ticketPrice;
    }

    public Integer agencyFees() {
        return agencyFees;
    }

    public Integer travelFees() {
        return stayFees;
    }

    public int ticketPrice() {
        return ticketPrice;
    }
}