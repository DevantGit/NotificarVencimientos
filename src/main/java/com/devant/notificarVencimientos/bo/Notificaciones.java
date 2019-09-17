package com.devant.notificarVencimientos.bo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Notificaciones {
	
	
	public void sendEmail() {
		
		final String username = "intranet@devant.com.mx";
		final String password = "Des@rrollo2019";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.office365.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
		      protected PasswordAuthentication getPasswordAuthentication() {
		            return new PasswordAuthentication(username, password);
		      }
		  });

		try {

		      // Define message
		      MimeMessage message = new MimeMessage(session);
		      message.setFrom(new InternetAddress(username));
		      message.setSubject("Correo de Prueba: Vencimiento de Asignaciones");
		      message.addRecipient(Message.RecipientType.TO,new InternetAddress("reynaldo.gomez@devant.com.mx"));
		      message.setText("La fecha de asignacion para el proyecto esta por vencer." );
		      // Envia el mensaje
		      Transport.send(message);
		} catch (Exception e) {
		}

	}

}
