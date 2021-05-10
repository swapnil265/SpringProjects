package com.GuestManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GuestManagementSystem.model.Guest;


@Repository
public interface GuestRepository extends JpaRepository<Guest,Long>{

}
