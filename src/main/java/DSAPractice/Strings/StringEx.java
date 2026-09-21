package DSAPractice.Strings;

public class StringEx {
    public static void main(String[] args){

        String firstName = "Tony";
        String lastName = "Stark";

        //Concatenation
        String fullName = firstName + "@" + lastName;
        System.out.println("Full Name: " +fullName);
        //Total chars
        System.out.println("Total Characters: "+ fullName.length());
        //charAt
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
