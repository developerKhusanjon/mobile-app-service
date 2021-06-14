package dev.khusanjon.mobileappservice.model.request;

import lombok.Data;

@Data
public class ReaderRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
