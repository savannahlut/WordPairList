import java.util.ArrayList;
public class WordPairList{

    /** The list of word pairs, initialized by the constructor. */
    private ArrayList<WordPair> allPairs;

    /** Constructs a WordPairList object as described in part (a).
    * Precondition: words.length >= 2
    */
    public WordPairList(String[] words){
        allPairs = new ArrayList<WordPair>();
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
            allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }

    /** Returns the number of matches as described in part (b).
    */
    public int numMatches(){
        int num = 0;
        for(WordPair Wp : allPairs){
            if(Wp.getFirst().equals(Wp.getSecond())){
                num++;
            }
        }
        return num;
    }

    public ArrayList<WordPair> pairs(){
        return allPairs;
    }
}