package tn.esprit.spring.Services;

import tn.esprit.spring.Entities.Bloc;

import java.util.List;

public interface IBlocService {

    Bloc add(Bloc bloc);
    List<Bloc> addAll(List<Bloc> blocs);
    Bloc update(Bloc bloc);
    List<Bloc> updateAll(List<Bloc> blocs);
    Bloc selectById(long id);
    List<Bloc> selectAll();
    void delete(Bloc bloc);
    void deleteById(long id);
    void deleteAll(List<Bloc> blocs);
    void deleteAll();
    long count();
    Bloc addBlocAndRooms(Bloc bloc);
    Bloc addBlocAndAffecteFoyer(Bloc bloc, String nomFoyer);
     void listeChambresParBloc();
    }
