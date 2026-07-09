package com.axsos.exam.repositires;

import com.axsos.exam.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Long> {

}
