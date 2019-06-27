package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class TwilioDemoApplication implements CommandLineRunner{

	public static final String ACCOUNT_SID = "XXXXX";
	public static final String AUTH_TOKEN = "XXXX";
	public static final String TWILIO_NUMBER = "+XXXX";
	
	
	public static void main(String[] args) {
		SpringApplication.run(TwilioDemoApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception{
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		Message message = Message.creator(new PhoneNumber("+XXXX"), new PhoneNumber(TWILIO_NUMBER),"THIS WORKS?").create();
	}
}
