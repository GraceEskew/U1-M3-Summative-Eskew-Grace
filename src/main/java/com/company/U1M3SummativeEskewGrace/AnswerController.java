package com.company.U1M3SummativeEskewGrace;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@RestController
public class AnswerController {
    private List<Answer> magicList;

    public AnswerController() {

        this.magicList = new ArrayList<>();

        //POSITIVE ANSWERS
        this.magicList.add(new Answer("", "It is certain."));
        this.magicList.add(new Answer("", "It is decidedly so."));
        this.magicList.add(new Answer("", "Without a doubt."));
        this.magicList.add(new Answer("", "Yes - definitely."));
        this.magicList.add(new Answer("", "You may rely on it."));
        this.magicList.add(new Answer("", "As I see it, yes."));
        this.magicList.add(new Answer("", "Most likely."));
        this.magicList.add(new Answer("", "Outlook good."));
        this.magicList.add(new Answer("", "Yes."));
        this.magicList.add(new Answer("", "Signs point to yes."));

        //UNSURE RESPONSES
        this.magicList.add(new Answer("", "Reply hazy, try again."));
        this.magicList.add(new Answer("", "Ask again later."));
        this.magicList.add(new Answer("", "Better not tell you now."));
        this.magicList.add(new Answer("", "Cannot predict now."));
        this.magicList.add(new Answer("", "Concentrate and ask again."));

        //NEGATIVE RESPONSES
        this.magicList.add(new Answer("", "Don't count on it"));
        this.magicList.add(new Answer("", "My reply is no."));
        this.magicList.add(new Answer("", "My sources say no."));
        this.magicList.add(new Answer("", "Outlook not so good"));
        this.magicList.add(new Answer("", "Very doubtful"));
    }

    // FULL ANSWER LIST
    @RequestMapping(value="/magic", method = RequestMethod.GET)
    public List<Answer> getMagicList() {
        return this.magicList;
    }

    // RANDOM ANSWER LIST

    @RequestMapping(value="/magic/{random}", method= RequestMethod.GET)
    public Answer getRandomMagic (@PathVariable String random) {
        Random rand = new Random();
        return this.magicList.get(rand.nextInt(magicList.size()));
    }

    //POST METHOD - QUESTION --- Trying to rework this in the commented out section below
    @RequestMapping(value="/magic", method=RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED) // CREATES A NEW ITEM
    public Answer createQuestion(@RequestBody Answer question) {//METHOD TO CREATE QUESTION
        this.magicList.add(question); // doesn't change whether the question shows up in the response body as null or not.
        return getRandomMagic("");
    }


}

//POST METHOD - WIP - trying to get around the "Answer" null issue in the response,
//as well as Question showing up in the response, but Answer being null (shows up amongst the randoms.
//Attempting to pass the object as a parameter. Understanding that I'm currently asking system to
//accept a question and randomize it (as is).


//@RequestMapping(value="/magic", method=RequestMethod.POST)
//@ResponseStatus(value = HttpStatus.CREATED)

  /*

  //letting Post know input will be placed in the body
    public Answer createQuestion(@RequestBody String question) {


        //Random Set Up for Answers
        Random rand = new Random();
        this.magicList.get(rand.nextInt(magicList.size()));


        //Question
        this.magicList.setQuestion;


        //Returns the answer
        return question;
    }


    */


//OLD WORK - COMMENTED OUT TO KEEP ON FILE IN CASE I NEED TO START OVER
// PROBLEMS:
// 1. "Question:" is showing up in the response body
// 2. Some answers are coming up "null". Some not all.




/*    //POST METHOD - QUESTION
    @RequestMapping(value="/magic", method=RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED) // CREATES A NEW ITEM
    public Answer createQuestion(@RequestBody String question) {
        Random rand = new Random();//METHOD TO CREATE QUESTION
        this.magicList.get(rand.nextInt(magicList.size()));
        this.magicList.add(question);
        return Answer;
    }*/