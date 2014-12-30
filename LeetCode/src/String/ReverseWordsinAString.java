package String;

public class ReverseWordsinAString {
    public String reverseWords(String s) {
        s = s.trim();
        s = s.replaceAll("[\\s]+"," ");
        String[] sk = s.split(" ");
        String sp ="";
        for (int i = sk.length -1 ; i > -1 ;i--){
            sp += sk[i]+" ";
        }
        sp = sp.trim();
        return sp;
       }
}
