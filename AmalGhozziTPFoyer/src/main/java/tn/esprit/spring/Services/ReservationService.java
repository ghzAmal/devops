package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.Reservation;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService{
    @Override
    public Reservation add(Reservation reservation) {
        return null;
    }

    @Override
    public List<Reservation> addAll(List<Reservation> reservations) {
        return List.of();
    }

    @Override
    public Reservation update(Reservation reservation) {
        return null;
    }

    @Override
    public List<Reservation> updateAll(List<Reservation> reservations) {
        return List.of();
    }

    @Override
    public Reservation selectById(long id) {
        return null;
    }

    @Override
    public List<Reservation> selectAll() {
        return List.of();
    }

    @Override
    public void delete(Reservation reservation) {

    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public void deleteAll(List<Reservation> reservations) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public long count() {
        return 0;
    }
}
