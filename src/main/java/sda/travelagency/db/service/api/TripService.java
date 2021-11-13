package sda.travelagency.db.service.api;
//import sda.travelagency.db.service.api.request.UpdateTripRequest;

import org.springframework.lang.Nullable;

import sda.travelagency.domain.Trip;

import java.util.List;

public interface TripService {
    List<Trip> getTrips(); //vrátí seznam zájezdů

    @Nullable//služba může vrátit nulu, když nic nenajde
    Trip get(int idTrip);

    @Nullable
    Integer add(Trip trip); // returns generated id tripu, když zadávám nový

    void delete(int id);

    //void update(int id, UpdateTripRequest request);

    void updateAvailable(int id, int newAvailable);
}
