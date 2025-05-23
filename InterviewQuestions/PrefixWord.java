package InterviewQuestions;

public class PrefixWord {
    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String searchWord = "burg";
        System.out.println(isPrefixOfWord(sentence, searchWord));
    }

    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] strArray = sentence.split(" ");
        for(int i = 0; i < strArray.length; i++) {
            if(strArray[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}
