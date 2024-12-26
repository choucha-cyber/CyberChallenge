package com.CyberChallenge.LeCoffreAuTresor.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.CyberChallenge.LeCoffreAuTresor.Model.Enigme;

@Service
public class EnigmeServiceImpl implements EnigmeService {

    private List<Enigme> enigmes = new ArrayList<>();

    public EnigmeServiceImpl() {
        enigmes.add(new Enigme(1, "Je suis jaune et je brille dans le ciel. Qui suis-je ?", "soleil"));
        enigmes.add(new Enigme(2, "Je suis un liquide transparent, essentiel à la vie. Qui suis-je ?", "eau"));
    }

    @Override
    public List<Enigme> getAllEnigmes() {
        return enigmes;
    }

    @Override
    public Enigme getEnigmeById(int id) {
        return enigmes.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }
}
