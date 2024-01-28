public class Strings {
    public static void main(String[] args) {

        //There are many string methods available

        //1.charAt(int index): Returns the character at the specified index.
        String word = "Hello";
        char ch = word.charAt(0); // ch will be 'H'
        System.out.println("character: " +ch);

        //2. **length():** Returns the length of the string.
        String str = "Hello";
        int len = str.length(); // len will be 5
        System.out.println("length: " +len);

        //3. **concat(String str):** Concatenates the specified string to the end of the current string.
        String str1 = "Hello";
        String str2 = "World";
        String result = str1.concat(str2); // result will be "HelloWorld"
        System.out.println("concatenation of str1 and str2: " +result);

        //4. **toUpperCase():** Converts all characters in the string to uppercase.
        String word1 = "hello";
        String upper = word1.toUpperCase(); // upper will be "HELLO"
        System.out.println("uppercase of word1 is: " +upper);

        //5. **toLowerCase():** Converts all characters in the string to lowercase.
        String word2 = "HELLO";
        String lower = word2.toLowerCase(); // lower will be "hello"
        System.out.println("lowercase of word2 is: " +lower);

        //6. **substring(int beginIndex):** Returns a substring starting from the specified index.
        String x = "HelloWorld";
        String sub = x.substring(4); // sub will be "World"
        System.out.println("substring of x which start index 4 is: " +sub);

        //7. **indexOf(String str):** Returns the index of the first occurrence of the specified substring.
        String y = "HelloWorld";
        int index = y.indexOf("World"); // index will be 5
        System.out.println("index of 'world' is: " +index);

        //8. **replace(char oldChar, char newChar):** Replaces all occurrences of a specified character.
        String z = "Hello";
        String replaced = z.replace('o', 'A'); // replaced will be "Hewwo"
        System.out.println("result of replaced z is: " +replaced);

        //9. **trim():** Removes leading and trailing whitespaces from the string.
        String wrd = "   Hello   ";
        String trimmed = wrd.trim(); // trimmed will be "Hello"
        System.out.println("trimmed result is:" +trimmed);

        //10. **startsWith(String prefix):** Checks if the string starts with the specified prefix.
        String word0 = "HelloWorld";
        boolean startsWithHello = word0.startsWith("Hello"); // true
        System.out.println("result is: " +startsWithHello);

        //WARNİNG
        //If you add two strings, the result will be a string concatenation:
        String a = "10";
        String b = "20";
        String c= a + b;  // z will be 1020 (a String)
        System.out.println("result of a+b is: " +c);

        //If you add a number and a string, the result will be a string concatenation:
        String strOne = "10";
        int intNum = 20;
        String resultt = strOne + intNum;  // z will be 1020 (a String)
        System.out.println("result of k+l is: " +resultt);

        //  Special Characters
        //  \n	    New Line
        //  \r	    Carriage Return
        //  \t	    Tab
        //  \b	    Backspace
        //  \f	    Form Feed
    }
}
