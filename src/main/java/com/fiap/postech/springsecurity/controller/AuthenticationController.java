package com.fiap.postech.springsecurity.controller;


import com.fiap.postech.springsecurity.dto.auth.AuthenticationResponse;
import com.fiap.postech.springsecurity.services.auth.AutenticationServices;
import com.fiap.postech.springsecurity.dto.auth.AuthenticationResquest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AutenticationServices autenticationServices;

    @GetMapping("/validate-token")
    public ResponseEntity<Boolean> validate(@RequestParam String jwt){

      boolean isTokenValid = autenticationServices.validateToken(jwt);
      return ResponseEntity.ok(isTokenValid);
    }
    @PostMapping("authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody @Valid AuthenticationResquest
                                                                       requestAuthentication){
        AuthenticationResponse rsp = autenticationServices.login(requestAuthentication);
        return ResponseEntity.ok(rsp);
    }
}
