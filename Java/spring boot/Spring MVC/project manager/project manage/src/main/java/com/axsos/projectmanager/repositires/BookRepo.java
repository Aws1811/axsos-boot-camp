package com.axsos.projectmanager.repositires;

import com.axsos.projectmanager.models.Book;
import com.axsos.projectmanager.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface BookRepo extends CrudRepository<Book,Long> {
    List<Book> findAll();

    // Books that are either unborrowed (available to anyone) OR
// owned by this specific user (owner always sees their own book,
// even while someone else is borrowing it).
    List<Book> findByBorrowerIsNullOrUser(User user);

    // "Books I'm Borrowing" table — every book currently borrowed
    // by this specific user.
    List<Book> findByBorrower(User borrower);

    List<Book> findByBorrowerIsNullAndUserNot(User user);
}
