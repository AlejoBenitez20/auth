package com.mssoftware.auth.api;

import com.mssoftware.auth.api.domain.Persona;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


public interface AuthApi {

    @RequestMapping(value = "/auth/1.0.0/get",
            produces = {"application/json"},
            method = RequestMethod.GET)
    default ResponseEntity<Persona> getDataAuth(){

        return new ResponseEntity<>(HttpStatus.OK);
    }


}
