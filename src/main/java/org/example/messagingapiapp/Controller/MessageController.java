package org.example.messagingapiapp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class MessageController {

    @GetMapping("/oracle")
    public String printGreeting() {
        return "Hello Oracle!";
    }

    @GetMapping()
    public String printme() {
        return "hey";
    }
}




