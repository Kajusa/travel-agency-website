package sda.travelagency.service;

import sda.travelagency.model.Destination;

import java.util.List;


public interface IFDestinationService {

    List<Destination> findAll();

   // Destination get(int id);

    Destination save(Destination destination);

}