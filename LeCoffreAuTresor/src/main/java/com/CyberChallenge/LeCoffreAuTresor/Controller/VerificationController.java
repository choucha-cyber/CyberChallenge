package com.CyberChallenge.LeCoffreAuTresor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CyberChallenge.LeCoffreAuTresor.Service.VerificationService;

@RestController
public class VerificationController {

    @Autowired
    private VerificationService verificationService;

    @GetMapping("/verifier")
    public String verifier(@RequestParam String reponse, @RequestParam String attendu) {
        return verificationService.verifierReponse(reponse, attendu)
            ? "Bonne réponse ! 🎉"
            : "Mauvaise réponse. Réessayez.";
    }
}
