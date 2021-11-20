package sda.travelagency.model;

import lombok.Data;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Data
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTrip;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idHotel") // an indication of the name of the joining column in the orders table
    private List<Hotel> hotels;

    private Date departureDate;

    private Date arrivalDate;

    private Integer numberOfDays;

    private String type;

    private double priceAdult;

    private double priceChild;

    private Boolean promoted;

    private String description;

    private Integer freeBeds;
}
