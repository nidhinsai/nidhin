import java.util.HashSet;

/******************************************************************************

 Write a program to find non-repeating characters from a string.

 Input : "this is a sample java program"
 Output:
 t
 h
 l
 e
 j
 v
 o
 g
 *******************************************************************************/

public class NonRepeatingCharsUsingHashSet {

    public static HashSet<Character> findNonRepeatingChars(char [] inputStr){
        HashSet<Character> nonRepeatingSet = new HashSet<>();
        HashSet<Character> repeatingSet = new HashSet<>();
        for(char ch : inputStr){
            if(!(nonRepeatingSet.contains(ch) || repeatingSet.contains(ch))){
                nonRepeatingSet.add(ch);
            }
            else if (nonRepeatingSet.contains(ch)){
                nonRepeatingSet.remove(ch);
                repeatingSet.add(ch);
            }
        }
        return nonRepeatingSet;
    }

    public static void main(String [] args){
        String input = "this is a sample java program";
        input = input.replaceAll("\\s", "");
        HashSet<Character> hashSet = findNonRepeatingChars(input.toCharArray());
        System.out.println("Characters that occur only once in the given string: ");
        for(Character ch : hashSet){
            System.out.println(ch);
        }
    }
}
