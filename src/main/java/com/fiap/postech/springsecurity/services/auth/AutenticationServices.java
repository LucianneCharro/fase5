package com.fiap.postech.springsecurity.services.auth;

import com.fiap.postech.springsecurity.dto.RegisteredUser;
import com.fiap.postech.springsecurity.dto.SaveUser;
import com.fiap.postech.springsecurity.dto.auth.AuthenticationResponse;
import com.fiap.postech.springsecurity.dto.auth.AuthenticationResquest;
import com.fiap.postech.springsecurity.persistencia.entity.User;
import com.fiap.postech.springsecurity.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AutenticationServices {

    @Autowired
    private UserServices userServices;

    @Autowired
    private JwtServices jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    public AutenticationServices(UserServices userServices, JwtServices jwtService) {
        this.userServices = userServices;
        this.jwtService = jwtService;
    }

    public RegisteredUser registerOneCustomer(SaveUser newUser) {
        User user = userServices.createOneCustomer(newUser);

        RegisteredUser userDTO = new RegisteredUser();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setUsername(user.getUsername());
        userDTO.setRole(user.getRole().name());

        String jwt = jwtService.generarToken(user, generateExtraClaims(user));
        userDTO.setJwt(jwt);
        return userDTO;
    }

    private Map<String, Object> generateExtraClaims(User user) {
        Map<String, Object> extraClaims = new HashMap<>();
        extraClaims.put("name", user.getName());
        extraClaims.put("role", user.getRole().name());
        extraClaims.put("authorities", user.getAuthorities());
        return extraClaims;
    }

    public AuthenticationResponse login(AuthenticationResquest requestAuthentication) {
        Authentication authentication = new UsernamePasswordAuthenticationToken(
                requestAuthentication.getUsername(), requestAuthentication.getPassword()
        );
        authenticationManager.authenticate(authentication);
        UserDetails oneByUsername = userServices.findOneByUsername(requestAuthentication.getUsername()).get();
        String jwt = jwtService.generarToken(oneByUsername,generateExtraClaims((User) oneByUsername));
        AuthenticationResponse authResp = new AuthenticationResponse();
        authResp.setJwt(jwt);
        return authResp;
    }

    public boolean validateToken(String jwt) {
        try{
            jwtService.extractUsername(jwt);
            return true;
        }catch (Exception e ){
            System.err.println(e.getMessage());
            return false;
        }
    }
}
