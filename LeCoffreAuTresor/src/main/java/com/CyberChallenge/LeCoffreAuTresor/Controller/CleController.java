package com.CyberChallenge.LeCoffreAuTresor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CyberChallenge.LeCoffreAuTresor.Service.CleService;

@RestController
public class CleController {
	
	private final CleService cleService;

    @Autowired
    public CleController(CleService cleService) {
        this.cleService = cleService;
    }

    /**
     * Génère une clé unique.
     * 
     * @return La clé générée.
     */
    @GetMapping("/generer-cle")
    public String genererCle() {
        return "Clé générée : " + cleService.genererCle();
    }

    /**
     * Vérifie si une clé utilisateur correspond à la clé correcte.
     * 
     * @param cleUtilisateur La clé fournie par l'utilisateur.
     * @param cleCorrecte La clé correcte.
     * @return Une réponse indiquant si la clé est valide.
     */
    @GetMapping("/valider-cle")
    public String validerCle(@RequestParam String cleUtilisateur, @RequestParam String cleCorrecte) {
        boolean estValide = cleService.validerCle(cleUtilisateur, cleCorrecte);
        return estValide ? "Clé valide ! Vous pouvez accéder au coffre." : "Clé invalide. Essayez encore.";
    }

}
