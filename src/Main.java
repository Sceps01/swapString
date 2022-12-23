public class Main {
    public static void main(String[] args) {
       String str1 = "Prabath";
       String str2 = "rai";
       System.out.println("before swap: " + str1);
       System.out.println("before swap: " + str2);
       str1 = str1 + str2;
       str2 = str1.substring(0,  (str1.length() - str2.length()));
       str1 = str1.substring(str2.length());
        System.out.println();
       System.out.println("after swap: " + str1);
       System.out.println("after swap: " + str2);
    }
}