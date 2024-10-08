import java.util.*;
class ProperCase {
    public class CapitalizeFirstLetter {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String sentence =sc.nextLine();
            String result = capitalizeWords(sentence);
            System.out.println("Original: " + sentence);
            System.out.println("Modified: " + result);
            
            
            sc.close();
        }
    
        public static String capitalizeWords(String sentence) {
            String[] words = sentence.split("\\s+");
            StringBuilder capitalizedSentence = new StringBuilder();
    
            for (String word : words) {
                if (word.length() > 0) {
                    capitalizedSentence.append(Character.toUpperCase(word.charAt(0)))
                                       .append(word.substring(1).toLowerCase()).append(" ");
                }
            }
            return capitalizedSentence.toString().trim();
        }
    }
  }
