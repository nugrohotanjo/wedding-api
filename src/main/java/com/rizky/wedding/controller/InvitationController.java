package com.rizky.wedding.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rizky.wedding.model.Invitation;
import com.rizky.wedding.service.InvitationService;

@Validated
@CrossOrigin
@RestController
@RequestMapping("/api")
public class InvitationController {

	@Autowired
	private InvitationService invitationService;
	
    @GetMapping("/invitation/{code}")
	public Optional<Invitation> getByCode(@PathVariable String code){
		return invitationService.getByCode(code);
    }
	
	// insert
    @PostMapping("/invitation")
	public Invitation insert(@RequestBody Invitation invitation){
		return invitationService.save(invitation);
    }
	
}
