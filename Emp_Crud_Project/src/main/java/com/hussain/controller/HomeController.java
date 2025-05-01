package com.hussain.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hussain.dao.EmpDao;
import com.hussain.entity.Emp;


@Controller
public class HomeController {
	
	
	@Autowired
	private EmpDao empDao;
	
	@RequestMapping(path = {"/", "/home"})
	public String home(Model model){
		 List<Emp> list = empDao.getAllEmp();
	        model.addAttribute("empList", list);
	return "home";
	}
	
	 @RequestMapping("/add_emp")
	    public String add_Emp(Model model) {
	        List<Emp> list = empDao.getAllEmp();
	        model.addAttribute("empList", list);
	        return "add_emp";
	    }
	 
		/*
		 * @RequestMapping(path = "/createEmp", method = RequestMethod.POST)//createEmp
		 * public String createEmp(@ModelAttribute Emp emp) { System.out.println(emp);
		 * //
		 * employeeDetails.setDesignationDetails(designationDao.getDesignationById(id));
		 * int i = empDao.saveEmp(emp);
		 * 
		 * // session.setAttribute("msg", "Registration Successful"); return "add_emp";
		 * }
		 */
//	 @RequestMapping(path = "/createEmp", method = RequestMethod.POST)
//	 public String createEmp(@ModelAttribute Emp emp, HttpSession session) {
//	     try {
//	         System.out.println(emp);
//	         int i = empDao.saveEmp(emp);
//	         session.setAttribute("msg", "Employee added successfully!");
//	     } catch (Exception e) {
//	         session.setAttribute("msg", "Error adding employee: " + e.getMessage());
//	         e.printStackTrace();
//	     }
//	     return "add_emp";
//	 }

	 @RequestMapping(path = "/createEmp", method = RequestMethod.POST)//add_Emp
	 public String createEmp(@ModelAttribute Emp emp, HttpSession session) {
	     System.out.println("Received: " + emp.toString()); // Debug output
	     
	     try {
	         empDao.saveEmp(emp);
	         session.setAttribute("msg", "Employee added successfully!");
	     } catch (Exception e) {
	         session.setAttribute("msg", "Error: " + e.getMessage());
	         e.printStackTrace();
	     }
	     return "redirect:/add_emp";
	 }
	 @RequestMapping(path ="/editEmp/{id}")
	 public String editEmp(@PathVariable int id,Model m){
	 Emp emp = empDao.getEmpById(id);
	 m.addAttribute("emp",emp);
	 return "edit_emp";
	 }
	 

	@RequestMapping(path="/updateEmp",method = RequestMethod.POST)
	public String updateEmp(@ModelAttribute Emp emp,HttpSession session){
	empDao.update(emp);
	session.setAttribute("msg","update successfully");
	return "redirect:/home";
	}
	
	
	@RequestMapping(path="/deleteEmp/{id}")//,method=RequestMethod.POST
	public String deleteEmp(@PathVariable int id, HttpSession session){
	empDao.deleteEmp(id);
	session.setAttribute("msg", "Delete successfully");
	return "redirect:/home";

	}



	

}
