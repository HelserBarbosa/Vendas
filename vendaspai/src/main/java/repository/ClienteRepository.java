package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,String>{

}
