package tn.esprit.spring.Services;

import tn.esprit.spring.Entities.Reservation;

import java.util.List;

public interface IReservationService{
    Reservation add(Reservation reservation);
    List<Reservation> addAll(List<Reservation> reservations);
    Reservation update(Reservation reservation);
    List<Reservation> updateAll(List<Reservation> reservations);
    Reservation selectById(long id);
    List<Reservation> selectAll();
    void delete(Reservation reservation);
    void deleteById(long id);
    void deleteAll(List<Reservation> reservations);
    void deleteAll();
    long count();
}
