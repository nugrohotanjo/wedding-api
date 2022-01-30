package com.rizky.wedding.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rizky.wedding.model.Guest;


public interface GuestRepository extends JpaRepository<Guest, String> {
	public List<Guest> findAllByOrderByIdDesc();
}

