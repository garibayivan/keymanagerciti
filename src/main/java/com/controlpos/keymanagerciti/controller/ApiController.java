package com.controlpos.keymanagerciti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.controlpos.keymanagerciti.bussines.ApiBussines;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/api")
@Tag(name = "Key Management API", description = "Manejo de desencriptacion de llaves")
public class ApiController {
	
	@Autowired
	ApiBussines apiBussines;
	
    @GetMapping("/getRsa")
    @Operation(summary = "Recuperar la clave publica RSA",
               description = "Recuperala llave RSA publica.")
    public String getRsa(
            @Parameter(description = "Clave AES cifrada con RSA", required = true) 
            @RequestParam String aesKeyEcriptedWithRsa) {
        // Invoke the method to decrypt the AES key in the business layer
        return apiBussines.getRsa(aesKeyEcriptedWithRsa);
    }

    @GetMapping("/desencriptaTemplete")
    @Operation(summary = "DDesencripta Template AES",
               description = "Toma el numero de serie, una clave AES decifrada con RSA y decifra la plantilla cifrada con AES para realizar el descifrado.")
    public String getRsa(
            @Parameter(description = "Numero de serie del lector de huella", required = true) 
            @RequestParam String serialNumber,
            @Parameter(description = "Llave AES encriptada con RSA", required = true) 
            @RequestParam String aesKeyEcriptedWithRsa,
            @Parameter(description = "Finger Template Encripted AES", required = true) 
            @RequestParam String templeteEncriptedWithAes) {

        return "fff";
    }
}
