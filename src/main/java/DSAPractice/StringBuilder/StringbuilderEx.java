package DSAPractice.StringBuilder;

public class StringbuilderEx {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //Char at index 0
        System.out.println(sb.charAt(0));

        //Set Char at index 0
        sb.insert(2,'n');
        System.out.println(sb);
        //Insert S at 0
        //sb.setCharAt(0,'S');
       // System.out.println(sb);

        //sb.insert(0,'T');
        //System.out.println(sb);



        //delete
        //sb.delete(2,3);
        //System.out.println(sb);

        sb.delete(2,4);
        System.out.println(sb);
    }
}
