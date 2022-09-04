package elcolibri.controladorfinaniero;

import elcolibri.controladorfinaniero.model.Empleado;
import elcolibri.controladorfinaniero.model.movimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication (exclude={SecurityAutoConfiguration.class})
public class ControladorFinanieroApplication {

	@GetMapping("/Hola")
	public String Hola(){
		return "Hola Mundo";
	}
	@GetMapping("/instanciaEmpleado")
	public String instanciaEmpleado(){
		Empleado emp1 = new Empleado ("Joan Rodriguez","rodriguezn294@gmail.com","Toyota","Administrador");
		return emp1.getNombre();
	}
	@GetMapping("/instanciaDinero")
	public String instanciaDinero(){
		movimientoDinero cash1 = new movimientoDinero (3200000,32000000,"Pago a proveedores","Joan Rodriguez");
		return cash1.getConcepto();
	}

	public static void main(String[] args) {
		SpringApplication.run(ControladorFinanieroApplication.class, args);
	}

}
