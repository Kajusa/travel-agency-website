package sda.travelagency.db.service.impl;

import org.springframework.stereotype.Service;
import sda.travelagency.db.repository.TripRepository;
import sda.travelagency.db.service.api.TripService;
import sda.travelagency.domain.Trip;

import java.util.List;

@Service //k čemu to je, že máme třídu navíc? Až budeme rozšiřovat, tak tento bude sloužit pro doplnění další logiky.
public class TripServiceImpl implements TripService {
    private final TripRepository tripRepository;

    public TripServiceImpl(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    @Override
    public List<Trip> getTrips() {
        return tripRepository.getAll();
    }

    @Override
    public Trip get(int idTrip) {
        return (Trip) tripRepository.get(idTrip);
    }

    @Override
    public Integer add(Trip trip) {
        return tripRepository.add(trip);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void updateAvailable(int id, int newAvailable) {

    }
}
