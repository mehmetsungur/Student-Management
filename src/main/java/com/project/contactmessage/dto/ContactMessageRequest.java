package com.project.contactmessage.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ContactMessageRequest {
    @NotNull(message="Please enter name")
    @Size(min=3, max = 16, message = "Name should be at least min 3 chars")
    @Pattern(regexp =  "\\A(?!\\s*\\Z).+", message = "Your message must consist of the character")
    private String name;

    @NotNull(message="Please enter email")
    @Size(min=5, max = 20, message = "Name should be at least min 5 chars")
    @Email(message = "Please enter valid email")
    private String email;
    private String subject;
    private String message;
}
