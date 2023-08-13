package fr.battani.test.controller;

import fr.battani.test.dto.FdpDto;
import fr.battani.test.dto.PostalAddressDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

@RestController
public class TestController {

    @GetMapping("message")
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok("Nick's hammer");
    }

    @GetMapping("fdp")
    public ResponseEntity<FdpDto> getFdp() throws Exception {

        PostalAddressDto postalAddress = new PostalAddressDto();
        postalAddress.setStreet("Rue du four");
        postalAddress.setZipCode(48759);
        postalAddress.setCity("Baccarat");

        FdpDto fdp = new FdpDto();
        fdp.setFirstname("Jason");
        fdp.setName("Doe");
        fdp.setAge(28);
        fdp.setBirthdate(new SimpleDateFormat("dd/MM/yyyy").parse("12/05/1995"));
        fdp.setPostalAddress(postalAddress);

        HttpHeaders headers = new HttpHeaders();
        headers.setAccessControlAllowOrigin("*");

        return new ResponseEntity<>(fdp, headers, HttpStatus.OK);
    }
}
