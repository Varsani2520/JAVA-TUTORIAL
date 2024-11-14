public class Strings {
    public static void main(String[] args) {
        // Using string literal (simple way)
        String name1 = "Gujarat";
        String name2 = "Gujarat";

        // Using new keyword
        String name3 = new String("Gujarat");

        // compare references
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);

        // Use intern() to move name3 to the string pool
        String name4 = name3.intern();
        System.out.println(name1 == name4); // true, now name4 points to the pooled string



        
        // operation
        // concat
        System.out.println(name1.concat(name4));
        System.out.println(name1 + " " + name2);
        // lenght
        System.out.println(name1.length());
        // sunstring
        System.out.println(name1.substring(0, 7));
        // compare equality
        boolean isEqual = name1.equals(name2); // false
        boolean isEqualIgnoreCase = name1.equalsIgnoreCase(name2); // true
        System.out.println(isEqual);
        System.out.println(isEqualIgnoreCase);
        // replce
        System.out.println(name1.replace("Gujarat", "bharat"));

        // string is immutable so java provide string builder and buffer for mutable
        StringBuilder bd = new StringBuilder("Gujarat");
        bd.append("is beautiful");
        System.out.println(bd);


         // Creating a StringBuffer object
         StringBuffer sb = new StringBuffer("Hello");
        
         // Append (add more text to the end of the string)
         sb.append(" World");
         System.out.println("After append: " + sb);  // Output: Hello World
 
         // Insert (insert text at a specified index)
         sb.insert(5, ",");
         System.out.println("After insert: " + sb);  // Output: Hello, World
 
         // Replace (replace part of the string with another string)
         sb.replace(6, 11, "Java");
         System.out.println("After replace: " + sb);  // Output: Hello, Java
 
         // Delete (remove part of the string from the specified start to end index)
         sb.delete(5, 6);
         System.out.println("After delete: " + sb);  // Output: Hello Java
 
         // Reverse the string
         sb.reverse();
         System.out.println("After reverse: " + sb);  // Output: avaJ olleH
 
         // Length of the StringBuffer
         System.out.println("Length: " + sb.length());  // Output: 10
 
         // Capacity of the StringBuffer (internal size of the buffer)
         System.out.println("Capacity: " + sb.capacity());  // Output: 21 (default capacity is 16 + length of the string)
 
         // Resetting the StringBuffer by setting length to 0
         sb.setLength(0);
         System.out.println("After clearing: " + sb);  // Output: (empty string)
    }
}

// string has 2 method of define
// 1.simple
// 2.new keyword use

// in simple ,if value same then not create new data for store that it reuse for
// exapme name1 and name 2 both have value is gujarat then only use name 1

// it is memory optimized and efficient method

// opposed of second method every time create new data key if value same then ..
// less efficient.