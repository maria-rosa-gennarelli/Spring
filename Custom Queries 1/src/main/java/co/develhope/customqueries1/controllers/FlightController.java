package co.develhope.customqueries1.controllers;

import co.develhope.customqueries1.entities.Flight;
import co.develhope.customqueries1.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @GetMapping("")
    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }

    @PostMapping("")
    public List<Flight> createFlights() {
        List<Flight> flights = new ArrayList<>();
        Random random = new Random();
        for (long i=1; i<50; i++) {
            Flight flight = new Flight(
                    i,
                    "Flight " + i,
                    "From Airport " + random.nextInt(20),
                    "To Airport " + random.nextInt(20),
                    Flight.Status.ON_TIME);
            flights.add(flightRepository.save(flight));
        }
        return flights;


    }
}