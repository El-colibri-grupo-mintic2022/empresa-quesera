package el_colibri.controladorfianaciero3.controller;


import el_colibri.controladorfianaciero3.model.Empleado;
import el_colibri.controladorfianaciero3.model.Empresa;
import el_colibri.controladorfianaciero3.model.MovimientoDinero;
import el_colibri.controladorfianaciero3.service.EmpleadoService;
import el_colibri.controladorfianaciero3.service.EmpresaService;
import el_colibri.controladorfianaciero3.service.MovimientosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class Controllers {


    @Autowired
    EmpresaService  empresaService;


    @GetMapping("/enterprises") //Ver json de todas las empresas
    public List<Empresa> verEmpresas(){

        return EmpresaService.getAllEmpresas();
    }

    @PostMapping("/enterprises") //Guardar el json del body como una nueva empresa o registro en nuestra bd
    public Empresa guardarEmpresa(@RequestBody Empresa emp){

        return this.empresaService.saveOrUpdateEmpresa(emp);
    }

    @GetMapping(path = "enterprises/{id}")
    public Empresa empresaPorID(@PathVariable("id") Integer id){
        return this.empresaService.getEmpresaById(id);
    }

    @PatchMapping("/enterprises/{id}")
    public Empresa actualizarEmpresa(@PathVariable("id") Integer id, @RequestBody Empresa empresa){
        Empresa emp= empresaService.getEmpresaById(id);
        emp.setNombre(empresa.getNombre());
        emp.setDirección(empresa.getDirección());
        emp.setTeléfono(empresa.getTeléfono());
        emp.setNIT(empresa.getNIT());
        return empresaService.saveOrUpdateEmpresa(emp);

    }

    @DeleteMapping (path= "enterprises/{id}") //Eliminar registro de la bd
    public String DeleteEmpresa(@PathVariable("id") Integer id){
        boolean respuesta= this.empresaService.deleteEmpresa(id);
        if (respuesta){  //Si respuesta es true?
            return "Se elimino la empresa con id" +id;
        }
        else{
            return "No se pudo eliminar la empresa con id"+id;
        }
    }