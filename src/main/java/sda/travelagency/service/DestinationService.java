package sda.travelagency.service;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.travelagency.model.Destination;
import sda.travelagency.repository.DestinationRepository;
import sda.travelagency.service.IFDestinationService;

import java.util.List;

@Service
public class DestinationService {

    @Autowired
    private final DestinationRepository destinationRepository;

    public DestinationService(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    public List<Destination> findAll() {
        return destinationRepository.findAll();
    }

    public Destination save(Destination destination) {
        return destinationRepository.save(destination);
    }

   /* public Destination findById(Long id) {
        return destinationRepository.findById(idDestination);}*/
}
