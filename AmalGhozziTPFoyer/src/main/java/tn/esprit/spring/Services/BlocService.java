package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.spring.Entities.Bloc;
import tn.esprit.spring.Entities.Foyer;
import tn.esprit.spring.Repositories.BlocRepository;
import tn.esprit.spring.Repositories.ChambreRepository;
import tn.esprit.spring.Repositories.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class BlocService implements IBlocService {

    BlocRepository blocRepository;
    ChambreRepository chambreRepository;
    FoyerRepository foyerRepository;

    @Override
    public Bloc add(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public List<Bloc> addAll(List<Bloc> blocs) {
        return blocRepository.saveAll(blocs);
    }

    @Override
    public Bloc update(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public List<Bloc> updateAll(List<Bloc> blocs) {
        return blocRepository.saveAll(blocs);
    }

    @Override
    public Bloc selectById(long id) {
        //return blocRepository.findById(id).get();
        return blocRepository.findById(id).orElse(Bloc.builder()
                .idBloc(0)
                .nomBloc("test")
                .capaciteBloc(5)
                .build());
    }

    @Override
    public List<Bloc> selectAll() {
        return blocRepository.findAll();
    }

    @Override
    public void delete(Bloc bloc) {
        blocRepository.delete(bloc);
    }

    @Override
    public void deleteById(long id) {
        blocRepository.deleteById(id);
    }

    @Override
    public void deleteAll(List<Bloc> blocs) {
        blocRepository.deleteAll(blocs);
    }

    @Override
    public void deleteAll() {
        blocRepository.deleteAll();
    }

    @Override
    public long count() {
        return blocRepository.count();
    }

    @Override
    public Bloc addBlocAndRooms(Bloc bloc) {
        if (bloc.getChambres() == null || bloc.getChambres().isEmpty()) {
            throw new RuntimeException("Chambres obligatoire");
        } else {
            chambreRepository.saveAll(bloc.getChambres());
            bloc = blocRepository.save(bloc);
        }
        return bloc;
    }

    public Bloc addBlocAndAffecteFoyer(Bloc bloc, String nomFoyer) {
        Foyer foyer = foyerRepository.findByNomFoyer(nomFoyer);
        bloc.setFoyer(foyer);
        return blocRepository.save(bloc);
    }

    @Scheduled(cron = "0 */1 * * * *")
    public void listeChambresParBloc() {
        List<Bloc> blocs = blocRepository.findAll();
        Integer i = 0;
        blocs.forEach(bloc -> {
            int nombreChambres = bloc.getChambres().size();
            log.info("Bloc => " + bloc.getNomBloc() + " ayant une capacité de " + bloc.getCapaciteBloc()
            );
            if (nombreChambres == 0) {
                log.info("pas de chambres pour ce bloc.");

            } else {
                log.info(" et contenant " + nombreChambres + " chambres.");
                log.info("Liste des types de chambres:");
                bloc.getChambres().forEach(chambre -> {
                    System.out.println("Type de chambre: " + chambre.getTypeC());
                });
            }
            log.info("****************************");
        });
    }
}
