package sda.travelagency.service;
//import sda.travelagency.db.service.api.request.UpdateTripRequest;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import sda.travelagency.model.Hotel;
import sda.travelagency.repository.TripRepository;
import sda.travelagency.model.Trip;

import java.util.List;

public interface IFTripService {

    List<Trip> findAll();

    Trip save(Trip trip);

    void delete(int id);
}
