package com.example.jokeapp.controllers;

import com.example.jokeapp.services.JokeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for the chucknorris view.
 * @author nkukn - created on 22-Oct-19 10:18 PM
 */
@Controller
public class ChuckNorrisJokesController {

    private JokeServiceImpl jokeServiceImpl;

    @Autowired
    public ChuckNorrisJokesController(JokeServiceImpl jokeServiceImpl) {
        this.jokeServiceImpl = jokeServiceImpl;
    }

    @GetMapping({"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeServiceImpl.getRandomChuckNorrisJoke());
        return "chucknorris";
    }
}
