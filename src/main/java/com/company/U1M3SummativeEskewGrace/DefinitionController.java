package com.company.U1M3SummativeEskewGrace;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@RestController
public class DefinitionController {
    private List<DefinitionObject> wordList;

    public DefinitionController() {
        this.wordList = new ArrayList<>();

        this.wordList.add(new DefinitionObject("Gnome", "Small humanoids with an affinity for magic and illusions."));
        this.wordList.add(new DefinitionObject("butteries", "pantries or storerooms"));
        this.wordList.add(new DefinitionObject("wraith", "a phantom or ghost; an undead specter"));
        this.wordList.add(new DefinitionObject("maven", "A person who has special knowledge or experience; an expert"));
        this.wordList.add(new DefinitionObject("wold ", "hilly countryside"));
        this.wordList.add(new DefinitionObject("Mellifluous", "A sound that is sweet and smooth, pleasing to hear"));
        this.wordList.add(new DefinitionObject("Ineffable", "Too great to be expressed in words"));
        this.wordList.add(new DefinitionObject("Hiraeth", "A homesickness for a home you can't return to, or that never was"));
        this.wordList.add(new DefinitionObject("weskit", "waistcoat, vest"));
        this.wordList.add(new DefinitionObject("Cohort", "an ancient Roman military unit, comprising six centuries, equal to one tenth of a legion."));

    }

    @RequestMapping(value="/word", method=RequestMethod.GET)
    public List<DefinitionObject> getWordList() {
        return this.wordList;
    }

    @RequestMapping(value="/word/{random}", method= RequestMethod.GET)
    public DefinitionObject getRandomWord (@PathVariable String random) {
        Random rand = new Random();
        return this.wordList.get(rand.nextInt(wordList.size()));
    }

}
