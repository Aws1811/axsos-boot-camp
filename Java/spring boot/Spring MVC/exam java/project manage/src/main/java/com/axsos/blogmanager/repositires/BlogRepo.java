package com.axsos.blogmanager.repositires;

import com.axsos.blogmanager.models.Blog;
import com.axsos.blogmanager.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface BlogRepo extends CrudRepository<Blog,Long> {
    List<Blog> findAll();

    // Books that are either unborrowed (available to anyone) OR
// owned by this specific user (owner always sees their own book,
// even while someone else is borrowing it).
    List<Blog> findByBorrowerIsNullOrUser(User user);


    List<Blog> findByBorrower(User borrower);

    List<Blog> findByBorrowerIsNullAndUserNot(User user);

    List<Blog> findByUserNot(User user);
    List<Blog> findByUser(User user);





//    package com.axsos.projectmanager.repositires;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//
//import com.axsos.projectmanager.models.Blog;
//import com.axsos.projectmanager.models.User;

//    @Repository
//    public interface BlogRepo extends CrudRepository<Blog, Long> {
//
//        // ===== Standard CRUD, explicitly declared =====
//
//        // Get all projects
//        List<Blog> findAll();
//
//        // Get one project by id
//        Optional<Blog> findById(Long project_id);
//
//        // Create or update a project (JPA's save() does both —
//        // insert if the id is null, update if it already exists)
//        Blog save(Blog project);
//
//        // Delete a project by id
//        void deleteById(Long project_id);
//
//        // ===== Custom queries specific to this app =====
//
//        // "Everyone else's projects" — used by getAvailableProjects
//        List<Blog> findByUserNot(User user);
//
//        // "Projects I created" — used by getMyProjects
//        List<Blog> findByUser(User user);
//
//        // Borrow/return feature (currently paused, kept declared)
//        List<Blog> findByBorrowerIsNullOrUser(User user);
//        List<Blog> findByBorrower(User borrower);
//    }
}
