import java.util.HashMap;
import java.util.Map;


public class App {
    public static void main(String[] args) throws Exception {
        

        String randomText ="I go do go hey we go for we go for we shall we " ; 

        HashMap<String,Integer> countWord = new HashMap<>() ;

        String arr[] = randomText.split(" "); 

        for(String word :arr) {
             countWord.put(word,countWord.getOrDefault(word,1) +1) ;
        }

        for(Map.Entry m : countWord.entrySet() ){
              
            System.out.println(m.getKey() + " " + m.getValue());

        } 

        // same UC2
    }
}
