package com.DForDespair.LanguageFamilies.Languages;

public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public void getInfo() {
        System.out.println(String.format("%s is spoken by %d people mainly in %s. The language follows the word order: %s.", name, numSpeakers, regionsSpoken, wordOrder));
    }

    public static void main(String[] args) {
        Language english = new Language("English", 100, "North America", "subject-verb-object");
        System.out.printf("%s fact!\n", english.name);
        english.getInfo();
        Language chol = new Mayan("Chol", 212117);
        System.out.printf("%s fact!\n", chol.name);
        chol.getInfo();
        Language mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
        System.out.printf("%s fact!\n", mandarin.name);
        mandarin.getInfo();
        Language burmese = new SinoTibetan("Burmese", 30000000);
        System.out.printf("%s fact! \n", burmese.name);
        burmese.getInfo();

    }
}
