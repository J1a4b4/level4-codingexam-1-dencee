package Part_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringManipTests {

    @Test
    void test() {
        String letters = "These are the letters with which I would like to use in order to compose my message";
        String message = "This is the message I want to write";
        assertTrue(checkRansomNote(letters, message));
        
        // Not enough unique letters
        letters = "some words";
        message = "Can I write this message";
        assertFalse(checkRansomNote(letters, message));
        
        // Not enough letters
        letters = "letrs ar misng";
        message = "letters are missing";
        assertFalse(checkRansomNote(letters, message));
        
        // Enough letters
        letters = "can you write a simple message with this";
        message = "yes";
        assertTrue(checkRansomNote(letters, message));
        
        // Too many of one letter
        letters = "aaaaaaaa";
        message = "abc";
        assertFalse(checkRansomNote(letters, message));
        
        // Missing a single letter
        letters = "abcefg";
        message = "abcdefg";
        assertFalse( checkRansomNote( letters, message ) );
        
        // Not enough of a single letter
        letters = "abccccccc";
        message = "aaaaa";
        assertFalse( checkRansomNote( letters, message ) );
        
        // Not enough space characters
        letters = "thisisaransomnote.";
        message = "this is a ransom note.";
        assertFalse( checkRansomNote( letters, message ) );
        
        // Enough characters, but different order
        letters = "keith hello";
        message = "hello keith";
        assertTrue( checkRansomNote( letters, message ) );
    }
    
    /*
     * Complete the checkRansomNote method below. The method takes two strings. 
     * The first string is all the available letters that can be used to compose a
     * message. The second String is the actual message that needs to be composed. 
     * You must have enough of each letter; simply having one of each letter is not 
     * necessarily enough.
     * Capital letters are counted differently than lower case letters.
     * Spaces are also counted as characters.
     * The method should check to see if the message can be composed with the available
     * letters, spaces, special characters, and return true. Otherwise, it should
     * return false.
     * 
     */
    public boolean checkRansomNote(String letters, String message) {
        return false;
    }

}
