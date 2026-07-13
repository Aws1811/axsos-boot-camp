package com.axsos.projectmanager.controllers;

import com.axsos.projectmanager.models.Project;
import com.axsos.projectmanager.models.User;
import com.axsos.projectmanager.services.ProjectServices;
import com.axsos.projectmanager.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projects")
public class ProjectController {
private final ProjectServices projectServices;
    private final UserService userService;

    public ProjectController(ProjectServices projectServices, UserService userService){
    this.projectServices = projectServices;
        this.userService = userService;
    }

@RequestMapping("")
public String showProjects(HttpSession session, Model model){
    if (session.getAttribute("id") == null) {
        return "redirect:/";
    }
    Long id = (Long) session.getAttribute("id");
    User currentUser = userService.findUserById(id);
    model.addAttribute("user", currentUser);
    model.addAttribute("availableProjects", projectServices.getAvailableProjects(currentUser));
    model.addAttribute("borrowedProjects", projectServices.getMyProjects(currentUser));
    return "projects";
}

@RequestMapping("/create")
public String createProjectPage(HttpSession session,Model model){
    if (session.getAttribute("id") == null) {
        return "redirect:/";
    }
    Long id = (Long) session.getAttribute("id");
    model.addAttribute("user", userService.findUserById(id));
    model.addAttribute("projects",new Project());
        return "createproject";
}

@PostMapping("/create/new")
    public String createProject(HttpSession session, @Valid @ModelAttribute("projects") Project project, BindingResult result, Model model){
    if (session.getAttribute("id") == null) {
        return "redirect:/";
    }
    if(result.hasErrors()){
        model.addAttribute("projects", project);
        return "createproject";
    }
    Long id = (Long) session.getAttribute("id");
        User user = userService.findUserById(id);
        project.setUser(user);
        model.addAttribute("user",userService.findUserById(id));
        projectServices.createCallProject(project);
        return "redirect:/projects";
}

@RequestMapping("/update/{project_id}")
public String updateProjectPage(@PathVariable("project_id")Long project_id,HttpSession session,Model model){
        if (session.getAttribute("id") == null) {
        return "redirect:/";
    }
    Project project = projectServices.getSingleProjectById(project_id);
    Long sessionId = (Long) session.getAttribute("id");
    if (!project.getUser().getId().equals(sessionId)) {
        return "redirect:/projects";
    }

    Long id = (Long) session.getAttribute("id");

    model.addAttribute("projects", project);
    model.addAttribute("user",userService.findUserById(id));
    return "updateproject";
}

    @PostMapping("update/{project_id}/edit")
    public String updateProject(HttpSession session, @PathVariable("project_id") Long project_id,
                             @Valid @ModelAttribute("projects") Project project, BindingResult result, Model model){
        if (session.getAttribute("id") == null) {
            return "redirect:/";
        }
        Long sessionId = (Long) session.getAttribute("id");
        Project existing = projectServices.getSingleProjectById(project_id);
        if (!existing.getUser().getId().equals(sessionId)) {
            return "redirect:/projects";
        }
        if (result.hasErrors()){
            model.addAttribute("projects", project);
            return "updateproject";
        }
        projectServices.updateCallProject(project_id, project.getTitle(), project.getLeaderName(), project.getDescription(),project.getDueDate());
        return "redirect:/projects";
    }
@RequestMapping("/delete/{project_id}")
public  String deleteProject(@PathVariable("project_id") Long project_id,HttpSession session){
    if (session.getAttribute("id") == null) {
        return "redirect:/";
    }
    Project project = projectServices.getSingleProjectById(project_id);
    Long sessionId = (Long) session.getAttribute("id");
    if (!project.getUser().getId().equals(sessionId)) {
        return "redirect:/projects";
    }
    projectServices.deleteCallProject(project_id);
    return "redirect:/projects";
    }
@RequestMapping("/{project_id}")
public String showProject(@PathVariable("project_id")Long project_id,HttpSession session,Model model) {
    if (session.getAttribute("id") == null) {
        return "redirect:/";
    }
    Long id = (Long) session.getAttribute("id");
    model.addAttribute("user", userService.findUserById(id));
        model.addAttribute("project", projectServices.getSingleProjectById(project_id));
        return "projectdetails";
    }
    // ===== project FEATURE =====
    // Marks the project as borrowed by the logged-in user.
    // Single-link action, same style as delete project.
    @RequestMapping("/{project_id}/borrow")
    public String borrowProject(@PathVariable("project_id") Long project_id, HttpSession session){
        if (session.getAttribute("id") == null) {
            return "redirect:/";
        }
        Long id = (Long) session.getAttribute("id");
        User currentUser = userService.findUserById(id);
        projectServices.borrowProject(project_id, currentUser);
        return "redirect:/projects";
    }

    // Clears the borrower, returning the project to the available pool.
    @RequestMapping("/{project_id}/return")
    public String returnProject(@PathVariable("project_id") Long project_id, HttpSession session){
        if (session.getAttribute("id") == null) {
            return "redirect:/";
        }
        projectServices.returnProject(project_id);
        return "redirect:/projects";
    }
}
