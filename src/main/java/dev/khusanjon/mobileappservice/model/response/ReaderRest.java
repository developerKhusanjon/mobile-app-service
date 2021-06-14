package dev.khusanjon.mobileappservice.model.response;

import lombok.Data;

@Data
public class ReaderRest {
    private String readerId;
    private String firstName;
    private String lastName;
    private String email;
}
