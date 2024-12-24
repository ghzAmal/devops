package tn.esprit.spring.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Services.UniversiteService;

@RestController
@RequestMapping("/api/universites")
@AllArgsConstructor
public class UniversiteRestController {
    UniversiteService universiteService;
}
