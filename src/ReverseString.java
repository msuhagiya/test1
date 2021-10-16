public class ReverseString {
    public static void main(String[] args)
    {
        String string="Rajesh Patel's home number  0751254698 £50.00 Java & Selenium ***";
        //Store the reverse of the given string
        String reversedS="";
        //Iterate through the string from last and add each character to variable reversedS
        for(int i = string.length()-1; i>=0; i--){
            reversedS = reversedS + string.charAt(i);
        }
        System.out.println("Original string: " + string);
        //Display the reverse of the given string
        System.out.println("Reverse of the given string: " + reversedS);
    }

}
