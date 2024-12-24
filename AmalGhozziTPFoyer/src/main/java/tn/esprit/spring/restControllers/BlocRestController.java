package tn.esprit.spring.restControllers;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Entities.Bloc;
import tn.esprit.spring.Services.BlocService;

import java.util.List;

@RestController
@RequestMapping("/api/blocs")
@AllArgsConstructor
public class BlocRestController {

    private final BlocService blocService;

    @PostMapping("/add")
    public ResponseEntity<Bloc> addBloc(@RequestBody Bloc bloc) {
        Bloc savedBloc = blocService.add(bloc);
        return ResponseEntity.ok(savedBloc);
    }

    @PostMapping("/addAll")
    public ResponseEntity<List<Bloc>> addAllBlocs(@RequestBody List<Bloc> blocs) {
        List<Bloc> savedBlocs = blocService.addAll(blocs);
        return ResponseEntity.ok(savedBlocs);
    }

    @PutMapping("/update")
    public ResponseEntity<Bloc> updateBloc(@RequestBody Bloc bloc) {
        Bloc updatedBloc = blocService.update(bloc);
        return ResponseEntity.ok(updatedBloc);
    }

    @PutMapping("/updateAll")
    public ResponseEntity<List<Bloc>> updateAllBlocs(@RequestBody List<Bloc> blocs) {
        List<Bloc> updatedBlocs = blocService.updateAll(blocs);
        return ResponseEntity.ok(updatedBlocs);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Bloc> getBlocById(@PathVariable long id) {
        Bloc bloc = blocService.selectById(id);
        return ResponseEntity.ok(bloc);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Bloc>> getAllBlocs() {
        List<Bloc> blocs = blocService.selectAll();
        return ResponseEntity.ok(blocs);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteBloc(@RequestBody Bloc bloc) {
        blocService.delete(bloc);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Void> deleteBlocById(@PathVariable long id) {
        blocService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<Void> deleteAllBlocs(@RequestBody List<Bloc> blocs) {
        blocService.deleteAll(blocs);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/deleteAllBlocs")
    public ResponseEntity<Void> deleteAll() {
        blocService.deleteAll();
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/count")
    public ResponseEntity<Long> countBlocs() {
        long count = blocService.count();
        return ResponseEntity.ok(count);
    }

    @PostMapping("/addBlocAndRooms")
    public ResponseEntity<Bloc> addBlocAndRooms(@RequestBody Bloc bloc) {
        Bloc savedBloc = blocService.addBlocAndRooms(bloc);
        return ResponseEntity.ok(savedBloc);
    }
    @PostMapping("/addBlocAndFoyer")
    public ResponseEntity<Bloc> addBlocAndFoyer(@RequestBody Bloc bloc,@RequestParam String nomFoyer) {
        Bloc savedBloc = blocService.addBlocAndAffecteFoyer(bloc,nomFoyer);
        return ResponseEntity.ok(savedBloc);
    }

}
