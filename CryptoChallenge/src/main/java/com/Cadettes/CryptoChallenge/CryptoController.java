package com.Cadettes.CryptoChallenge;

import java.util.Base64;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CryptoController {
	
	private final String secretKey = "cyberchallenge";
	
	@GetMapping("/encode")
    public String encodeMessage(@RequestParam String message) {
        String encryptedMessage = Base64.getEncoder().encodeToString((message + secretKey).getBytes());
        return "Encoded Message: " + encryptedMessage;
    }
	
	@GetMapping("/decode")
    public String decodeMessage(@RequestParam String encoded, @RequestParam String key) {
        if (!key.equals(secretKey)) {
            return "Incorrect key. Try again.";
        }
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decodedMessage = new String(decodedBytes).replace(secretKey, "");
        return "Decoded Message: " + decodedMessage;
    }
	
	
}
