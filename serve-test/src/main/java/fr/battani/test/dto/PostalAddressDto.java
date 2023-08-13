package fr.battani.test.dto;

import lombok.Data;

@Data
public class PostalAddressDto {

    private String street;

    private Integer zipCode;

    private String city;
}
