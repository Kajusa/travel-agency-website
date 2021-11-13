package sda.travelagency.db.service.api;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import sda.travelagency.domain.Hotel;
import sda.travelagency.domain.Trip;

import java.util.List;

public interface HotelService {
    List<Hotel> getHotels(); //vrátí seznam hotelu

    @Nullable
    Hotel get(int id);

    @Nullable
    Integer add(Hotel hotel); // returns generated id tripu, když zadávám nový

    void delete(int id);

}
