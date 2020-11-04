package com.urlshortner.controller;

import com.urlshortner.dto.URLExpandResponse;
import com.urlshortner.dto.URLExpandingRequest;
import com.urlshortner.dto.URLShortnerRequest;
import com.urlshortner.dto.URLShortnerResponse;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class URLShortnerController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(
            HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse
    ) {
        return null;
    }

    @RequestMapping(value = "short", method = RequestMethod.POST)
    public URLShortnerResponse shortenURL(
            HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse,

            @RequestBody
            URLShortnerRequest urlRequestBody
    ) {
        URLShortnerResponse object = new URLShortnerResponse();
        object.setShortURL("http://xyz.com/bit");
        object.setLifeOfShortenUrlInMin(5);
        return object;
    }

    @RequestMapping(value = "expand", method  = RequestMethod.POST)
    public URLExpandResponse expandingURL(
            HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse,

            @RequestBody
            URLExpandingRequest urlExpandingRequest
    ){
        URLExpandResponse object = new URLExpandResponse();
        object.setExpandedURL("http:www.google.com/123456789");
        return object;
    }

}
