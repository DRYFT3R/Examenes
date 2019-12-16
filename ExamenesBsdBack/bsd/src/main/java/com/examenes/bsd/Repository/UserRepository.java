package com.examenes.bsd.Repository;

import com.examenes.bsd.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
