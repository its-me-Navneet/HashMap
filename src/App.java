import java.util.HashMap;
import java.util.Map;


public class App {
    public static void main(String[] args) throws Exception {
        

        String randomText = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations" ; 

        HashMap<String,Integer> countWord = new HashMap<>() ;

        String arr[] = randomText.replaceFirst("avoidable","").split(" "); 

        for(String word :arr) {
             countWord.put(word,countWord.getOrDefault(word,1) +1) ;
        }

        for(Map.Entry m : countWord.entrySet() ){
              
            System.out.println(m.getKey() + " " + m.getValue());

        } 

        // same UC2
    }
}
