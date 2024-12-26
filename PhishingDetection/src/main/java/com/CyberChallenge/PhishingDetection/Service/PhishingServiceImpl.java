package com.CyberChallenge.PhishingDetection.Service;

import org.springframework.stereotype.Service;

import com.CyberChallenge.PhishingDetection.Model.AnalysisResult;

@Service
public class PhishingServiceImpl implements PhishingService {

    @Override
    public AnalysisResult analyze(String input) {
        AnalysisResult result = new AnalysisResult();
        result.setInput(input);

        // Basic heuristics for phishing detection
        if (input.contains("http://") && input.contains("login")) {
            result.setMessage("This link looks suspicious. It might be phishing.");
            result.setPhishing(true);
        } else if (input.contains("free") && input.contains("money")) {
            result.setMessage("This email contains words often used in phishing scams.");
            result.setPhishing(true);
        } else {
            result.setMessage("This does not seem to be phishing, but stay cautious!");
            result.setPhishing(false);
        }
        return result;
    }
}
