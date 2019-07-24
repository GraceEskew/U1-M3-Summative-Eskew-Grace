package com.company.U1M3SummativeEskewGrace;

public class DefinitionObject {
    private String word;
    private String definition;

    public void DefinitionObject() {}

    public DefinitionObject(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    public String getWord() {return this.word;}
    public void setWord(String word) {this.word = word;}

    public String getDefinition() {return this.definition;}
    public void setDefinition(String definition) {this.definition = definition;}
}
