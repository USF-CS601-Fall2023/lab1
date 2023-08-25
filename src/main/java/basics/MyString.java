package basics;

/** A class that stores a string as an instance variable
 * and has many useful methods for manipulating the string.
 *
 * Important note: You may NOT use any methods from class String
 * for this problem except length(), charAt(int i) and toLowerCase().
 * You may not use any methods from class Character,
 * except for Character.isUpperCase.
 * No credit will be given for solutions using other methods of class String.
 */
public class MyString {
    private String string; // instance variable

    /** Constructor of the class
     *
     * @param s string
     */
    public MyString(String s) {
        // FILL IN CODE: assign a given value to the instance variable string

    }

    /** Getter for the string
     *
     * @return string (instance variable)
     */
    public String getString() {
        return string;
    }

    /** Setter for the string
     *
     * @param s a string to set the instance variable to.
     */
    public void setString(String s) {
        // FILL IN CODE: assign a given value to the instance variable string

    }

    /**
     * Returns true if string s contains a given character
     * and false otherwise
     * @param ch character to search in the string
     * @return true if found this character in the string
     * Note: you need to implement this method from scratch, using a for loop. You may NOT use a built in
     * contains method from class String.
     */
    public boolean containsCharacter(char ch) {
        // FILL IN CODE

        return false; // remember to change this
    }

    /**
     * Returns true if ALL the characters in the String are uppercase.
     *
     * @return true if all characters uppercase, otherwise false
     * You need to implement this method using a loop. 
     * You may NOT use any built in methods except for charAt and Character.isUpperCase.
     */
    public boolean isUppercase() {
        // FILL IN CODE
        
        return false; // remember to change this
    }


    /** The method returns a new string that is just like the original
     * string, but without white spaces.
     * @return string without white spaces
     */
    public String getStringWithoutWhiteSpaces() {
        String newStr = "";
        // FILL IN CODE
       
        return newStr;
    }

    /** Return a reverse of the string
     *  Example: if an object stores "hello", when we call
     *  this method, it will return "olleh".
     * @return reverse
     */
    public String getReversedString() {
        String reversed = "";
        // FILL IN CODE
       
        return reversed;
    }

    /** Returns a string that is an instance variable of the class.
     * @return string
     */
    public String toString() {
        return string;
    }
}
