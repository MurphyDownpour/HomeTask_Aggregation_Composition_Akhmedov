package by.htp.agregation_and_composition.Task5;

import java.util.Objects;

enum TripType {
    CRUISE, EXCURSION, HEALING, SHOPPING
}

enum TransportType {
    PLANE, CAR, BUS, TRAIN, SHIP
}

public class Trip {
    private TripType tripType;
    private int days;
    private TransportType transportType;
    private int foodPerDay;

    public Trip(TripType tripType, int days, TransportType transportType, int foodPerDay) {
        this.tripType = tripType;
        this.days = days;
        this.transportType = transportType;
        this.foodPerDay = foodPerDay;
    }

    public TripType getTripType() {
        return tripType;
    }

    public void setTripType(TripType tripType) {
        this.tripType = tripType;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public int getFoodPerDay() {
        return foodPerDay;
    }

    public void setFoodPerDay(int foodPerDay) {
        this.foodPerDay = foodPerDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return days == trip.days &&
                foodPerDay == trip.foodPerDay &&
                tripType == trip.tripType &&
                transportType == trip.transportType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tripType, days, transportType, foodPerDay);
    }

    @Override
    public String toString() {
        return "Trip{" +
                "tripType=" + tripType +
                ", days=" + days +
                ", transportType=" + transportType +
                ", foodPerDay=" + foodPerDay +
                '}';
    }
}
