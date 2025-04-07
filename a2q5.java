import java.util.*;

class SvsSB {
    public static void main(String args[]) {
        String s1 = "Hello";
	String s11=s1;
        StringBuffer s2 = new StringBuffer("Hello");
        System.out.println("String s1 before append: " + s1);
	System.out.println("String s11 before append: " + s11);
        System.out.println("StringBuffer s2 before append: " + s2);
        s1=s1+" Graphic";  // This creates a new String but doesn't store it
        // Correct append for StringBuffer
        s2.append(" Graphic");
        System.out.println("String s1 after append (changes but now s1 is a reference to different object): " + s1);
        System.out.println("String s11 after append in s1 (does not change, immutable): " + s11);
	System.out.println("StringBuffer s2 after append (modified, mutable): " + s2);
    }
}
