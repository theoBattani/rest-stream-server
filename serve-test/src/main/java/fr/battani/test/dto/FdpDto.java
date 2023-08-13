package fr.battani.test.dto;

import lombok.Data;

import java.util.Date;

@Data
public class FdpDto {

    private String firstname;

    private String name;

    private Date birthdate;

    private Integer age;

    private PostalAddressDto postalAddress;
}
