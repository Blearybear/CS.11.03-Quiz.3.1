public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade){
        if (grade >= 90){
            return 'A';
        }
        else if (grade >= 80){
            return 'B';
        }
        else if (grade >= 70){
            return 'C';
        }
        else if (grade >= 60){
            return 'D';
        }
        else if (grade >= 50){
            return 'E';
        }
        else {
            return 'F';
        }
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int i){
        if (i % 3 == 0 && i % 5 == 0){
            return "fizzbuzz";
        }
        else if (i % 3 == 0){
            return "fizz";
        }
        else if (i % 5 == 0){
            return "buzz";
        }
        else {
            return "unlucky";
        }
    }

    // Question 3 - frontBack
    public static String frontBack(String str){
        if (str.length() < 2){
            return str;
        }
        else {
            String part = str.substring(0, 2);
            return part + str + part;
        }
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c){
        if (a + b == c || b + c == a || c + a == b){
            return true;
        }
        else {
            return false;
        }
    }

    // Question 5 - endUp
    public static String endUp(String str){
        if (str.length() < 3){
            return str.toUpperCase();
        }
        else {
            String part = str.substring(str.length() - 3).toUpperCase();
            String otherPart = str.substring(0, str.length() - 3);
            return otherPart + part;
        }
    }

}
