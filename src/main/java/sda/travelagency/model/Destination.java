package sda.travelagency.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Objects;

@Entity //označení pro DB entitu - tabulku
@Data
public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="idDestination")
    private Integer idDestination;
   @Column(name="DestinationName")
    private String DestinationName;
}

