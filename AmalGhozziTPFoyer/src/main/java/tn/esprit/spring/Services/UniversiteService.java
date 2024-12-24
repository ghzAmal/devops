package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.Universite;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService{
    @Override
    public Universite add(Universite universite) {
        return null;
    }

    @Override
    public List<Universite> addAll(List<Universite> universites) {
        return List.of();
    }

    @Override
    public Universite update(Universite universite) {
        return null;
    }

    @Override
    public List<Universite> updateAll(List<Universite> universites) {
        return List.of();
    }

    @Override
    public Universite selectById(long id) {
        return null;
    }

    @Override
    public List<Universite> selectAll() {
        return List.of();
    }

    @Override
    public void delete(Universite universite) {

    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public void deleteAll(List<Universite> universites) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public long count() {
        return 0;
    }
}
