package com.rizky.wedding.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rizky.wedding.model.Invitation;

public interface InvitationRepository extends JpaRepository<Invitation, String> {
	Optional<Invitation> findByCode(String code);
}
