package com.CyberChallenge.LeCoffreAuTresor.Service;

import java.util.List;

import com.CyberChallenge.LeCoffreAuTresor.Model.Enigme;

public interface EnigmeService {
    List<Enigme> getAllEnigmes();
    Enigme getEnigmeById(int id);
}
