package com.urlshortner.dto;

public class URLShortnerRequest {
    private String urlToShort;
    private int lifeOfShortenUrlInMin;

    public String getUrlToShort() {
        return urlToShort;
    }

    public void setUrlToShort(String urlToShort) {
        this.urlToShort = urlToShort;
    }

    public int getLifeOfShortenUrlInMin() {
        return lifeOfShortenUrlInMin;
    }

    public void setLifeOfShortenUrlInMin(int lifeOfShortenUrlInMin) {
        this.lifeOfShortenUrlInMin = lifeOfShortenUrlInMin;
    }
}
