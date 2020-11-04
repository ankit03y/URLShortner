package com.urlshortner.dto;

public class URLShortnerResponse {
    private String shortURL;
    private int lifeOfShortenUrlInMin;

    public String getShortURL() {
        return shortURL;
    }

    public void setShortURL(String shortURL) {
        this.shortURL = shortURL;
    }

    public int getLifeOfShortenUrlInMin() {
        return lifeOfShortenUrlInMin;
    }

    public void setLifeOfShortenUrlInMin(int lifeOfShortenUrlInMin) {
        this.lifeOfShortenUrlInMin = lifeOfShortenUrlInMin;
    }
}
