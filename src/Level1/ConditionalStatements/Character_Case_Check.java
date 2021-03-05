package Level1.ConditionalStatements;

import java.util.Scanner;

public class Character_Case_Check {

    /**--------------------------------------------------------------------------
     * Check whether the given character is in upper case, lower case or non alphabetic character
     # Capital letter Alphabets (A-Z) lie in the range 65-91 of the ASCII value
     # Small letter Alphabets (a-z) lie in the range 97-122 of the ASCII value
     # Any other ASCII value is a non-alphabetic character.
     -----------------------------------------------------------------------------**/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabet : ");
        char character = scanner.next().charAt(0);
        System.out.println("------------------------------");
        if(character>='A' && character<='Z')
            System.out.println("It is an Uppercase alphabet");
        else if(character>='a' && character<='z')
            System.out.println("It is a Lowercase alphabet");
        else
            System.out.println("It is not an alphabet");
        scanner.close();
    }
}
