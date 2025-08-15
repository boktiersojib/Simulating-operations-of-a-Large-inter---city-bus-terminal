package com.example.bus_terminal.model;

public class PaymentGateway {

    private String apiKey;
    private String merchantId;
    private String url;
    private String credentials;

    public PaymentGateway(String apiKey, String merchantId, String url, String credentials) {
        this.apiKey = apiKey;
        this.merchantId = merchantId;
        this.url = url;
        this.credentials = credentials;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    @Override
    public String toString() {
        return "PaymentGateway{" +
                "apiKey='" + apiKey + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", url='" + url + '\'' +
                ", credentials='" + credentials + '\'' +
                '}';
    }
}

