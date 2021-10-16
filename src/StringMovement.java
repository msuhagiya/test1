public class StringMovement {
    static String pDetail ="Rajesh Patel's home number  0751254698 £50.00 Java & Selenium ***";
            public static void main(String[] args)
            {System.out.println(pDetail.replaceAll(" ", ""));//Remove  spaces  from given string
                System.out.println(pDetail.replaceAll("[0-9]", ""));//Remove digits from given string
                System.out.println(pDetail.replaceAll("[^0-9]",""));//Extract numbers from given string
                System.out.println(pDetail.replaceAll("Java","")); //Remove word ‘Java’ from given string
                System.out.println(pDetail.replaceAll("[^a-zA-Z0-9]" ," " ));//Remove special characters from given string
                System.out.println(pDetail.toUpperCase());//Convert to uppercase given string
                System.out.println(pDetail.toLowerCase());  //Convert to lowercase given string
                System.out.println(pDetail.length()); //Find length of string  given string
                System.out.println(pDetail.indexOf('P')); //Find index of P  given string
                System.out.println(pDetail.replaceAll("Patel's"," "));//Remove word "Patel's"
            }
}