package sda.travelagency.service;

import sda.travelagency.model.Hotel;

import java.util.List;

public interface IFHotelService {

    List<Hotel> findAll();

    // Destination get(int id);

    Hotel save(Hotel hotel);

    void delete(int id);
}
