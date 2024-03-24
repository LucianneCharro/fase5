package com.fiap.postech.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "itens")
@Entity(name = "itens")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ItemPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int quantidade;
	
	private Long idProduto;
	
	@ManyToOne
	@JoinColumn(name = "id_carrinho")
	private CarrinhoDeCompras carrinho;
	
}
