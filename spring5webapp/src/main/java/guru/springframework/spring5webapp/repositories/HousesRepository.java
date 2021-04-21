package guru.springframework.spring5webapp.repositories;
//Author:Adio Roheem,Wanjiru Wangodu
import guru.springframework.spring5webapp.domain.Houses;
import org.springframework.data.repository.CrudRepository;

public interface HousesRepository extends CrudRepository<Houses,Long> {
}
