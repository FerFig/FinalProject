package com.udacity.gradle.ferfig.gradlejokeslib;

import java.util.Random;

public class GradleJokesLibrary {
    public String getJoke(){
        if (new Random().nextBoolean()){
            return "This is a joke from java library :)";
        }
        else{
            return "A funny joke this is!";
        }
    }
}
