//package exercises;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class SearchForString2 {
//    public class SearchForString {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//            String text = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
//            String rawText = Arrays.toString(text.toLowerCase().split(" "));
//            System.out.println("Search for a term. Then I will remove that term.");
//            String term = (input.nextLine().toLowerCase());
//            boolean results = rawText.contains(term);
//            if (results == true) {
//
//                System.out.println("Yup! That term does exist");
//            } else {
//                System.out.println("Nope! That term does not exist");
//            }
//        }
//    }
//
//}
