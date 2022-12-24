package com.DForDespair.LanguageFamilies.Languages;

public class Mayan extends Language {

    public Mayan(String name, int numSpeakers) {
        super(name, numSpeakers, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo() {
        System.out.println(String.format("%s is spoken by %d people mainly in %s. \n The language follows the word order: %s.", name, numSpeakers, regionsSpoken, wordOrder));
        System.out.println(String.format("Fun fact: %s is an ergative language.", name));
    }
}
