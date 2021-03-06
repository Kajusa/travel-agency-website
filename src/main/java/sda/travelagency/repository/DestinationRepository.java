package sda.travelagency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sda.travelagency.model.Destination;

@Repository
public interface DestinationRepository extends JpaRepository<Destination,Integer> {
}
