package by.htp.agregation_and_composition.Task1;

import java.util.List;
import java.util.Objects;

public class Sentence {
    private List<Word> words;
    private String sentence;

    public Sentence(List<Word> words) {
        this.words = words;

        String sentence = "";

        for (Word word: words) {
            sentence += word.getWord() + " ";
        }

        this.sentence = sentence;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public String getSentence() {
        return sentence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence1 = (Sentence) o;
        return words.equals(sentence1.words) &&
                Objects.equals(sentence, sentence1.sentence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words, sentence);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "words=" + words +
                ", sentence='" + sentence + '\'' +
                '}';
    }
}
