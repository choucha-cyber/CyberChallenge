package com.CyberChallenge.PhishingDetection.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CyberChallenge.PhishingDetection.Model.AnalysisResult;
import com.CyberChallenge.PhishingDetection.Service.PhishingService;

@Controller
public class PhishingController {

    private final PhishingService phishingService;

    @Autowired
    public PhishingController(PhishingService phishingService) {
        this.phishingService = phishingService;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/analyze")
    public String analyzePhishing(@RequestParam String input, Model model) {
        AnalysisResult result = phishingService.analyze(input);
        model.addAttribute("result", result);
        return "result";
    }
}
