package com.company.U1M3SummativeEskewGrace;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {
    private List<QuoteObject> quoteList;

    public QuoteController() {
        this.quoteList = new ArrayList<>();

        this.quoteList.add(new QuoteObject("Qui-Gon Jinn", "Your focus determines your reality."));
        this.quoteList.add(new QuoteObject("Varric", "Well."));
        this.quoteList.add(new QuoteObject("Hawke", "Cheap words from a Dragon."));
        this.quoteList.add(new QuoteObject("Flemeth", "We stand on the precipice of change. The world fears the inevitable plummet into the abyss. Watch for that moment, and when it comes do not hesitate to leap. For it is when we fall we learn whether we can fly."));
        this.quoteList.add(new QuoteObject("Solas", "I am no one's agent, but my own"));
        this.quoteList.add(new QuoteObject("Shepard", "I should go"));
        this.quoteList.add(new QuoteObject("Samara", "Your time is precious. Spend it wisely, and with those who care about you."));
        this.quoteList.add(new QuoteObject("Joker", "Now I have to spend all day computing Pi because HE plugged in the Overlord"));
        this.quoteList.add(new QuoteObject("Maevaris Tilani", "Look in yourself in the eye and take strength from what you see"));
        this.quoteList.add(new QuoteObject("Alistair Therin", "Swooping is Bad"));
    }

    @RequestMapping(value="/quote", method=RequestMethod.GET)
    public List<QuoteObject> getQuoteList() {
        return this.quoteList;
    }


    @RequestMapping(value="/quote/{random}", method= RequestMethod.GET)
    public QuoteObject getRandomQuote (@PathVariable String random) {
        Random rand = new Random();
        return this.quoteList.get(rand.nextInt(quoteList.size()));
    }
}