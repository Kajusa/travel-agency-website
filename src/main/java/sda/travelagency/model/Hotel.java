package sda.travelagency.model;

import lombok.Data;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Data
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHotel;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idDestination") // an indication of the name of the joining column in the orders table
    private List<Destination> destinations;

    private Integer idDestination;

    private String hotelName;

    private Integer stars;

    private Boolean forKids;

    private Boolean swimmingPool;
}

