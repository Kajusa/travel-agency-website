package sda.travelagency.service;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import sda.travelagency.model.Trip;
import sda.travelagency.repository.TripRepository;

import java.util.List;

@Service
public class TripService implements IFTripService{

    private final TripRepository tripRepository;

    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }


    @Override
    public List<Trip> findAll() {
        return tripRepository.findAll();
    }

    @Override
    public Trip save(Trip trip) {
        return tripRepository.save(trip);
    }

    @Override
    public void delete(int id) {

    }
}
