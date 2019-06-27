package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class TwilioDemoApplication implements CommandLineRunner{

	public static final String ACCOUNT_SID = "AC3973b3cf024f0030cee6f55a5d538d4a";
	public static final String AUTH_TOKEN = "725ac420c923be45c891a983be7d598a";
	public static final String TWILIO_NUMBER = "+12566002122";
	
	
	public static void main(String[] args) {
		SpringApplication.run(TwilioDemoApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception{
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		Message message = Message.creator(new PhoneNumber("+919716250272"), new PhoneNumber(TWILIO_NUMBER),"THIS WORKS?").create();
	}
}
