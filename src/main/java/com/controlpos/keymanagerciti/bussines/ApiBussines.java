package com.controlpos.keymanagerciti.bussines;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import org.springframework.stereotype.Service;

@Service
public class ApiBussines {

	public String getRsa(String serialNumber) {
		try {
			// Ruta del archivo de la clave pública
			ClassLoader classLoader = getClass().getClassLoader();
			File file = new File(classLoader.getResource("rsa_keys/rsa_public").getFile());
			System.out.println(file.exists()); 
			// Leer el contenido del archivo
			  String llavePublicaRSA = Files.readString(file.toPath(), StandardCharsets.UTF_8);

			return llavePublicaRSA;
		} catch (Exception e) {
			e.printStackTrace();
			return "Error al leer la clave pública";
		}
	}
	public String desencriptaTemplete(String serialNumber, String aesKeyEcriptedWithRsa, String templeteEncriptedWithAes) {

		
		return "fff";
	}
}