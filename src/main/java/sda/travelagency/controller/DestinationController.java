package sda.travelagency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import sda.travelagency.model.Destination;
import sda.travelagency.service.DestinationService;

import java.util.List;

@RestController
@RequestMapping(path = "/destination")
public class DestinationController {

    @Autowired
    private final DestinationService destinationService;

    public DestinationController(DestinationService destinationService) {
        this.destinationService = destinationService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Destination destination){destinationService.save(destination);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Destination> findAll()
    {return destinationService.findAll();
    }

}
