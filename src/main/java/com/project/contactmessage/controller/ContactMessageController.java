package com.project.contactmessage.controller;

import com.project.contactmessage.service.ContactMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contactMessages")
@RequiredArgsConstructor
public class ContactMessageController {
    private ContactMessageService contactMessageService;

    @PostMapping("/save") //localhost:8080/contactMessages/save + POST + JSON
    public
}
