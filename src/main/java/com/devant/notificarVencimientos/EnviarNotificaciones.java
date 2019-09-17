package com.devant.notificarVencimientos;
import com.devant.notificarVencimientos.bo.Notificaciones;

public class EnviarNotificaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Notificaciones notificacion = new Notificaciones();
		
		notificacion.sendEmail();

	}

}
