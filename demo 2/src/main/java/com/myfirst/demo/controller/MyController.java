package com.myfirst.demo.controller;

import com.myfirst.demo.model.Patient;
import com.myfirst.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/HelloWorld")
public class MyController {

    PatientService patientService;
    @Autowired
    MyController(PatientService PatientService){
        this.patientService = PatientService;
    }


    @RequestMapping(method = RequestMethod.GET ,value = "/HelloWorld")
    public String HelloWorld() {

        return "Hello this is Yo";
   }
    //getPatientByID - Read Operation
    @GetMapping("/{id}")
   public ResponseEntity<Patient> returnParameterMethod(@PathVariable("id") int id){
        Patient patient  = patientService.findById(id);
        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(patient);
    }
    //Create Operation
    @PostMapping("/patient")
    public ResponseEntity.BodyBuilder addPatient(@RequestBody Patient patient){
        patientService.addPatient(patient);
        return ResponseEntity.status(HttpStatus.OK);
    }

    //Delete Operation
    @DeleteMapping("/delete/{id}")
    public ResponseEntity.BodyBuilder delete (@PathVariable int id){
        patientService.deletePatientById(id);
       return ResponseEntity.status(HttpStatus.OK);
    }

    //Update Patient
    @PutMapping("/updatePatient")
    public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient){
        Patient updatedPatient = patientService.updatePatient(patient);
        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(patient);
    }


}
