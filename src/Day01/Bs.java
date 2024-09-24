package Day01;

import java.util.Arrays;

public class Bs {
    public static void main(String[] args)
    {
        char[] characters =
                {
                        'a', 'b','c','d','e'
                };
        System.out.println(Arrays.binarySearch(characters,'a'));
        System.out.println(Arrays.binarySearch(characters, 'p'));
    }
}
//binarySearch method returns the location if a match occurs otherwise - (x+1) where x is
//the no. of elements in the array, For example in the second case above when p is not
//present in characters array the returned value will be -6.