package com.fiap.postech.ecommerce.controller;

import com.fiap.postech.ecommerce.entity.CarrinhoDeCompras;
import com.fiap.postech.ecommerce.service.CarrinhoDeComprasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;

@RestController ("/carrinhos")
public class CarrinhoDeComprasController {

    @Autowired
    private CarrinhoDeComprasService carrinhoDeComprasService;

    @PostMapping
    public ResponseEntity<?> criarCarrinho(@RequestBody CarrinhoDeCompras carrinho) {
        try {
            CarrinhoDeCompras novoCarrinho = carrinhoDeComprasService.criarCarrinho(carrinho);
            return new ResponseEntity<>(novoCarrinho, HttpStatus.CREATED);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>("Um ou mais produtos não estão disponíveis.", HttpStatus.BAD_REQUEST);
        }
    }

}
