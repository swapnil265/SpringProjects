package com.example.demo.billing.client;

import com.example.demo.billing.dto.InsuranceDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

public class PatientClient {

    RestTemplate restTemplate;
 public void getPatientData(){

     String URL = "http://127.0.0.1:8080/HelloWorld/1";
     restTemplate.exchange(URL,
             HttpMethod.GET,
             null,
             new ParameterizedTypeReference<InsuranceDto>() {
             }
     );



 }

}
