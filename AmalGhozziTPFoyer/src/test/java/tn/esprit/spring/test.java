package tn.esprit.spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.Entities.Bloc;
import tn.esprit.spring.Services.BlocService;

import static org.springframework.test.util.AssertionErrors.assertNotNull;

@SpringBootTest
public class test {
    BlocService blocService;
    @Test
    public void contextLoads() {
        // Vérifier si le bean MyService est chargé dans le contexte
        assertNotNull(blocService.toString(), "Le service MyService devrait être présent dans le contexte Spring");    }
}
