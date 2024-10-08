package com.controlpos.keymanagerciti.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@Tag(name = "Key Management API", description = "Manejo de desencriptacion de llaves")
public class ApiController {
    @GetMapping("/getKeyRSA")
    @Operation(summary = "Recuperar clave AES descifrada RSA",
               description = "Este punto final toma una clave AES cifrada con RSA y la descifra.")
    public String getRsa(
            @Parameter(description = "Clave AES cifrada con RSA", required = true) 
            @RequestParam String aesKeyEcriptedWithRsa) {
        // Invoke the method to decrypt the AES key in the business layer
        return "fff";
    }

    @GetMapping("/desencriptaTemplete")
    @Operation(summary = "Descifrar plantilla AES",
               description = "Este punto final toma un número de serie, una clave AES decifrada con RSA y una plantilla cifrada con AES para realizar el descifrado.")
    public String getRsa(
            @Parameter(description = "Numero de serie del lector de huella", required = true) 
            @RequestParam String serialNumber,
            @Parameter(description = "Llave AES encriptada con RSA", required = true) 
            @RequestParam String aesKeyEcriptedWithRsa,
            @Parameter(description = "Template encriptado con AES", required = true) 
            @RequestParam String templeteEncriptedWithAes) {

        return "fff";
    }
}
