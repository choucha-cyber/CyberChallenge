package com.CyberChallenge.LeCoffreAuTresor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.CyberChallenge.LeCoffreAuTresor.Model.Enigme;
import com.CyberChallenge.LeCoffreAuTresor.Service.EnigmeService;

@Controller
@RequestMapping("/enigme")
public class EnigmeController {

    @Autowired
    private EnigmeService enigmeService;

    @GetMapping("/{id}")
    public String getEnigme(@PathVariable int id, Model model) {
        Enigme enigme = enigmeService.getEnigmeById(id);
        if (enigme != null) {
            model.addAttribute("enigme", enigme);
            return "enigme";  // Ce nom correspond à enigme.html
        } else {
            return "error";  // Une vue d'erreur si l'énigme n'est pas trouvée
        }
    }
}
