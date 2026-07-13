package com.axsos.projectmanager.repositires;

import com.axsos.projectmanager.models.Project;
import com.axsos.projectmanager.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ProjectRepo extends CrudRepository<Project,Long> {
    List<Project> findAll();

    // Books that are either unborrowed (available to anyone) OR
// owned by this specific user (owner always sees their own book,
// even while someone else is borrowing it).
    List<Project> findByBorrowerIsNullOrUser(User user);

    // "Books I'm Borrowing" table — every book currently borrowed
    // by this specific user.
    List<Project> findByBorrower(User borrower);

    List<Project> findByBorrowerIsNullAndUserNot(User user);

    List<Project> findByUserNot(User user);
    List<Project> findByUser(User user);
}
