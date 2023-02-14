package com.mssoftware.auth.rest;

import com.mssoftware.auth.api.AuthApi;
import com.mssoftware.auth.api.domain.Persona;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController implements AuthApi {


    public ResponseEntity<Persona> getDataAuth() {
        Persona persona = new Persona();
        persona.setNombre("Samelo");
        persona.setApellido("Aldana40");

        return new ResponseEntity<>(persona , HttpStatus.OK);
    }
}
