package demoapp;

import demoapp.service.NumberService;
import demoapp.service.SaludoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ServiceTest {

    @Autowired
    SaludoService saludo;
    @Autowired
    NumberService numberService;

    @Test
    public void contexLoads() throws Exception {
        assertThat(saludo).isNotNull();
        assertThat(numberService).isNotNull();
    }

    @Test
    public void serviceSaludo() throws Exception {
        assertThat(saludo.saluda("Domingo")).isEqualTo("Hola Domingo");
        assertThat(numberService.evenResponse(50)).isEqualTo("The number is even");
        assertThat(numberService.evenResponse(51)).isEqualTo("The number is not even");
    }
}
