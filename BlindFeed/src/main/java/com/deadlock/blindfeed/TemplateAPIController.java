package com.deadlock.blindfeed;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.deadlock.template.Impl.PersonDAOImpl;
import com.deadlock.template.model.Person;

@Controller
public class TemplateAPIController {
	
	/*
	 * this controller for the implementing person activities
	 * */
	
	@Autowired PersonDAOImpl person;
	
	
	/*
	 * when click the person api it calls this function
	 * this starting page for person operations
	 * 
	 *  */
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String start(){
		return "TempPersonViews/Temphome";
	}

	/*
	 * when this method is called it displys the add person form
	 * this method returns the name of the form page with person object
	 * modelandView
	 * */
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String AddPerson(Map<String,Object> modelmap,Model model){
	
		Person person=new Person();
		modelmap.put("person", person);
		return "TempPersonViews/Tempform";
		
	}
	
	/*
	 * after submiting form it calls the action attribute /process
	 * this method process the given data input to the above passed person object
	 * that object will be called and extract content of that object
	 * @ModelAttribute("person") using this can be called
	 * finnaly insert data into database 
	 * and redirected to the result page
	 * */
	@RequestMapping(value="/process",method=RequestMethod.POST)
	public String ProcessData(@ModelAttribute("person") Person personmodel){
		
		/*for testing*/
		System.out.println("first name "+personmodel.getFname());
		System.out.println("last name "+personmodel.getLname());
		System.out.println("age is "+personmodel.getAge());
		
		person.insert(personmodel);		
		return "redirect:/view";		
	}
	
	/*
	 * when the this method calls it lists the available user in database
	 * list object contain the list of users who are available in database
	 * then pass data object to page using model
	 * */
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public String DisplayData(Model model){

		List<Person> list=person.getPersonList();
		model.addAttribute("PersonList", list);
		
		/*for testing*/
		for (Person person : list) {
			System.out.println("Name is "+person.getFname()+" "+person.getLname()+" age is "+person.getAge());
		}
		return "TempPersonViews/Tempresults";
	}

	
}
