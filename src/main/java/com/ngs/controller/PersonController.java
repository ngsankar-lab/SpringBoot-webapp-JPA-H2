package com.ngs.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ngs.DAO.PersonRepo;
import com.ngs.model.Person;

@Controller
public class PersonController {
	
	@Autowired
	PersonRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/addPerson")
	public String addPerson(Person person) {
		repo.save(person);
		return "home.jsp";
	}
	@RequestMapping("/getPerson")
	public ModelAndView getPerson(@RequestParam int	pid) {
		System.out.println("Inside getperson method");
		ModelAndView mv=new ModelAndView("showPerson.jsp");
		Person person=repo.findById(pid).orElse(new Person());
		System.out.println(repo.findByPaddress("USA"));
		System.out.println(repo.findByPidGreaterThan(2));
		System.out.println(repo.findByPaddressSorted("USA"));
	
		mv.addObject(person);
		return mv;
	}
}
