package com.CyberChallenge.BruteForceAttack.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CyberChallenge.BruteForceAttack.Service.BruteForceAttackService;

@Controller
public class BruteForceController {

    @Autowired
    private BruteForceAttackService bruteForceAttackService;

    // Afficher la page d'attaque
    @GetMapping("/bruteforce")
    public String bruteForcePage() {
        return "bruteforce";
    }

    // Méthode pour tenter de cracker un mot de passe
    @PostMapping("/bruteforce")
    public String attemptBruteForceAttack(@RequestParam String password, Model model) {
        String targetPassword = "123456"; // Mot de passe à cracker (exemple)

        // Vérifier si l'attaque par force brute réussit
        boolean isCracked = bruteForceAttackService.tryToCrackPassword(password, targetPassword);

        if (isCracked) {
            model.addAttribute("message", "Félicitations ! L'attaque par force brute a réussi à cracker le mot de passe.");
        } else {
            model.addAttribute("message", "Échec de l'attaque. Essayez un mot de passe plus simple.");
        }

        return "bruteforceResult";
    }
}
