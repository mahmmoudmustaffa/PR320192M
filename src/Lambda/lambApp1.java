/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda;

import java.util.Arrays;
import java.util.function.BinaryOperator;

/**
 *
 * @author aashgar
 */
public class lambApp1 {
    public static void main(String[] args) {
        myOperation<Integer> multiply = (x,y) -> x * y ;
        System.out.println(multiply.operation(5, 3));
        
        BinaryOperator<Integer> multiply2 = (x,y) -> x * y;
         System.out.printf("Result is: %d\n", multiply2.apply(10, 5));
         Integer[] ar = {1, 2, 3, 7, 8, 4, 5, 6, 9, 10};
         Arrays.stream(ar)
                 .sorted()
                 .forEach(w -> System.out.print(w + ","));

        
    }
    interface myOperation<T> {
        T operation(T x, T y);
    }
}
