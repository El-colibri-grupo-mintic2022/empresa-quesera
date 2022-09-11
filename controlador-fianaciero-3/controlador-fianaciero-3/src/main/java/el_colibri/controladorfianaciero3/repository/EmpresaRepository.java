package el_colibri.controladorfianaciero3.repository;

import el_colibri.controladorfianaciero3.model.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository //Anotacion que le dice a spring que esta clase es un repositorio

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

    static void finAll() {
    }
}