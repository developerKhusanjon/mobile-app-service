package dev.khusanjon.mobileappservice.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ReaderDto implements Serializable {
//    private static final long serialVersionUID =
    private long id;
    private String readerId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String encryptedPassword;
    private String emailVerificationToken;
    private Boolean emailVerificationStatus;
}
