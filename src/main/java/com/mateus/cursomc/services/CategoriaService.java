package com.mateus.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateus.cursomc.domain.Categoria;
import com.mateus.cursomc.repositories.CategoriaRepository;
import com.mateus.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		//return obj.orElse(null);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " +id+", Tipo: "+ Categoria.class.getName()));
				

		
	}
	
	public Categoria insert(Categoria obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
	public Categoria update(Categoria obj) {
		
		return repo.save(obj);
	}
}
