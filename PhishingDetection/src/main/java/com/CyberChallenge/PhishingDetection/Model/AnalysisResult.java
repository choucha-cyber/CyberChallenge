package com.CyberChallenge.PhishingDetection.Model;

public class AnalysisResult {

    private String input;
    private String message;
    private boolean phishing;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isPhishing() {
        return phishing;
    }

    public void setPhishing(boolean phishing) {
        this.phishing = phishing;
    }
}
