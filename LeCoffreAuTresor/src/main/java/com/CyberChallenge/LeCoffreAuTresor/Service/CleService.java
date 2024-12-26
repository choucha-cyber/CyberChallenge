package com.CyberChallenge.LeCoffreAuTresor.Service;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class CleService {
	
	/**
     * Génère une clé unique pour une énigme.
     * 
     * @return La clé générée.
     */
    public String genererCle() {
        return UUID.randomUUID().toString();
    }

    /**
     * Valide si la clé utilisateur correspond à la clé correcte.
     * 
     * @param cleUtilisateur La clé fournie par l'utilisateur.
     * @param cleCorrecte La clé correcte.
     * @return true si la clé est valide, sinon false.
     */
    public boolean validerCle(String cleUtilisateur, String cleCorrecte) {
        if (cleUtilisateur == null || cleCorrecte == null) {
            return false;
        }
        return cleUtilisateur.trim().equals(cleCorrecte.trim());
    }

}
