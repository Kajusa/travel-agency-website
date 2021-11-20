package sda.travelagency.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sda.travelagency.model.Trip;
import sda.travelagency.service.TripService;

import java.util.List;

@RestController
@RequestMapping(path = "/trip")
public class TripController {

    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Trip trip){
        tripService.save(trip);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Trip> getAll() {
        return tripService.findAll();
    }

}
