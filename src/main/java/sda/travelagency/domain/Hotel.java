package sda.travelagency.domain;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Objects;

public class Hotel {
    @Nullable
    private Integer idHotel;
    @NonNull
    private Integer idDestination;
    @NonNull
    private String hotelName;
    @Nullable
    private Integer stars;
    @Nullable
    private Boolean forKids;
    @Nullable
    private Boolean swimmingPool;

    public Hotel() {
    }

    public Hotel(@Nullable Integer idHotel, @NonNull Integer idDestination, @NonNull String hotelName, @Nullable Integer stars, @Nullable Boolean forKids, @Nullable Boolean swimmingPool) {
        this.idHotel = idHotel;
        this.idDestination = idDestination;
        this.hotelName = hotelName;
        this.stars = stars;
        this.forKids = forKids;
        this.swimmingPool = swimmingPool;
    }

    @Nullable
    public Integer getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(@Nullable Integer idHotel) {
        this.idHotel = idHotel;
    }

    @NonNull
    public Integer getIdDestination() {
        return idDestination;
    }

    public void setIdDestination(@NonNull Integer idDestination) {
        this.idDestination = idDestination;
    }

    @NonNull
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(@NonNull String hotelName) {
        this.hotelName = hotelName;
    }

    @Nullable
    public Integer getStars() {
        return stars;
    }

    public void setStars(@Nullable Integer stars) {
        this.stars = stars;
    }

    @Nullable
    public Boolean getForKids() {
        return forKids;
    }

    public void setForKids(@Nullable Boolean forKids) {
        this.forKids = forKids;
    }

    @Nullable
    public Boolean getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(@Nullable Boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(idHotel, hotel.idHotel) && idDestination.equals(hotel.idDestination) && hotelName.equals(hotel.hotelName) && Objects.equals(stars, hotel.stars) && Objects.equals(forKids, hotel.forKids) && Objects.equals(swimmingPool, hotel.swimmingPool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHotel, idDestination, hotelName, stars, forKids, swimmingPool);
    }
}

