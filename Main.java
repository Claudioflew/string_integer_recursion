public class Main {

  public static String reverseString(String s, int i) {
    if (s == null || s == "") { return "String is empty or null."; }
    else if (i == s.length()-1) { return "" + s.charAt(s.length()-1-i); }
    else { return s.charAt(s.length()-1-i) + reverseString(s, i+1); }
  } 

  public static int addOddNums(int[] a, int i) {
    if (a == null) { return -1; } 
    else if (i < 0 || i >= a.length) { return 0; }
    else if (i == a.length-1) {
      if (a[i]%2 == 1) { return a[i]; }
      return 0;
    } else {
      if (a[i]%2 == 1) { return a[i] + addOddNums(a, i+1); }
      return addOddNums(a, i+1);
    }
  }

   public static String addSpaces(String s) { 
     if (s == null || s == "") { return "String is empty or null."; }
     else if (s.length() == 1) { return s; }
     else {
       return s.charAt(0) + " " + addSpaces(s.substring(1));
     }
  } 

   public static int multByAdd(int m, int n) {
     if (n < 0) { return 0; }
     else if (m == 1) { return n; }
     else { return m * multByAdd(1, n); }
  }

  public static String weave(String s1, String s2) {
    if (s1 == null || s2 == null) { return null; }
    else if (s1 == "" && s2 == "") { return ""; }
    else if (s1 == "") { return "" + s2.charAt(0) + weave(s1, s2.substring(1)); }
    else if (s2 == "") { return "" + s1.charAt(0) + weave(s1.substring(1), s2); }
    else {
      return "" + s1.charAt(0) + s2.charAt(0) + weave(s1.substring(1), s2.substring(1));
    }    
  }

   public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] arr2 = {0, 2, 4, 6, 8, 10, 12, 14, 16}; 

    System.out.println("Welcome to Homework 5. Happy Coding!");
    System.out.println(reverseString(null, 100));
    System.out.println(reverseString("", -1));
    System.out.println(reverseString("radar", 0));
    System.out.println(reverseString("reverse", 0));
    System.out.println(reverseString("gohangasalamiimalasagnahog", 0));
    System.out.println(addOddNums(arr1, 0));
    System.out.println(addOddNums(arr1, 8));
    System.out.println(addOddNums(arr1, 9));
    System.out.println(addOddNums(arr1, 10));
    System.out.println(addOddNums(arr2, 0));
    System.out.println(addOddNums(null, -100));
    System.out.println(addSpaces("spaces"));
    System.out.println(addSpaces(""));
    System.out.println(addSpaces(null));
    System.out.println(addSpaces("s"));
    System.out.println(addSpaces("s p a c e s"));
    System.out.println(multByAdd(0, 0));
    System.out.println(multByAdd(0, 1000));
    System.out.println(multByAdd(1000000, 0));
    System.out.println(multByAdd(11, 9));
    System.out.println(multByAdd(5, 4));
    System.out.println(multByAdd(-7, 6));
    System.out.println(multByAdd(7, -6));
    System.out.println(weave(null, "weave"));
    System.out.println(weave("weave", null));
    System.out.println(weave("hello", ""));
    System.out.println(weave("", "goodbye"));
    System.out.println(weave("", null));
    System.out.println(weave("", ""));
    System.out.println(weave("recurse", "NOW"));
    System.out.println(weave("HloWrd", "el ol!"));
    System.out.println(weave("T", "his is the end."));
    System.out.println(weave("Tis is the end!", "h"));
  }
}
