package sda.travelagency.domain;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.sql.Date;
import java.util.Objects;

public class Trip {
    @Nullable
    private Integer idTrip;
    @NonNull
    private Integer idHotel;
    @Nullable
    private Date departureDate;
    @Nullable
    private Date arrivalDate;
    @Nullable
    private Integer numberOfDays;
    @Nullable
    private String type;
    @Nullable
    private double priceAdult;
    @Nullable
    private double priceChild;
    @Nullable
    private Boolean promoted;
    @Nullable
    private String description;
    @Nullable
    private Integer freeBeds;

    public Trip() {
    }

    public Trip(@NonNull Integer idHotel, @Nullable Date departureDate, @Nullable Date arrivalDate, @Nullable Integer numberOfDays, @Nullable String type, double priceAdult, double priceChild, @Nullable Boolean promoted, @Nullable String description, @Nullable Integer freeBeds) {
        this.idHotel = idHotel;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.numberOfDays = numberOfDays;
        this.type = type;
        this.priceAdult = priceAdult;
        this.priceChild = priceChild;
        this.promoted = promoted;
        this.description = description;
        this.freeBeds = freeBeds;
    }


    @Nullable
    public Integer getIdTrip() {
        return idTrip;
    }

    public void setIdTrip(@Nullable Integer idTrip) {
        this.idTrip = idTrip;
    }

    @NonNull
    public Integer getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(@NonNull Integer idHotel) {
        this.idHotel = idHotel;
    }

    @Nullable
    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(@Nullable Date departureDate) {
        this.departureDate = departureDate;
    }

    @Nullable
    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(@Nullable Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public boolean isPromoted() {
        return promoted;
    }

    @Nullable
    public Integer getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(@Nullable Integer numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Nullable
    public String getType() {
        return type;
    }

    public void setType(@Nullable String type) {
        this.type = type;
    }

    public double getPriceAdult() {
        return priceAdult;
    }

    public void setPriceAdult(double priceAdult) {
        this.priceAdult = priceAdult;
    }

    public double getPriceChild() {
        return priceChild;
    }

    public void setPriceChild(double priceChild) {
        this.priceChild = priceChild;
    }

    public boolean getPromoted() {
        return promoted;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@Nullable String description) {
        this.description = description;
    }

    @Nullable
    public Integer getFreeBeds() {
        return freeBeds;
    }

    public void setFreeBeds(@Nullable Integer freeBeds) {
        this.freeBeds = freeBeds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return Double.compare(trip.priceAdult, priceAdult) == 0 && Double.compare(trip.priceChild, priceChild) == 0 && promoted == trip.promoted && Objects.equals(idTrip, trip.idTrip) && idHotel.equals(trip.idHotel) && Objects.equals(departureDate, trip.departureDate) && Objects.equals(arrivalDate, trip.arrivalDate) && Objects.equals(numberOfDays, trip.numberOfDays) && Objects.equals(type, trip.type) && Objects.equals(description, trip.description) && Objects.equals(freeBeds, trip.freeBeds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTrip, idHotel, departureDate, arrivalDate, numberOfDays, type, priceAdult, priceChild, promoted, description, freeBeds);
    }
}
