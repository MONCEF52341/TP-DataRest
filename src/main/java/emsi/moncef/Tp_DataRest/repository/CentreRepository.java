package emsi.moncef.Tp_DataRest.repository;

import emsi.moncef.Tp_DataRest.model.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "centers")
public interface CentreRepository extends JpaRepository<Centre, Long> {
}
