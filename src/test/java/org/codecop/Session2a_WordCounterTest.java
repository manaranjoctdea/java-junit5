package org.codecop;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Session 2a: WordCounterTest - Basic assertions. <br />
 * @see "https://junit.org/junit5/docs/current/user-guide/#writing-tests-assertions"
 */
class Session2a_WordCounterTest {

    // TODO Add the proper assertions to complete the tests. 
    // The test name explains what needs to be asserted. 
    
    @Test
    @DisplayName("should return 9 for 'Keep the bar green to keep the code clean.'")
    void shouldCountNumberOfWords() {
        WordCounter counter = new WordCounter("Keep the bar green to keep the code clean.");
        // TODO Check that 9, counter.numberOfWords().
        assertEquals(9,counter.numberOfWords());
    }

    @Test
    @DisplayName("should return true for counter contains word 'bar'")
    void shouldVerifyContainmentOfWord() {
        WordCounter counter = new WordCounter("green bar green hat");
        // TODO Check that counter.containsWord("bar").
        assertEquals(true,counter.containsWord("bar"));
    }

    @Test
    @DisplayName("should return false for counter contains word 'red'")
    void shouldVerifyNonContainmentOfWord() {
        WordCounter counter = new WordCounter("green hat");
        // TODO Check that counter.containsWord("red") is false.
        assertEquals(false,counter.containsWord("red"));
    }

    @Test
    @DisplayName("should return null for count word 'else'")
    void shouldReturnNullForUnknownWordCount() {
        WordCounter counter = new WordCounter("green bar green hat");
        // TODO Check that counter.countOf("else") is null.
        assertEquals(null,counter.countOf("else"));
    }

    @Test
    @DisplayName("should return not null for count word 'else'")
    void shouldReturnNotNullWordCountForExistingWord() {
        WordCounter counter = new WordCounter("green bar green hat");
        // TODO Check that counter.countOf("green") is not null.
        assertNotNull(counter.countOf("green"));
    }

    @Test
    void shouldFindUniqueWords() {
        WordCounter counter = new WordCounter("green bar green hat");
        // TODO Check that new String[] { "bar", "green", "hat" }, counter.uniqueWords().
        assertEquals(new String[] { "bar", "green", "hat" }, counter.uniqueWords());
    }

    @Test
    void shouldReturnRatioOfWords() {
        WordCounter counter = new WordCounter("green bar green");
        // TODO Check that 0.33, counter.ratioOf("bar").
        // Note that floating point numbers need an accuracy delta, e.g. 0.01.
        assertEquals(0.33,counter.ratioOf("bar"));
    }
}
