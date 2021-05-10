package com.GuestManagementSystem.service;

import java.util.List;
import com.GuestManagementSystem.model.Guest;

public interface GuestService {
	
	public List<Guest> getAllGuest(); 
	public void saveGuest(Guest guest);
	public Guest getGuestById(long id);
}
