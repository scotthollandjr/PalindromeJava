import java.util.Random;
import java.util.ArrayList;

public class Palindrome {

  public Boolean runPalindrome(String originalWord) {
    char[] originalArray = originalWord.toCharArray();

    Boolean isPalindrome = true;

    for ( int i = 0 , z = ((originalArray.length) - 1) ; i < originalArray.length ; i++ , z-- ) {
      if (originalArray[i] != originalArray[z]) {
        isPalindrome = false;
      }
    }

    return isPalindrome;
  }
}

// string = "racecar"
// string to char array
//
// r,a,c,e,c,a,r
//
// for (backIndex = charArray.length() - 1, forwardIndex = 0; backIndex >= 0; backIndex--, forwardIndex++) {
//   if (
// }
//
// String originalWord = new String;
// char[] originalArray = originalWord.toCharArray();
//
// Boolean isPalindrome = true;
//
// for ( int i = 0, int z = ((originalArray.length) - 1) ; i < originalArray.length ; i++, z-- ) {
//   if (i != z) {
//     isPalindrome = false;
//   }
// }
