package dev.khusanjon.mobileappservice.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "readers")
@Data
public class ReaderEntity implements Serializable {
    @Id @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String readerId;
    @Column(nullable = false, length = 50)
    private String firstName;
    @Column(nullable = false, length = 50)
    private String lastName;
    @Column(nullable = false, length = 120, unique = true)
    private String email;
    @Column(nullable = false)
    private String encryptedPassword;
    private String emailVerificationToken;
    @Column(nullable = false, columnDefinition = "boolean default false")
    private Boolean emailVerificationStatus;
}
