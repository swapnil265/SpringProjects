package com.GuestManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GuestManagementSystem.model.Guest;
import com.GuestManagementSystem.repository.GuestRepository;

@Service
public class GuestServiceImpl implements GuestService{

	
	@Autowired
	private GuestRepository guestRepository;
	@Override
	
	public List<Guest> getAllGuest() {
		// TODO Auto-generated method stub
		return guestRepository.findAll();
	}
	@Override
	public void saveGuest(Guest guest) {
		// TODO Auto-generated method stub
		this.guestRepository.save(guest);
	}
	
	
	@Override
	public Guest getGuestById(long id) {
		// TODO Auto-generated method stub
		Optional<Guest> optional = guestRepository.findById(id);
		Guest guest = null;
		if(optional.isPresent()) {
			guest = optional.get();
		}
		else {
			throw new RuntimeException("guest not found by the provided id: " +id );
		}
		return guest;
	}
	
	
	

}
