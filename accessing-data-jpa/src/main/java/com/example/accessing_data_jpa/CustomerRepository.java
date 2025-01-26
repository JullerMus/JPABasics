package com.example.accessing_data_jpa;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> { //CrudRepository<JPA Entity, ID data type>

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);


}
