package DSAPractice.StringBuilder;

public class SBEx2 {
    public static void main(String[] args){

        StringBuilder sb = new StringBuilder("H");
        sb.append("e");    // str =str + "e"
        sb.append("l");
        sb.append("l");
        sb.append("o");

        System.out.println(sb);

        System.out.println(sb.length());
    }
}
