package com.example.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * @author nkukn - created on 22-Oct-19 10:16 PM
 */
@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getRandomChuckNorrisJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
