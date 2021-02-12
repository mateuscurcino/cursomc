package com.mateus.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.cursomc.domain.Cliente;
import com.mateus.cursomc.services.ClienteService;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {

	@Autowired
	private ClienteService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id) {
		
		Cliente c = service.buscar(id);
		
		return ResponseEntity.ok().body(c);
		
		/*Cliente cat1 = new Cliente(1, "Informatica");
		Cliente cat2 = new Cliente(2, "Escritorio");
		
		List<Cliente> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;*/
	}
	
}
