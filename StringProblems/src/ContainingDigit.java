import java.util.Arrays;
/*
**Input:**

```text
digits = "23"
```

**Output:**

```text
["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
 */

public class ContainingDigit {
    static String [] keypad = {
           "","", "ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"
    };

    public static void printCombination(String A){
        String first = keypad[A.charAt(0) - '0'];
        String second = keypad[A.charAt(1) - '0'];

        for (int f = 0; f < first.length(); f++) {
            for (int s = 0; s < second.length(); s++) {
                System.out.print("" + first.charAt(f) + second.charAt(s) +" ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        printCombination("23");
    }
}
