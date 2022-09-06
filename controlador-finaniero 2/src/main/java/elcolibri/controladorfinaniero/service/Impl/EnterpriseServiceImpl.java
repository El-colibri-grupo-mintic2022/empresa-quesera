package elcolibri.controladorfinaniero.service.Impl;

import elcolibri.controladorfinaniero.model.Enterprise;
import elcolibri.controladorfinaniero.repository.EnterpriseRepository;
import elcolibri.controladorfinaniero.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EnterpriseServiceImpl implements EnterpriseService {

    @Autowired
    private EnterpriseRepository repo;



    @Override
    public Enterprise create(Enterprise enterprise) {
        return repo.save(enterprise);
    }

    @Override
    public Enterprise update(Enterprise enterprise) {
        return repo.save(enterprise);
    }

    @Override
    public List<Enterprise> readAll() {
        return repo.findAll();
    }

    @Override
    public Enterprise readById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

}
