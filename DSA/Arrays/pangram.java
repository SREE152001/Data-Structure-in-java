/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
*/


import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public boolean checkIfPangram(String sentence) {
       /* boolean result;
        String Regexx="[a-z]+";
        Pattern smalllet=Pattern.compile(Regexx);
        Matcher matching=smalllet.matcher(sentence);
        char[] c=new char[26];
       
        if(matching.find())
        {
            result=true;
        }
        else{
            result=false;
        }
        return result;*/
        
        String str=sentence.toLowerCase();
        boolean result=true;
        for(char ch='a';ch<='z';ch++)
        {
            if(!str.contains(String.valueOf(ch)))
            {
                result=false;
            }
        }
        return result;
    }
}