package maps;

/** A class that keeps track of the word positions in the text */
public class WordPositions {
    // FILL IN CODE: declare and initialize a TreeMap where
    // each key is word, and the value is the list of positions of this word
    // in the text file

    public void computeWordPositions(String filename) {
        // Read a given file, and fill in the TreeMap declared above
        // For instance, for the word "happy", the value should be [2, 9, 17, 22]
        // because "happy" occurs in positions 2, 9, 17, 22 in the text.txt
        // FILL IN CODE

    }

    public void printPositions(String word) {
        // Using a TreeMap created in the previous method, print positions where the given word occurs
        // Ex: for the word "happy", you should get [2, 9, 17, 22]
        // FILL IN CODE

    }
}
