package com.cg.iter.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.iter.entitie.Trainee;
import com.cg.iter.service.TraineeService;

@Controller
@RequestMapping("/")
public class TraineeController {
	@Autowired private TraineeService service;
	
	@GetMapping
	public String home(Model model){
		model.addAttribute("msg","Trainee Details");
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loggedIn(Model model,@RequestParam("user")String user,@RequestParam("pwd")String pass){
		if(user.equals("bishal")&&pass.equals("1234"))				
		return "operation";
		else
			return "login";
	}
	
	//Adding Operation
	@RequestMapping(value="/addTrainee",method=RequestMethod.GET)
	public String add(){

			return "addTrainee";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addtrainee(Model model,@ModelAttribute("trainee") Trainee trainee) {
	    try {     
	    	service.create(trainee);
	         model.addAttribute("msg","Trainee "+trainee.getName()+" added successfuly!");
	         model.addAttribute("trainee",new Trainee()); //Empty the form fields on success
	    }
	    catch(Exception e) {
	        model.addAttribute("msg","Trainee with "+trainee.getId()+" already exists!");
	    }
	         return "addTrainee";
	}

	
	//Delete Operation
	@RequestMapping(value="/deletetrainee",method=RequestMethod.GET)
	public String delete(Model model) {
		model.addAttribute("msg"," Delete Trainee");
		return "deletetrainee";
	}
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String deleteById(Model model,@RequestParam("deleteId") int id) {
		model.addAttribute("list",this.service.find(id));
		return "deletetrainee";
	}
	@RequestMapping(value="/deletetrainee/{id}",method=RequestMethod.POST)
	public String delete(Model model,@PathVariable("id") int id) {
		service.delete(id);
		return "deletetrainee";
	}
	
	//Modify Operation 
		@RequestMapping(value="/modifytrainee",method=RequestMethod.GET)
		public String modify(Model model) {
		model.addAttribute("msg"," modify Trainee");
			return "modifytrainee";
		}
		@RequestMapping(value="/modify",method=RequestMethod.POST)
		public String modifyById(Model model,@RequestParam("modifyId") int id) {
			model.addAttribute("list",this.service.find(id));
			return "modifytrainee";
		}
		@RequestMapping(value="/modifytrainee",method=RequestMethod.POST)
		public String modify(Model model,@ModelAttribute("trainee") Trainee trainee) {
			service.modify(trainee);
			model.addAttribute("msg","Trainee "+trainee.getId()+" modified");
			return "modifytrainee";
		}

	//retrieve Operation
	@RequestMapping(value="/retrievetrainee",method=RequestMethod.GET)
	public String retrieve(Model model) {
		model.addAttribute("msg","Retrieve Trainee");
		return "retrievetrainee";
	}
	@RequestMapping(value="/retrieve",method=RequestMethod.POST)
	public String retrievebyid(Model model,@RequestParam("retrieveId") int id ) {
		
		model.addAttribute("list",this.service.find(id));
		
		return "retrievetrainee";
	}
	
	//retrieving all Operation
		@RequestMapping(value="/retrievealltrainee",method=RequestMethod.GET)
		public String retrieveall(Model model) {
			
			model.addAttribute("list", this.service.getAll());
			
			return "retrievealltrainee";
		}
	
}
