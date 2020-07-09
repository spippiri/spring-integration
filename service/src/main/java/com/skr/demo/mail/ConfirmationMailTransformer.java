package com.skr.demo.mail;

import com.skr.demo.model.RegistrationEvent;
import org.springframework.stereotype.Component;

@Component
public class ConfirmationMailTransformer {

    public String toMailText(RegistrationEvent event) {
        return "Dear " + event.getAttendeeFirstName() + " " + event.getAttendeeLastName() + ",\n\n" +
                "Thank you for registering for the Skr Tech Conference. We are looking forward to meeting you!\n\n" +
                "Your ticket code is: " + event.getTicketType() + "-" + event.getTicketCode() + "\n\n" +
                "Sincerely,\n\n" +
                "Skr Registration Team (registration@skr.com)";
    }
}
