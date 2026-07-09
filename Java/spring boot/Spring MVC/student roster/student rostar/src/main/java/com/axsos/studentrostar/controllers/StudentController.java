package com.axsos.studentrostar.controllers;

import com.axsos.studentrostar.models.Dorm;
import com.axsos.studentrostar.models.Student;
import com.axsos.studentrostar.services.DormServices;
import com.axsos.studentrostar.services.StudentService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;
    private  final DormServices dormServices;

    public StudentController(StudentService studentService,DormServices dormServices) {
        this.studentService = studentService;
        this.dormServices = dormServices;
    }

    @RequestMapping("")

    public String showStudent(@ModelAttribute("students") Student student, Model model) {
        List<Dorm> dorms = dormServices.showAllTheDorms();
        model.addAttribute("dorms",dorms);
        return "newStudent";
    }

    @PostMapping("/create")
    public String createStudent(Model model, @Valid @ModelAttribute("students") Student student, BindingResult result) {
        if(result.hasErrors()){
            model.addAttribute("dorms", dormServices.showAllTheDorms());
            return "newStudent";
        }
        studentService.createCallStudent(student);
        return "redirect:/dorms";
    }

    @RequestMapping("/delete/{student_id}/{dorm_id}")
    public String deleteTheStudent(@PathVariable("student_id")Long student_id,@PathVariable("dorm_id")Long dorm_id){
        studentService.deleteCallStudent(student_id);
        return "redirect:/dorms/"+dorm_id;
    }
}
