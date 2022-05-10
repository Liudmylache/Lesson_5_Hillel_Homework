public class MyMath {
    //Arithmetic operations

    //addition (+)
  /*
    int a = 2;
    int b = 3;
    int c = a + b; //5
    int d = 7 + b; //10  */

    // subtraction (-)
    /*
    int a = 100;
    int b = 7;
    int c = a - b; // 93
    int d = 55 - a; // - 45 */

    // multiplication (*)

   /*
    int a = 3;
    int b = 5;
    int c = a * b; // 15
    int d = b * 100; // 500 */

    // division (/)

   /*
    int a = 200;
    int b = 100;
    int c = a/b; // 2
    double d = 55.0 / 2; // 27.5 *
    // *For the result to be a floating point number, one of the operands must also be a floating point number. */

    //getting the remainder after dividing two numbers (%)
   /*
    int a = 101;
    int b = 3;
    int c  = a % b; // 2
    int d = 11 % 2; // 1 */

    // prefix increment (++a)
   /*
    int a = 33;
    int b = ++a;
    //System.out.println(a); // 34!
    //System.out.println(b); // 34 */

    // postfix increment (a++)
   /*
    int a = 99;
    int b = a++;
    //System.out.println(a); // 100
    //System.out.println(b); // 99 */

    // prefix decrement (--a)
    /*
    int a = 100;
    int b = --a;
    //System.out.println(a); // 99
    //System.out.println(b); // 99 */


    // postfix decrement (a--)
   /*
    int a = 100;
    int b = a--;
    //System.out.println(a); // 99
    //System.out.println(b); // 100 */


    /* Priority of arithmetic operations:
    1) ++ and --
    2) *, /, %
    3) +,-
     */

    int a = 3;
    int b = 5;
    int c = ((a + b)/a * ++a) % 3;

    public double showResult(){
        return c;
    }

}
