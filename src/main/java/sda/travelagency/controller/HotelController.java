package sda.travelagency.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sda.travelagency.service.HotelService;
import sda.travelagency.service.IFHotelService;
import sda.travelagency.model.Hotel;

import java.util.List;

@RestController
@RequestMapping(path = "/hotel")
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Hotel hotel){
        hotelService.save(hotel);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Hotel> getAll() {
        return hotelService.findAll();
    }
}
