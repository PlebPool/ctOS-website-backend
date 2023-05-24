package com.example.ctoswebsiteapi.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Site implements Serializable {
    public String siteLevel;
    public String siteCity;
    public int users;
    public String description;

    public String imgUrl;

    public Site(String siteLevel, String siteCity, int users, String description, String imgUrl) {
        this.siteLevel = siteLevel;
        this.siteCity = siteCity;
        this.users = users;
        this.description = description;
        this.imgUrl = imgUrl;
    }
}

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class SitesController {
    ArrayList<Site> sites = new ArrayList<>();

    public SitesController() {
        sites.add(new Site(
                "HQ",
                "London",
                360000,
                "Welcome to Blume's London office, the beating heart of our innovation and technological prowess. Here at Blume London, we proudly oversee the development and implementation of our groundbreaking ctOS (Central Operating System) product. With ctOS, we have transformed the sprawling metropolis into a seamlessly connected city, empowering citizens and law enforcement alike with unprecedented levels of security, efficiency, and convenience. Join us in shaping the future of urban living, where cutting-edge technology and urban harmony merge seamlessly.",
                "https://i.pinimg.com/originals/51/41/e3/5141e310cec78734a74b5e48efd1ef84.png"));
        sites.add(new Site(
                "Local - HQ",
                "Paris",
                400000,
                "Bienvenue to Blume Paris! Our vibrant office nestled in the city of romance is where the magic happens. At Blume Paris, we spearhead the advancement of our revolutionary ctOS (Central Operating System) solution. With ctOS, we have woven a digital tapestry across the city, merging elegance with innovation. From managing traffic congestion to optimizing public services, ctOS has transformed Paris into a paragon of efficiency and sophistication. Join us in creating a future where beauty meets technology, and where the streets of Paris become an epitome of connectivity and grace.",
                "https://th.bing.com/th/id/R.94e43be0f5a5da72ead65f93d44e399e?rik=81nkEF1L9ekEpA&riu=http%3a%2f%2fgetwallpapers.com%2fwallpaper%2ffull%2f6%2ff%2f9%2f479502.jpg&ehk=%2fsmG%2f5HHWgQR%2foKiQQ43vzxRiQyu2MGmf8gKP7tbCG4%3d&risl=&pid=ImgRaw&r=0"));
        sites.add(new Site(
                "Local - HQ",
                "Tokyo",
                200000,
                "いらっしゃいませ to Blume Tokyo! Step into the pulsating heart of Japan's technological revolution. At Blume Tokyo, we lead the charge in bringing ctOS (Central Operating System) to the Land of the Rising Sun. With ctOS, we have seamlessly integrated cutting-edge technology into Tokyo's bustling urban landscape, revolutionizing transportation, security, and citizen engagement. From the iconic neon-lit streets of Shibuya to the serene tranquility of traditional temples, ctOS has transformed Tokyo into a connected metropolis where tradition and innovation coexist harmoniously. Join us in shaping a future where ancient wisdom meets futuristic technology.",
                "https://th.bing.com/th/id/OIP.pqdQb3NVKgN2bKwQdh0HEAHaEo?pid=ImgDet&rs=1"));
        sites.add(
                new Site("Local - HQ",
                        "Stockholm",
                        50000,
                        "Välkommen to Blume Stockholm! Nestled in the heart of Sweden's capital, our office is at the forefront of technological innovation. Here in Stockholm, we drive the development and implementation of ctOS (Central Operating System), our groundbreaking solution that has reshaped the cityscape. With ctOS, we have transformed Stockholm into a smart city, where efficiency, sustainability, and connectivity thrive hand in hand. From optimizing public transportation to enhancing public safety, ctOS has revolutionized the way Stockholm operates. Join us in shaping the future of urban living, where innovation and Scandinavian ingenuity converge to create a truly remarkable city experience.",
                        "https://i.pinimg.com/originals/f1/65/7b/f1657bd97872c364e9bbf2495496dbf5.jpg")
        );
    }

    @GetMapping("/sites")
    public ResponseEntity<List<Site>> sites() {
        return new ResponseEntity<>(sites, HttpStatus.OK);
    }
}
