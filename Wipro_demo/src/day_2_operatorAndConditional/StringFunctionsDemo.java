package day_2_operatorAndConditional;

public class StringFunctionsDemo {

    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "hello world";
        String str3 = "   Java Programming   ";
        String emptyStr = "";
        String blankStr = "   ";

        //  1. Basic Methods
        System.out.println("1. Length: " + str.length());
        System.out.println("2. charAt: " + str.charAt(1));
        System.out.println("3. substring from index: " + str.substring(6));
        System.out.println("4. substring with range: " + str.substring(0, 5));
        System.out.println("5. concat: " + str.concat(" Rocks"));

        // 2. Comparison Methods
        System.out.println("6. equals: " + str.equals(str2));
        System.out.println("7. equalsIgnoreCase: " + str.equalsIgnoreCase(str2));
        System.out.println("8. compareTo: " + str.compareTo(str2));
        System.out.println("9. compareToIgnoreCase: " + str.compareToIgnoreCase(str2));

        // 3. Searching Methods
        System.out.println("10. indexOf(char): " + str.indexOf('o'));
        System.out.println("11. indexOf(String): " + str.indexOf("World"));
        System.out.println("12. lastIndexOf(String): " + str.lastIndexOf("l"));
        System.out.println("13. contains: " + str.contains("World"));
        System.out.println("14. startsWith: " + str.startsWith("Hel"));
        System.out.println("15. endsWith: " + str.endsWith("ld"));

        //  4. Case Conversion
        System.out.println("16. toLowerCase: " + str.toLowerCase());
        System.out.println("17. toUpperCase: " + str.toUpperCase());

        //  5. Trimming and Replacing
        System.out.println("18. trim: '" + str3.trim() + "'");
        System.out.println("19. replace(char,char): " + str.replace('o', '0'));
        System.out.println("20. replace(CharSeq, CharSeq): " + str.replace("World", "Java"));
        System.out.println("21. replaceAll: " + str.replaceAll("l", "L"));
        System.out.println("22. replaceFirst: " + str.replaceFirst("l", "L"));

        // 🔹 6. Conversion
        char[] chars = str.toCharArray();
        System.out.print("23. toCharArray: ");
        for (char c : chars) System.out.print(c + " ");
        System.out.println();

        System.out.println("24. valueOf: " + String.valueOf(123)); // static method
        byte[] bytes = str.getBytes();
        System.out.print("25. getBytes: ");
        for (byte b : bytes) System.out.print(b + " ");
        System.out.println();

        // 🔹 7. Split and Join
        String[] words = str.split(" ");
        System.out.print("26. split: ");
        for (String word : words) System.out.print(word + " ");
        System.out.println();

        String[] parts = str.split(" ", 2);
        System.out.print("27. split with limit: ");
        for (String part : parts) System.out.print(part + " ");
        System.out.println();

        String joined = String.join("-", "Java", "Python", "C++");
        System.out.println("28. join: " + joined);

        // 🔹 8. Pattern Matching
        System.out.println("29. matches: " + str.matches(".*World.*"));

        // 🔹 9. Interning and Emptiness
        String interned = new String("hello").intern();
        System.out.println("30. intern: " + (interned == "hello")); // true

        System.out.println("31. isEmpty: " + emptyStr.isEmpty());
        System.out.println("32. isBlank (Java 11+): " + blankStr.isBlank());

        // 🔹 Extra Useful String Methods to make it 50
        System.out.println("33. repeat: " + "ha".repeat(3)); // Java 11+
        System.out.println("34. strip: '" + str3.strip() + "'"); // Java 11+
        System.out.println("35. stripLeading: '" + str3.stripLeading() + "'"); // Java 11+
        System.out.println("36. stripTrailing: '" + str3.stripTrailing() + "'"); // Java 11+
        System.out.println("37. formatted: " + "Name: %s, Age: %d".formatted("Alice", 25)); // Java 15+
        System.out.println("38. indent: \n" + "line1\nline2".indent(4)); // Java 12+
        System.out.println("39. transform: " + str.transform(s -> s + "!!!")); // Java 12+
        System.out.println("40. codePointAt: " + str.codePointAt(1));
        System.out.println("41. codePointBefore: " + str.codePointBefore(1));
        System.out.println("42. codePointCount: " + str.codePointCount(0, str.length()));
        System.out.println("43. equalsIgnoreCase: " + "JAVA".equalsIgnoreCase("java"));
        System.out.println("44. toString: " + str.toString());
        System.out.println("45. hashCode: " + str.hashCode());
        System.out.println("46. indexOf(char, fromIndex): " + str.indexOf('l', 4));
        System.out.println("47. lastIndexOf(char): " + str.lastIndexOf('l'));
        System.out.println("48. matches exact word: " + "hello".matches("\\w+"));
        System.out.println("49. compare lexicographically: " + "apple".compareTo("banana"));
        System.out.println("50. length after trim: " + str3.trim().length());
    }
}



//public class StringFunctionsDemo {
//    public static void main(String[] args) {
//        String str = " Hello Java World ";
//        String str2 = "hello java world";
//
//        System.out.println("1. Length: " + str.length());
//
//        System.out.println("2. Character at index 6: " + str.charAt(6));
//
//        System.out.println("3. Equals: " + str.equals(str2));
//
//        System.out.println("4. Equals Ignore Case: " + str.equalsIgnoreCase(str2));
//
//        System.out.println("5. Compare To: " + str.compareTo(str2));
//
//        System.out.println("6. Compare To Ignore Case: " + str.compareToIgnoreCase(str2));
//
//        System.out.println("7. Contains 'Java': " + str.contains("Java"));
//
//        System.out.println("8. Starts With 'Hello': " + str.trim().startsWith("Hello"));
//
//        System.out.println("9. Ends With 'World': " + str.trim().endsWith("World"));
//
//        System.out.println("10. Index of 'Java': " + str.indexOf("Java"));
//        
//        System.out.println("11. Last Index of 'o': " + str.lastIndexOf("o"));
//
//        System.out.println("12. Substring from index 6: " + str.substring(6));
//
//        System.out.println("13. Substring from 6 to 10: " + str.substring(6, 10));
//
//        System.out.println("14. To Upper Case: " + str.toUpperCase());
//
//        System.out.println("15. To Lower Case: " + str.toLowerCase());
//
//        System.out.println("16. Trimmed: '" + str.trim() + "'");
//
//        System.out.println("17. Replace 'Java' with 'Python': " + str.replace("Java", "Python"));
//
//        System.out.println("18. Replace All spaces with '-': " + str.replaceAll(" ", "-"));
//
//        System.out.println("19. Replace First space with '-': " + str.replaceFirst(" ", "-"));
//
//        System.out.println("20. Is Empty: " + str.isEmpty());
//
//        System.out.println("21. Is Blank: " + str.isBlank());
//
//        String[] parts = str.trim().split(" ");
//        System.out.println("22. Split Words:");
//        for (String part : parts) {
//            System.out.println("  - " + part);
//        }
//
//        System.out.println("23. Join: " + String.join("-", parts));
//
//        System.out.println("24. Format: " + String.format("Hello %s!", "User"));
//
//        System.out.println("25. Matches regex '.*Java.*': " + str.matches(".*Java.*"));
//
//        char[] arr = str.toCharArray();
//        System.out.println("26. To Char Array: " + arr[6]);
//
//        System.out.println("27. Hash Code: " + str.hashCode());
//
//        int num = 42;
//        String sNum = String.valueOf(num);
//        System.out.println("28. Value of int: " + sNum);
//
//        String interned = str.intern();
//        System.out.println("29. Interned: " + interned);
//
//        System.out.println("30. Code Point At index 1: " + str.codePointAt(1));
//
//        System.out.println("31. Code Point Before index 2: " + str.codePointBefore(2));
//
//        System.out.println("32. Code Point Count: " + str.codePointCount(0, str.length()));
//
//        System.out.println("33. Compare ignoring case: " + str.compareToIgnoreCase(str2));
//
//        System.out.println("34. Content Equals: " + str.contentEquals(str2));
//
//        System.out.println("35. Region Matches: " + str.regionMatches(7, str2, 6, 4));
//
//        byte[] bytes = str.getBytes();
//        System.out.println("36. Bytes Length: " + bytes.length);
//        
//        char[] dest = new char[5];
//        str.getChars(1, 6, dest, 0);
//        System.out.print("37. getChars: ");
//        System.out.println(dest);
// 
//        int offset = str.offsetByCodePoints(0, 5);
//        System.out.println("38. Offset by Code Points: " + offset);
//
//        System.out.println("39. Repeat 'Hi' 3 times: " + "Hi".repeat(3));
//
//        System.out.println("40. Strip: '" + str.strip() + "'");
//
//        System.out.println("41. Strip Leading: '" + str.stripLeading() + "'");
//
//        System.out.println("42. Strip Trailing: '" + str.stripTrailing() + "'");
//
//        System.out.println("43. To String: " + str.toString());
//
//        // 44. indent() (Java 15+)
//        // System.out.println("44. Indented:\n" + str.indent(4)); // for Java 15+
//
//        // 45. describeConstable() (Java 12+)
//        // System.out.println("45. Constable: " + str.describeConstable()); // Java 12+
//
//        // 46. transform() (Java 12+)
//        // System.out.println("46. Transform: " + str.transform(s -> s.trim().toUpperCase()));
//
//        String multiline = "Line1\nLine2\nLine3";
//        System.out.println("47. Lines:");
//        multiline.lines().forEach(System.out::println);
//
// 
//        System.out.print("48. Chars: ");
//        str.chars().limit(5).forEach(c -> System.out.print((char)c + " "));
//        System.out.println();
//
//        System.out.println("49. First character: " + str.substring(1, 2));
//
//        System.out.println("50. Replace multiple spaces: '" + str.replaceAll("\\s+", " ") + "'");
//    }
//}

