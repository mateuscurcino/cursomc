package com.mateus.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.cursomc.domain.Pedido;
import com.mateus.cursomc.services.PedidoService;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {

	@Autowired
	private PedidoService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Pedido> listar(@PathVariable Integer id) {
		
		Pedido c = service.find(id);
		
		return ResponseEntity.ok().body(c);
		
		/*Pedido cat1 = new Pedido(1, "Informatica");
		Pedido cat2 = new Pedido(2, "Escritorio");
		
		List<Pedido> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;*/
	}
	
}
