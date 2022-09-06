package elcolibri.controladorfinaniero.controller;

import elcolibri.controladorfinaniero.model.Enterprise;
import elcolibri.controladorfinaniero.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {

    @Autowired

    private EnterpriseService service;

    @GetMapping
    public List<Enterprise> readAll() throws Exception{
        return service.readAll();
    }

    @PostMapping
    public Enterprise create(@RequestBody Enterprise enterprise) throws Exception{
        return service.create(enterprise);
    }

    @GetMapping("/{id}")
    public Enterprise readById(@PathVariable("id") Integer id) throws Exception{
        return service.readById(id);
    }

    @PutMapping
    public Enterprise update(@RequestBody Enterprise enterprise) throws Exception{
        return service.update(enterprise);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception{
        service.delete(id);
    }

}

