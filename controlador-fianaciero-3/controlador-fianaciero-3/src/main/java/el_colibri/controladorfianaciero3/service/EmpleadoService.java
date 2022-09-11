package el_colibri.controladorfianaciero3.service;

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
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    //Metodo para ver todos los empleados registrados
    public List<Empleado> getAllEmpleado(){
        List<Empleado> empleadoList= new ArrayList<>();
        empleadoRepository.findAll().forEach(empleado -> empleadoList.add(empleado));
        return empleadoList;
    }

    //Metodo para buscar empleados por ID
    public Optional<Empleado> getEmpleadoById(Integer id){ //Existe optional y asi se podria usar

        return empleadoRepository.findById(id);
    }

    //Metodo para buscar empleados por empresa
    public ArrayList<Empleado> obtenerPorEmpresa(Integer id){
        return empleadoRepository.findByEmpresa(id);
    }

    //Metodo para guardar o actualizar registros en Empleados
    public boolean saveOrUpdateEmpleado(Empleado empl){
        Empleado emp=empleadoRepository.save(empl);
        if (empleadoRepository.findById(emp.getId())!=null){
            return true;
        }
        return false;
    }

    //Metodo para eliminar un registro de Empleado por Id
    public boolean deleteEmpleado(Integer id){
        empleadoRepository.deleteById(id);
        if(this.empleadoRepository.findById(id).isPresent()){
            return false;
        }
        return true;
    }
}
