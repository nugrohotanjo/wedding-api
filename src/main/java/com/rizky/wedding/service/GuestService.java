package com.rizky.wedding.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rizky.wedding.model.Guest;
import com.rizky.wedding.repository.GuestRepository;

@Service
public class GuestService {
	
	@Autowired
	private GuestRepository guestRepository;
	
	public Guest save(Guest guest){
		
		// create a list of Integer type
        List<String> list = new ArrayList<>();
        // add 5 element in ArrayList
        list.add("#81ecec");
        list.add("#74b9ff");
        list.add("#a29bfe");
        list.add("#dfe6e9");
        list.add("#00b894");
        list.add("#00cec9");
        list.add("#0984e3");
        list.add("#6c5ce7");
        list.add("#b2bec3");
        list.add("#ffeaa7");
        list.add("#fab1a0");
        list.add("#ff7675");
        list.add("#fd79a8");
        list.add("#636e72");
        list.add("#fdcb6e");
        list.add("#e17055");
        list.add("#d63031");
        list.add("#e84393");
        list.add("#2d3436");

		Random rand = new Random();
        list.get(rand.nextInt(list.size()));
		
		guest.setBname(list.get(rand.nextInt(list.size())));
		
		return guestRepository.save(guest);
	}
	
	public Iterable<Guest> getAll(){
		return guestRepository.findAllByOrderByIdDesc();
	}

}
