package guru.springframework.spring5webapp.repositories;
//Author:Adio Adedeji Roheem,Wanjiru Wangodu;
import guru.springframework.spring5webapp.domain.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customers,Long> {
}
