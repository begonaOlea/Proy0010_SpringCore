package com.curso.practica2;

import java.time.LocalDate;
import org.springframework.stereotype.Component;

@Component("solicitudDLibre")
public class SolicitudDiaLibre  extends Solicitud{

	@Override
	public void aprobar() {
		System.out.println("..... aceptado día festivo ");
		this.fechaRevision = LocalDate.now();
		this.aceptada  = true;
	}

}
