package sda.travelagency;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import sda.travelagency.db.service.api.TripService;
import sda.travelagency.domain.Trip;


import java.sql.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_CLASS)
public class DBServiceTest {

  @Autowired //abychom sem dostali tripService, používá se v testech
    private TripService tripService;


    @Test
    public void trip() { //zavoláme si konstruktor
        Trip trip = new Trip(2, Date.valueOf("2021-01-20"),Date.valueOf("2021-01-28"),8,"all inclusive",15000, 10000,true,"popis zájezdu",50);
        Integer idTrip = tripService.add(trip); //přidání do DB, které vrátí id
        assert idTrip != null; //ověřit, že není prázdné
        trip.setIdTrip(idTrip);

        Trip fromDb = tripService.get(idTrip); //požádám o někoho dle id
        Assert.assertEquals(trip, fromDb); //kontroluji, že jsou stejné

        List<Trip> trips = tripService.getTrips(); //vrátit seznam zájezdů
        Assert.assertEquals(1, trips.size()); //kontroluje pocet zaznamu v DB, ale ja tam uz nejake mam
        Assert.assertEquals(trip, trips.get(0));
    }
}
