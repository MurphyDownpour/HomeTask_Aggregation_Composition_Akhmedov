package by.htp.agregation_and_composition.Task1;

import java.util.List;
import java.util.Objects;

public class Text {
    private List<Sentence> sentences;
    private String textHeading;
    private String text = "";

    public Text(List<Sentence> sentences, String textHeading) {
        this.sentences = sentences;
        this.textHeading = textHeading;

        makeText();
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public String getTextHeading() {
        return textHeading;
    }

    public void setTextHeading(String textHeading) {
        this.textHeading = textHeading;
    }

    public String getText() {
        return text;
    }

    private void makeText() {
        for (Sentence sentence: sentences) {
            this.text += sentence.getSentence() + ". ";
        }
    }

    public void addSentence(Sentence sentence) {
        sentences.add(sentence);

        makeText();
    }

    public void printText() {
        System.out.println(textHeading);
        System.out.println(text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return sentences.equals(text.sentences) &&
                textHeading.equals(text.textHeading);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentences, textHeading);
    }

    @Override
    public String toString() {
        return "Text{" +
                "sentences=" + sentences +
                ", textHeading='" + textHeading + '\'' +
                '}';
    }
}
