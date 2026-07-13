package com.axsos.projectmanager.services;

import com.axsos.projectmanager.models.Project;
import com.axsos.projectmanager.models.User;
import com.axsos.projectmanager.repositires.ProjectRepo;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectServices {
private final ProjectRepo projectRepo;

public ProjectServices(ProjectRepo projectRepo){
    this.projectRepo = projectRepo;
}
 public List<Project> getAllProjects(){
    return projectRepo.findAll();
 }
 public Project getSingleProjectById(Long project_id){
     Optional<Project> optionalProject = projectRepo.findById(project_id);
     if(optionalProject.isPresent()){
             return optionalProject.get();
     }
     return null;

 }
 public void createCallProject(Project project){
//     if (project.getDueDate() != null){
//         LocalDate today = LocalDate.now();
//         LocalDate maxAllowedDate = today.plusYears(1);
//         if(project.getDueDate().isBefore(today)){
//             result.rejectValue("dueDate", "PastDate", "Date must not be in the past");
//         } else if (project.getDueDate().isAfter(maxAllowedDate)) {
//            result.rejectValue("dueDate","TooFarAhead","Due date must be within " + maxAllowedDate + " years from today");
//         }
//     }
    projectRepo.save(project);
 }
 public void deleteCallProject(Long project_id){
    projectRepo.deleteById(project_id);
 }
 public Project updateCallProject(Long project_id, String title, String leaderName, String description,LocalDate dueDate){
    Project project = getSingleProjectById(project_id);
    project.setLeaderName(leaderName);
    project.setTitle(title);
    project.setDescription(description);
    project.setDueDate(dueDate);
    return projectRepo.save(project);
 }
    // ===== Project BROKER FEATURE =====
    // Everything below supports the borrow/return dashboard.
    // Borrowing only touches the project's "borrower" field —
    // it never touches "user" (the original owner/poster).

    // projects shown on the dashboard's top table: anything unborrowed
    // (so others can borrow it), plus the logged-in user's own projects
    // regardless of borrow status (so an owner never loses sight of
    // their own project — it just shows edit/delete instead of borrow).
//    public List<Project> getAvailableProjects(User currentUser){
//        return projectRepo.findByBorrowerIsNullOrUser(currentUser);
//    }

    // projects the logged-in user is currently borrowing.
    // Feeds the "projects I'm Borrowing" table.
//    public List<Project> getBorrowedProjects(User currentUser){
//        return projectRepo.findByBorrower(currentUser);
//    }

    // Marks a project as borrowed by the logged-in user.
    public void borrowProject(Long project_id, User currentUser){
        Project project = getSingleProjectById(project_id);
        project.setBorrower(currentUser);
        projectRepo.save(project);
    }

    // Clears a project's borrower, making it available again.
    public void returnProject(Long project_id){
        Project project = getSingleProjectById(project_id);
        project.setBorrower(null);
        projectRepo.save(project);
    }
    // All projects EXCLUDING the ones the logged-in user created.
    public List<Project> getAvailableProjects(User currentUser){
        return projectRepo.findByUserNot(currentUser);
    }

    // Projects the logged-in user created themselves.
    public List<Project> getMyProjects(User currentUser){
        return projectRepo.findByUser(currentUser);
    }


}


