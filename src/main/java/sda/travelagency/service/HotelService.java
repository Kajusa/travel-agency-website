package sda.travelagency.service;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import sda.travelagency.model.Hotel;
import sda.travelagency.repository.HotelRepository;

import java.util.List;

@Service
public class HotelService implements IFHotelService {

    private final HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }


    @Override
    public List<Hotel> findAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel save(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public void delete(int id) {

    }

}
