package com.Cadettes.CryptoChallenge;

import java.util.Base64;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CryptoController {
    
    private final String secretKey = "cyberchallenge";
    
    @GetMapping("/")
    public String home() {
        return "index"; // Affiche la page d'accueil
    }
    
    @GetMapping("/encode")
    public String encodeMessage(@RequestParam String message, Model model) {
        String encryptedMessage = Base64.getEncoder().encodeToString((message + secretKey).getBytes());
        model.addAttribute("encryptedMessage", encryptedMessage); // Envoie le message crypté à la vue
        return "index"; // Retourne vers la page index.html pour afficher les résultats
    }

    @GetMapping("/decode")
    public String decodeMessage(@RequestParam String encoded, @RequestParam String key, Model model) {
        if (!key.equals(secretKey)) {
            model.addAttribute("decodeResult", "Incorrect key. Try again.");
            return "index"; // Affiche un message d'erreur sur la même page
        }
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decodedMessage = new String(decodedBytes).replace(secretKey, "");
        model.addAttribute("decodeResult", "Decoded Message: " + decodedMessage);
        return "index"; // Retourne vers la page index.html pour afficher le résultat décrypté
    }
}
