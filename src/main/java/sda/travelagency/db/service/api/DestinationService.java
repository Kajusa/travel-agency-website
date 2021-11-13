package sda.travelagency.db.service.api;

import org.springframework.lang.Nullable;
import sda.travelagency.domain.Destination;

import java.util.List;

public interface DestinationService {
    List<Destination> getDestinations();

    @Nullable
    Destination get(int id);

    @Nullable
    Integer add(Destination destination); // returns generated id

}
