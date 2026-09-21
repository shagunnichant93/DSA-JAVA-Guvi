package DSAPractice.Strings;

public class SubStringEx {
    public static void main(String[] args){
        String sentence = "My name is Tony Stark.";

        String name = sentence.substring(11,sentence.length()-1);

        System.out.println(name);

        String fullName = "TonyStark";
        String lastName = fullName.substring(4);
        System.out.println(lastName);
    }
}
