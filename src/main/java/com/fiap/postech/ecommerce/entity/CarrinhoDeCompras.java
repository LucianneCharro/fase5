package com.fiap.postech.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Table(name = "carrinhos")
@Entity(name = "carrinhos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class CarrinhoDeCompras {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 private UUID idUsuario;
	 
	 @OneToMany(mappedBy = "carrinho", cascade = CascadeType.ALL, orphanRemoval = true)
	 private List<ItemPedido> itens = new ArrayList<>();
	 
	 private BigDecimal valorTotal;
	
}
