package com.fvarasg.inicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fvarasg.inicio.model.Contacto;
import com.fvarasg.inicio.service.IAgendaService;

@RestController
public class ContactosController {
	
	@Autowired
	IAgendaService agenda;
	
	@GetMapping(value="contactos", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Contacto> recuperarContactos(){
		return agenda.recuperarContactos();
	}
	
	@GetMapping(value="contactos/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Contacto recuperarContacto(@PathVariable int id){
		return agenda.buscarContacto(id);
	}
	
	@PostMapping(value="contactos",consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public String crearContacto(@RequestBody Contacto contacto) {
		return String.valueOf(agenda.agregarContacto(contacto));
		
	}
	
	@PutMapping(value="contactos",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void ActualizarContacto(@RequestBody Contacto contacto) {
		agenda.actualizarContacto(contacto);
		
	}
	
	@DeleteMapping(value="contactos/{id}")
	public void ActualizarContacto(@PathVariable("id") int idContacto) {
		agenda.eliminarContacto(idContacto);
	}
	
	
}
