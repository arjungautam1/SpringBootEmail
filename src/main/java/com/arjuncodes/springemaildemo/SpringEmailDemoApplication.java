package com.arjuncodes.springemaildemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class SpringEmailDemoApplication {

	@Autowired
	private EmailSenderService senderService;
	public static void main(String[] args) {
		SpringApplication.run(SpringEmailDemoApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {
	/*senderService.sendSimpleEmail("arjungautam5431@gmail.com",
			"This is email body",
			"This is email subject");*/
		senderService.sendEmailWithAttachment("arjungautam5431@gmail.com",
				"This is Arjun Codes",
				"Resume",
				"C:\\Users\\arjun\\OneDrive\\Desktop\\resume.pdf");
	}


}
