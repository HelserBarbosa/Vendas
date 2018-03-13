package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.Pizza;

@Repository
public interface PizzaRepository extends CrudRepository<Pizza, String> {

}
