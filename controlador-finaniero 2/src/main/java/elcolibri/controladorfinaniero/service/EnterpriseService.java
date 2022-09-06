package elcolibri.controladorfinaniero.service;

import elcolibri.controladorfinaniero.model.Enterprise;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Locale;

public interface EnterpriseService {

    Enterprise create (Enterprise enterprise);
    Enterprise update (Enterprise enterprise);
    List<Enterprise> readAll();
    Enterprise readById(Long id);
    void delete(Long id);

}
