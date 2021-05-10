package com.GuestManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.GuestManagementSystem.model.Guest;
import com.GuestManagementSystem.service.GuestServiceImpl;

@Controller
public class GuestController {

	
@Autowired
private GuestServiceImpl guestService;
	

	//display list of guest
	@GetMapping("/")
	
	public String viewHomePage(Model model) {
	
		model.addAttribute("listAllGuest", guestService.getAllGuest());
		//	model.addAllAttributes("listGuest",guestService.getAllGuest());
		return "index";
		
	}
	
	@GetMapping("/showNewGuestForm")
	public String showNewGuestForm(Model model) {
		Guest guest = new Guest();
		model.addAttribute("guest", guest);
		return "newguest";
	}
	
	
	@PostMapping("/saveGuest")
	public String saveGuest(@ModelAttribute("guest") Guest guest) {
		//save guest to database
		guestService.saveGuest(guest);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable (value ="id") long id , Model model){
		
		//Get the details of the guest by id
	Guest guest = guestService.getGuestById(id)	;	
	
	//set guest as a model to prepopulate the data
	model.addAttribute("guest", guest);
	return "updateguest";
		
		
		
		
		
	}
	
	
	
	
	
}
