import java.util.InputMismatchException;
import java.util.Scanner;

public class ExExce {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        //        1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        //        two numbers , takes two numbers as input

//        try {
//            System.out.println("Enter first number: ");
//            int num1 = s.nextInt();
//            System.out.println("Enter second number: ");
//            int num2 = s.nextInt();
//
//            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//            System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
//
//            System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
//            System.out.println(num1 + " mod " + num2 + " = " + num1 % num2);
//        }
//        catch (InputMismatchException e){
//            System.out.println("Please enter numbers");
//        }catch (ArithmeticException e){
//            System.out.println("Cannot divide by zero");
//        }


//        2. Write a Java program that takes a number as input and prints its multiplication table up to 10.

//        try {
//            System.out.print("Enter number: ");
//            int num = s.nextInt();
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(i + " x " + num + " = " + num * i);
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Please enter number");
//        }


//        3. Write a Java program to print the area and perimeter of a circle.

//        try {
//            System.out.print("Enter radius: ");
//            double radius = s.nextDouble();
//            double pi = 3.14159;
//            System.out.println("Area is = "+ pi * radius * radius);
//            System.out.println("Perimeter is = "+ 2 * pi * radius);
//        }catch (InputMismatchException e){
//            System.out.println("Please enter number");
//        }

//        4. Java program to find out the average of a set of integers

//        System.out.println("Enter the count of numbers: ");
//        try {
//            int count = s.nextInt();
//            int sum = 0;
//
//            for(int i = 1; i <= count; i++){
//                System.out.println("Enter an integer: ");
//                int num = s.nextInt();
//                sum += num;
//            }
//            System.out.println("The average is: "+ sum/count);
//        }catch (InputMismatchException e){
//            System.out.println("Please enter number");
//        }catch (ArithmeticException e){
//            System.out.println("Please Enter number greater than zero");
//        }


//        5. Write a Java program that accepts three integers as input, adds the first two integers
//        together, and then determines whether the sum is equal to the third integer.

//        try {
//            System.out.print("Enter First number: ");
//            int first = s.nextInt();
//            System.out.print("Enter Second number: ");
//            int second = s.nextInt();
//            System.out.print("Enter Third number: ");
//            int third = s.nextInt();
//            if (first + second == third) {
//                System.out.println("The result is: true ");
//            }else {
//                System.out.println("The result is: false ");
//            }
//        }catch (InputMismatchException e){
//            System.out.println("Please enter numbers");
//        }


//        6. Write a Java program to reverse a word.

//        try {
//            System.out.print("Input a word: ");
//            String text = s.nextLine();
//            String reversed = new StringBuilder(text).reverse().toString();
//            System.out.println("Reverse word: " + reversed);
//        }catch (Exception e){
//            System.out.println("Please enter a word");
//        }

//        7 - Java program to check whether the given number is even or odd

//        try {
//            System.out.println("Enter number: ");
//            int num = s.nextInt();
//            try {
//                checkEvenOdd(num);
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//        }catch (InputMismatchException e){
//            System.out.println("Please enter number");
//        }


//        8 - Java program to convert the temperature in Centigrade to Fahrenheit
//        (°C × 9/5) + 32 = °F

//        try {
//            System.out.print("Enter temperature in Centigrade: ");
//            double temperature = s.nextInt();
//            System.out.println("Temperature in Fahrenheit is: "+ ((temperature * 9/5) + 32 ) +"°F");
//
//        }catch (InputMismatchException e){
//            System.out.println("Please enter temperature in Centigrade as numbers");
//        }

//        9.Write a Java program that takes a string and a number from the user,then prints the
//        character in the given index.

//        try {
//            System.out.println("Input a string: ");
//            String text = s.nextLine();
//            char[] myArray = text.toCharArray();
//            System.out.println("Input a number: ");
//            int index = s.nextInt();
//            System.out.println(myArray[index]);
//        }catch (InputMismatchException e){
//            System.out.println("Please enter a number");
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Please enter a valid index");
//        }


//        10. Write a Java program to print the area and perimeter of a rectangle.

//        try {
//            System.out.print("Enter width: ");
//            double width = s.nextDouble();
//            System.out.print("Enter height: ");
//            double height = s.nextDouble();
//
//            System.out.println("Area is "+width+" x "+height+ "= "+ ( width * height ) );
//            System.out.println("Perimeter is 2("+width+" x "+height+ ") = "+ ( 2 * ( width * height )) );
//
//        }catch (InputMismatchException e){
//            System.out.println("Please enter numbers");
//        }


//        11. Write a Java program to compare two numbers.

//        try {
//            System.out.println("Enter first number: ");
//            int num1 = s.nextInt();
//            System.out.println("Enter second number: ");
//            int num2 = s.nextInt();
//
//            try {
//                compareNumbersEqual(num1, num2);
//
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//            try {
//                compareNumbersGreaterThan(num1, num2);
//
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//            try {
//                compareNumbersGreaterThanAndEqual(num1, num2);
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//
//        }catch (InputMismatchException e){
//            System.out.println("Please enter numbers");
//        }


//        12. Write a Java program to convert seconds to hours, minutes and seconds.
//                Number of Hours = ? (n % (24 * 3600)) / 3600 ?
//                Number of Minutes = ? (n % (24 * 3600 * 3600)) / 60 ?
//                Number of Seconds = ? (n % (24 * 3600 * 3600 * 60)) / 60 ?



//        try {
//            System.out.println("Input seconds: ");
//            int seconds = s.nextInt();
//
//            seconds = seconds % (24 * 3600);
//            int numOfHours = seconds / 3600;
//
//            seconds %= 3600;
//            int numOfMinutes = seconds / 60 ;
//
//            seconds %= 60;
//            int numOfSeconds = seconds;
//
//            System.out.println(numOfHours+":"+numOfMinutes+":"+numOfSeconds);
//        }catch (InputMismatchException e){
//            System.out.println("Please enter numbers");
//        }


//        13. Write a Java program that accepts four integers from the user and prints equal if all
//        four are equal, and not equal otherwise.

//        try {
//            System.out.println("Enter first number: ");
//            int first = s.nextInt();
//            System.out.println("Enter second number: ");
//            int second = s.nextInt();
//            System.out.println("Enter third number: ");
//            int third = s.nextInt();
//            System.out.println("Enter fourth number: ");
//            int fourth = s.nextInt();
//            try {
//                checkEqualOrNot(first, second, third, fourth);
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//
//        }catch (InputMismatchException e){
//            System.out.println("Please enter numbers");
//        }


//        14. Write a Java program that reads an integer and check whether it is negative, zero, or
//        positive.

//        try {
//            System.out.println("Enter number: ");
//            int num = s.nextInt();
//
//            try {
//                checkNegativeZeroPositive(num);
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//
//        }catch (InputMismatchException e){
//            System.out.println("Please enter numbers");
//        }


//        15.Write a program to enter the numbers till the user wants and at the end it
//          should display the count of positive, negative and zeros entered (End loop use -1 ,
//          Don’t count -1).

//        System.out.println("Enter number or -1 to quit: ");
//        int num = 0;
//        int posCounter = 0;
//        int negCounter = 0;
//        int zeroCounter = 0;
//
//        try {
//            while(num != -1 ) {
//
//                num = s.nextInt();
//
//                if (num > 0) {
//                    posCounter++;
//                }
//                else if (num < 0) {
//                    negCounter++;
//                }
//                else {
//                    zeroCounter++;
//                }
//
//            }
//            System.out.println(posCounter+" positives.");
//            System.out.println(--negCounter+" negatives.");
//            System.out.println(zeroCounter+" zeroes.");
//
//        }catch (InputMismatchException e){
//                System.out.println("Please enter numbers");
//            }



//          16 - Write a program that prompts the user to input an integer and then outputs the
//              number with the digits reversed.

//        System.out.println("Enter number: ");
//        try {
//            int num = s.nextInt();
//
//            try {
//                revNumberss(num);
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//        }catch (InputMismatchException e){
//            System.out.println("Please enter numbers");
//        }

//        17 - Write a program to enter the numbers till the user wants and at the end the
//        program should display the largest and smallest numbers entered.

//        int num ;
//        int largest = 0;
//        int smallest = 0;
//
//        try{
//            while(true){
//                System.out.print("Enter number or 0 to quit: : ");
//
//                    num = s.nextInt();
//                    if(num == 0){
//                        break;
//                    }
//                    else if(num > largest){
//                        largest = num;
//                    }
//                    else if(num < smallest){
//                        smallest = num;
//                    }
//                }
//            System.out.println("Largest: " + largest);
//            System.out.println("Smallest: " + smallest);
//
//        }catch (InputMismatchException e){
//            System.out.println("Please enter numbers");
//        }


//        18 - Determine and print the number of times the character ‘a’ appears in the input
//          entered by the user.


        System.out.println("Enter string: ");
        try {
            String str = s.nextLine();
            char[] myArray = str.toCharArray();
            int count = 0;
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] == 'a') {
                    count++;
                }
            }
            System.out.println("Number of a's: " + count);
        }catch (Exception e){
            System.out.println("Please enter a string");
        }





    }
    

    
    public static void revNumberss(int num) throws Exception{
        int rem;
        int rev = 0;
        while (num > 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        throw new Exception(rev + "");
    }

    public static void checkNegativeZeroPositive(int num) throws Exception{
        if (num < 0) {
            throw new Exception("Number is negative");
        }
        else if (num == 0) {
            throw new Exception("Number is 0");
        }
        else {
            throw new Exception("Number is positive");
        }
    }

    public static void checkEqualOrNot (int num1, int num2 ,int num3, int num4) throws Exception{
        if (num1 == num2 && num2 == num3 && num3 == num4) {
            throw new Exception("Numbers are equal ");
        }
        else {
            throw new Exception("Numbers are not equal ");
        }
    }

    public static void compareNumbersEqual(int num1, int num2) throws Exception{
        if (num1 == num2) {
            throw new Exception(num1 +" = "+ num2);
        }
        else {
            throw new Exception(num1 +" != "+ num2);
        }

    }

    public static void compareNumbersGreaterThan(int num1, int num2) throws Exception{
        if (num1 > num2) {
            throw new Exception(num1 +" > "+ num2);
        }
        else if (num1 < num2) {
            throw new Exception(num1 +" < "+ num2);
        }
    }
    public static void compareNumbersGreaterThanAndEqual(int num1, int num2) throws Exception{
        if (num1 >= num2) {
            throw new Exception(num1 +" >= "+ num2);
        }
        else {
            throw new Exception(num1 +" <= "+ num2);
        }
    }


    public static void checkEvenOdd(int num) throws Exception{
        if (num%2 == 0) {
            throw new Exception("The number is Even");

        }
        else {
            throw new Exception("The number is Odd");

        }
    }


}
