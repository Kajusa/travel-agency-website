package sda.travelagency.db.service.api.request;

import org.springframework.lang.NonNull;

import java.sql.Date;
import java.util.Objects;

public class UpdateTripRequest {

    @NonNull
    private Integer idHotel;
    @NonNull
    private Date departureDate;
    @NonNull
    private Date arrivalDate;
    @NonNull
    private Integer numberOfDays;
    @NonNull
    private String type;
    @NonNull
    private double priceAdult;
    @NonNull
    private double priceChild;
    @NonNull
    private Boolean promoted;
    @NonNull
    private String description;
    @NonNull
    private Integer freeBeds;

    public UpdateTripRequest(@NonNull Integer idHotel, @NonNull Date departureDate, @NonNull Date arrivalDate, @NonNull Integer numberOfDays, @NonNull String type, double priceAdult, double priceChild, @NonNull Boolean promoted, @NonNull String description, @NonNull Integer freeBeds) {
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

    @NonNull
    public Integer getIdHotel() {
        return idHotel;
    }

    @NonNull
    public Date getDepartureDate() {
        return departureDate;
    }

    @NonNull
    public Date getArrivalDate() {
        return arrivalDate;
    }

    @NonNull
    public Integer getNumberOfDays() {
        return numberOfDays;
    }

    @NonNull
    public String getType() {
        return type;
    }

    public double getPriceAdult() {
        return priceAdult;
    }

    public double getPriceChild() {
        return priceChild;
    }

    @NonNull
    public Boolean getPromoted() {
        return promoted;
    }

    @NonNull
    public String getDescription() {
        return description;
    }

    @NonNull
    public Integer getFreeBeds() {
        return freeBeds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateTripRequest that = (UpdateTripRequest) o;
        return Double.compare(that.priceAdult, priceAdult) == 0 && Double.compare(that.priceChild, priceChild) == 0 && idHotel.equals(that.idHotel) && departureDate.equals(that.departureDate) && arrivalDate.equals(that.arrivalDate) && numberOfDays.equals(that.numberOfDays) && type.equals(that.type) && promoted.equals(that.promoted) && description.equals(that.description) && freeBeds.equals(that.freeBeds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHotel, departureDate, arrivalDate, numberOfDays, type, priceAdult, priceChild, promoted, description, freeBeds);
    }

}
