package com.koreinfotech.sms.Controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.koreinfotech.sms.Service.IStudentService;
import com.koreinfotech.sms.Service.StudentServiceImplementation;
import com.koreinfotech.sms.domain.Student;

@Controller
public class SpringController {
	private IStudentService studentService=new StudentServiceImplementation();
	
	@RequestMapping("/")
	public String showHome(){
		return "index";
	}
	
	@RequestMapping("/newcontactform")
	public String showContactForm(){
		return "RegistrationForm";
	}
	
	/*@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView addNewContact(@ModelAttribute("contact")Student student, BindingResult result){
		ModelAndView mav = new ModelAndView("StudentContactAdded");
		mav.addObject("contact", student);
		studentService.addStudentContact(student);
		return mav;
		
	}*/
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addStudentContact(@ModelAttribute("contact")
	Student student, BindingResult result) {
		studentService.addStudentContact(student);
		//return "redirect:/StudentContactAdded";
		return"StudentContactAdded";
	}
	/*@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addNewContact(@ModelAttribute("contact")Student student, BindingResult result){
		//Model.addAttribute("student", student);
		System.out.println("New Contact: " + student.toString());	
		studentService.addStudentContact(student); //add contact object to DB
		if(result.hasErrors()){
			return "RegistrationForm";
		}
		else{
			System.out.println("New Contact:" +student.toString());
			studentService.addStudentContact(student);
			return "StudentContactAdded";
		}			
	}*/		
	
	@RequestMapping("/listcontacts")
	public String listAllContacts(Map<String,Object> map){
	   map.put("contact",new Student());
	   map.put("studentcontactlist",studentService.getALLStudent());
		return "StudentContactList";
	}
	@RequestMapping("/delete/{id}")
	public String deleteContact(@PathVariable("id")Integer id){
		studentService.deleteStudentContact(id);
		return "redirect:/listcontacts";
	}
	
}
