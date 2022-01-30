package com.rizky.wedding.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rizky.wedding.model.Guest;
import com.rizky.wedding.service.GuestService;

@Validated
@CrossOrigin
@RestController
@RequestMapping("/api")
public class GuestController {

	@Autowired
	private GuestService guestService;
	
	// get all guest
	@GetMapping("/guest")
	public Iterable<Guest> getAll() {
		return guestService.getAll();
	}
	
	// insert
    @PostMapping("/guest")
	public HashMap<String,String> insert(@RequestBody Guest guest){
		// insert data
    	guestService.save(guest);
		
    	// return response
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("code", "200");
		map.put("message","Success Save Guest Book");
    	
		return map;
    }
}
