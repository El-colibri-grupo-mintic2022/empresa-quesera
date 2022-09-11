package el_colibri.controladorfianaciero3.controller;

import el_colibri.controladorfianaciero3.model.Empresa;
import el_colibri.controladorfianaciero3.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {


    @Autowired
    EmpresaService EmpresaService;


    @GetMapping("/enterprises") //Ver json de todas las empresas
    public List<Empresa> verEmpresas() {

        return EmpresaService.getAllEmpresas();
    }

    @PostMapping("/enterprises") //Guardar el json del body como una nueva empresa o registro en nuestra bd
    public Empresa guardarEmpresa(@RequestBody Empresa emp) {
        return this.EmpresaService.saveOrUpdateEmpresa(emp);
    }

    @GetMapping(path = "enterprises/{id}")
    public Empresa empresaPorID(@PathVariable("id") Integer id) {
        return this.EmpresaService.getEmpresaById(id);
    }

    @PatchMapping("/enterprises/{id}")
    public Empresa actualizarEmpresa(@PathVariable("id") Integer id, @RequestBody Empresa empresa) {
        Empresa emp = EmpresaService.getEmpresaById(id);
        emp.setNombre(empresa.getNombre());
        emp.setDirección(empresa.getDirección());
        emp.setTeléfono(empresa.getTeléfono());
        emp.setNIT(empresa.getNIT());
        return EmpresaService.saveOrUpdateEmpresa(emp);

    }

    @DeleteMapping(path = "enterprises/{id}") //Eliminar registro de la bd
    public String DeleteEmpresa(@PathVariable("id") Integer id) {
        boolean respuesta = this.EmpresaService.deleteEmpresa(id);
        if (respuesta) {  //Si respuesta es true?
            return "Se elimino la empresa con id" + id;
        } else {
            return "No se pudo eliminar la empresa con id" + id;
        }
    }
}