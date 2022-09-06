package elcolibri.controladorfinaniero.service.Impl;

import elcolibri.controladorfinaniero.model.Enterprise;
import elcolibri.controladorfinaniero.repository.EnterpriseRepository;
import elcolibri.controladorfinaniero.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EnterpriseServiceImpl implements EnterpriseService {

    @Autowired

    private EnterpriseRepository repo;

    @Override
    public Enterprise create(Enterprise enterprise) throws Exception {
        return repo.save(enterprise);
    }

    @Override
    public Enterprise update(Enterprise enterprise) throws Exception {
        return repo.save(enterprise);
    }

    @Override
    public List<Enterprise> readAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Enterprise readById(Integer id) throws Exception {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
