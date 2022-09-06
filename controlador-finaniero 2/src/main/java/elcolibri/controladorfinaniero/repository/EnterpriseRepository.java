package elcolibri.controladorfinaniero.repository;

import elcolibri.controladorfinaniero.model.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriseRepository extends JpaRepository<Enterprise,Integer> {

}
