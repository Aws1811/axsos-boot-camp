package com.axsos.blogmanager.repositires;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.blogmanager.models.User;

// Repository for saving user data to the database.
// IMPORTANT: there is no need to create a repository for LoginUser
// since we only intend to save instances of User in the database.
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    // Finds a user by their email.
    // Returns an Optional: a container that may or may not hold a User,
    // which makes database queries safer when the object may not exist.
    Optional<User> findByEmail(String email);
}









//package com.axsos.projectmanager.repositires;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//
//import com.axsos.projectmanager.models.User;
//
//@Repository
//public interface UserRepository extends CrudRepository<User, Long> {
//
//    // ===== Standard CRUD, explicitly declared =====
//    List<User> findAll();
//    Optional<User> findById(Long id);
//    User save(User user);
//    void deleteById(Long id);
//
//    // ===== Custom query =====
//    Optional<User> findByEmail(String email);
//}