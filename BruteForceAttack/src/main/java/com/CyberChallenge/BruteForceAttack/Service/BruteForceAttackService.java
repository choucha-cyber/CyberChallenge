package com.CyberChallenge.BruteForceAttack.Service;

import org.springframework.stereotype.Service;

@Service
public class BruteForceAttackService {

    // Méthode pour simuler une attaque par force brute sur un mot de passe
    public boolean tryToCrackPassword(String password, String targetPassword) {
        // Simule l'attaque : on teste simplement quelques mots de passe faibles
        String[] simplePasswords = generateSimplePasswords();

        // On parcourt tous les mots de passe générés et on les teste
        for (String testPassword : simplePasswords) {
            if (testPassword.equals(targetPassword)) {
                return true; // Mot de passe trouvé !
            }
        }
        return false; // L'attaque a échoué
    }

    // Méthode pour générer une liste de mots de passe simples
    private String[] generateSimplePasswords() {
        return new String[] {"123456", "password", "qwerty", "abc123", "password1"};
    }
}
