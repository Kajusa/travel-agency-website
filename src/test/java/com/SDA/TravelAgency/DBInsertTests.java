package com.SDA.TravelAgency;

import sda.travelagency.Hotel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import sda.travelagency.Destination;
import sda.travelagency.Trip;

import java.sql.Date;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_CLASS)
@SpringBootApplication
public class DBInsertTests {

    private final String insertDestination = "INSERT INTO destination(DestinationName) value (?)";
    private final String insertHotel = "INSERT INTO hotel(idDestination,hotelName,stars,forKids,swimmingPool) value (?,?,?,?,?)";
    private final String insertTrip = "INSERT INTO trip(idHotel,departureDate,arrivalDate,numberOfDays,type,priceAdult, priceChild,promoted,description,freeBeds) value (?,?,?,?,?,?,?,?,?,?)";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void createDestination(){
        Destination destination = new Destination();
        destination.setDestinationName("Maledivi");

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(insertDestination);
                ps.setString(1,destination.getDestinationName());
                return ps;
            }
        });
    }
    @Test
    public void createHotel(){
        Hotel hotel = new Hotel();
        hotel.setIdDestination(1);
        hotel.setHotelName("Hilton");
        hotel.setStars(5);
        hotel.setForKids(true);
        hotel.setSwimmingPool(true);

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(insertHotel);
                ps.setInt(1,hotel.getIdDestination());
                ps.setString(2,hotel.getHotelName());
                ps.setInt(3,hotel.getStars());
                ps.setBoolean(4,hotel.getForKids());
                ps.setBoolean(5,hotel.getSwimmingPool());
                return ps;
            }
        });
    }
    @Test
    public void createTrip(){
        Trip trip = new Trip();
        trip.setIdHotel(1);
        trip.setDepartureDate(Date.valueOf("2021-01-12"));
        trip.setArrivalDate(Date.valueOf("2021-01-24"));
        trip.setNumberOfDays(12);
        trip.setType("Bed and Brekfast");
        trip.setPriceAdult(18000);
        trip.setPriceChild(15000);
        trip.setPromoted(true);
        trip.setDescription("krásný hotel na pobřeží");
        trip.setFreeBeds(50);

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(insertTrip);
                ps.setInt(1,trip.getIdHotel());
                ps.setDate(2,trip.getDepartureDate());
                ps.setDate(3,trip.getArrivalDate());
                ps.setInt(4,trip.getNumberOfDays());
                ps.setString(5,trip.getType());
                ps.setDouble(6,trip.getPriceAdult());
                ps.setDouble(7,trip.getPriceChild());
                ps.setBoolean(8,trip.getPromoted());
                ps.setString(9,trip.getDescription());
                ps.setInt(10,trip.getFreeBeds());
                return ps;
            }
        });
    }


}
