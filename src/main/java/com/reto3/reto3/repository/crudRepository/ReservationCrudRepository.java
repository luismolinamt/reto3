package com.reto3.reto3.repository.crudRepository;

import com.reto3.reto3.entities.Reservation;
import org.springframework.data.repository.CrudRepository;
public interface ReservationCrudRepository extends CrudRepository<Reservation,Integer> {
}
