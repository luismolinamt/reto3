package com.reto3.reto3.repository;

import com.reto3.reto3.entities.Reservation;
import com.reto3.reto3.repository.crudRepository.ReservationCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {

    @Autowired
    private ReservationCrudRepository reservationsCrudRepository;
    public List<Reservation> getAll(){
        return (List<Reservation>) reservationsCrudRepository.findAll();
    }
    public Optional<Reservation> getReservation(int id){
        return reservationsCrudRepository.findById(id);
    }
    public Reservation save(Reservation c){
        return reservationsCrudRepository.save(c);
    }
    public void delete(Reservation c){
        reservationsCrudRepository.delete(c);
    }

}