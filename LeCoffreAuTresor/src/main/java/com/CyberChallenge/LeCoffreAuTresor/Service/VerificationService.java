package com.CyberChallenge.LeCoffreAuTresor.Service;

import org.springframework.stereotype.Service;

@Service
public class VerificationService {

    public boolean verifierReponse(String reponse, String reponseAttendue) {
        return reponse.equalsIgnoreCase(reponseAttendue);
    }
}
