package java11;
import java.util.List;
import java.util.Arrays;


public class Arraylisy {
	    public static void main(String[] args) {
	        String sentence = "A quick brown fox jumps over the lazy dog";
	        String[] words = sentence.split(" ");
	        List<String> wordList = Arrays.asList(words);

	        Object[] objects = wordList.toArray();
	 
	        System.out.println("Array: " + Arrays.toString(objects));
	    }
	}
