package com.fvarasg.inicio.service;

import java.util.List;

import com.fvarasg.inicio.model.Contacto;

public interface IAgendaService {
	
	boolean agregarContacto(Contacto contacto);
	List<Contacto> recuperarContactos();
	void actualizarContacto(Contacto contacto);
	boolean eliminarContacto(int idContacto);
	Contacto buscarContacto(int idContacto);
}
