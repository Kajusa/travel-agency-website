package sda.travelagency.db.repository;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import sda.travelagency.db.mapper.TripRowMapper;
import sda.travelagency.domain.Trip;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

//aby se vytvorila beana, nejspodnejsi vrstva, komponent, ktera bude komunikovat s DB
@Component
public class TripRepository {
    private final JdbcTemplate jdbcTemplate;
    private final TripRowMapper tripRowMapper = new TripRowMapper();

    public TripRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    } //v konstuktoru pouziju jdbc injection pro jdbc template, ten nastavim tomu nasemu

    public Trip get(int idTrip) { //vraceni tripu dle ID
        final String sql = "select * from trip where trip.idTrip = " + idTrip;
        try {
            return jdbcTemplate.queryForObject(sql, tripRowMapper);
        } catch (EmptyResultDataAccessException e) { //kdyz dle id nic nenajde
            return null;
        }
    }
        public Integer add (Trip trip){
            final String sql = "insert into trip(idHotel,departureDate,arrivalDate,numberOfDays,type,priceAdult, priceChild,promoted,description,freeBeds) value (?,?,?,?,?,?,?,?,?,?)";

            KeyHolder keyHolder = new GeneratedKeyHolder(); //vrati vygenerovany klic
            jdbcTemplate.update(new PreparedStatementCreator() {
                @Override
                public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                    PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS); //kdyz nastavi trip v DB, at nam stihne vratit id
                    ps.setInt(1, trip.getIdHotel());
                    ps.setDate(2, trip.getDepartureDate());
                    ps.setDate(3, trip.getArrivalDate());
                    ps.setInt(4, trip.getNumberOfDays());
                    ps.setString(5, trip.getType());
                    ps.setDouble(6, trip.getPriceAdult());
                    ps.setDouble(7, trip.getPriceChild());
                    ps.setBoolean(8, trip.getPromoted());
                    ps.setString(9, trip.getDescription());
                    ps.setInt(10, trip.getFreeBeds());
                    return ps;
                }
            }, keyHolder);

            if (keyHolder.getKey() != null) {
                return keyHolder.getKey().intValue();
            } else {
                return null; //znamena, ze se to nepodarilo
            }
        }

        public List<Trip> getAll () { //vrati seznam vyletu
            final String sql = "select * from trip";
            return jdbcTemplate.query(sql, tripRowMapper);
        }
    }
