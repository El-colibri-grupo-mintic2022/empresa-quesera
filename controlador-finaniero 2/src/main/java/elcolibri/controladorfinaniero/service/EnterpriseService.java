package elcolibri.controladorfinaniero.service;

import elcolibri.controladorfinaniero.model.Enterprise;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Locale;

public interface EnterpriseService {

    Enterprise create(Enterprise enterprise) throws Exception;
    Enterprise update(Enterprise enterprise) throws Exception;
    List<Enterprise> readAll() throws Exception;
    Enterprise readById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;


}
