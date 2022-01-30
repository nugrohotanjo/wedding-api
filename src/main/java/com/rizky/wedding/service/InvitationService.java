package com.rizky.wedding.service;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rizky.wedding.model.Invitation;
import com.rizky.wedding.repository.InvitationRepository;

@Service
public class InvitationService {
	
	@Autowired
	private InvitationRepository invitationRepository;
	
	public Invitation save(Invitation invitation){
		invitation.setCode(this.generateRandomChars());
		return invitationRepository.save(invitation);
	}
	
	public Optional<Invitation> getByCode(String code){
		return invitationRepository.findByCode(code);
	}
	
	public String generateRandomChars() {
		String candidateChars = "abcdefghijklmnopqrstuvwxyz";
		
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    for (int i = 0; i < 7; i++) {
	        sb.append(candidateChars.charAt(random.nextInt(candidateChars
	                .length())));
	    }

	    return sb.toString();
	}

}
