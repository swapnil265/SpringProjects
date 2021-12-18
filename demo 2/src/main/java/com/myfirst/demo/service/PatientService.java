package com.myfirst.demo.service;

import com.myfirst.demo.model.Patient;
import com.myfirst.demo.patientRepository.PatientRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    //Find Patient by ID
    public Patient findById(Integer id) {

        //Patient p1 = dummyPatientRepository.xyz();
       return patientRepository.findById(id).orElse(null);

    }

    //Add Patient in Database
    public void addPatient (Patient patient){
      patientRepository.save(patient);
    }

    //Delete By ID
    public void deletePatientById(Integer id){
        patientRepository.deleteById(id);

    }
    //Update Patient
    public Patient updatePatient(Patient patient){
        patientRepository.save(patient);
        return patientRepository.findById(patient.getId()).orElse(null);
    }


    //Delete by Name
    public Patient deletePatientByName (Patient patient){
       return null;

    }









}