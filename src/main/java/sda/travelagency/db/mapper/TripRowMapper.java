package sda.travelagency.db.mapper;

import sda.travelagency.domain.Trip;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

//potrebujeme vytvorit DB rozhrani, na to pouzijeme RowMapper - IF v JDBC balicku
public class TripRowMapper implements RowMapper<Trip> {
    @Override
    public Trip mapRow(ResultSet rs, int rowNum) throws SQLException {
        Trip trip = new Trip();
        trip.setIdTrip(rs.getInt("idTrip"));
        trip.setIdHotel(rs.getInt("idHotel"));
        trip.setDepartureDate(rs.getDate("departureDate"));
        trip.setArrivalDate(rs.getDate("arrivalDate"));
        trip.setNumberOfDays(rs.getInt("numberOfDays"));
        trip.setType(rs.getString("type"));
        trip.setPriceAdult(rs.getDouble("priceAdult"));
        trip.setPriceChild(rs.getDouble("priceChild"));
        trip.setPromoted(rs.getBoolean("promoted"));
        trip.setDescription(rs.getString("description"));
        trip.setFreeBeds(rs.getInt("freeBeds"));
        return trip;
    }
}
