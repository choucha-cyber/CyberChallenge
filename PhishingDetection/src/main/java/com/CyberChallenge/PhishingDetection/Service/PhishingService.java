package com.CyberChallenge.PhishingDetection.Service;

import com.CyberChallenge.PhishingDetection.Model.AnalysisResult;

public interface PhishingService {
    AnalysisResult analyze(String input);
}
