package com.vp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vp.model.Student;
import com.vp.service.StudentService;

@Controller
public class FormController {
     
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/listStudents")
	String getData(Model model) {
		List<Student> list = studentService.getStudent();
		model.addAttribute("list", list);
		return "form";
	}
	
	@RequestMapping("/form")
	String getForm(Model model) {
		
		model.addAttribute("student", new Student());
		return "getForm";
	}
	
	@PostMapping("/saveStudent")
	String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveOrUpdate(student);
		return "redirect:/listStudents";
		
	}
}
