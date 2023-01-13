import java.util.Scanner;
import java.util.Random;
public class Main {
    private static String random5Characters(){
        String line = "";
        for (int i = 0; i < 5; i++){
            int randomChoose = (int) (Math.random() * 2 + 1);
            if (randomChoose == 1){
                Random random = new Random();
                char a = (char)(random.nextInt(26) + 'a');
                line += a;
            }
            else {
                Random random = new Random();
                int a =(int) (Math.random() * 9);
                line += a;
            }
        }
        return (line);
    }
 private static int absoluteValue(int absoluteValueResult){
     absoluteValueResult = Math.abs(absoluteValueResult);
     return absoluteValueResult;
 }
    public static void main(String[] args){
     Scanner scanner_values = new Scanner(System.in);
     System.out.println("Print values:");
     int number1 = scanner_values.nextInt();
     int number2 = scanner_values.nextInt();
     System.out.println("Values are: " + number1 + " and " + number2);
     Scanner scanner_function = new Scanner(System.in);
     System.out.println("Functions: ADD, SUB, DIV, MUL");
     System.out.println("Print function:");
     String function = scanner_function.nextLine();
     switch (function) {
             case "ADD":
             System.out.println("Function is ADD ");
             int add = number1+number2;
             add = absoluteValue(add);
             System.out.println("Result is " + add);
             break;
             case "SUB":
             System.out.println("Function is SUB ");
             int sub = number1-number2;
             sub = absoluteValue(sub);
             System.out.println("Result is " + sub);
             break;
             case "DIV":
             System.out.println("Function is DIV ");
             int div = number1/number2;
             div = absoluteValue(div);
             System.out.println("Result is " + div);
             break;
             case "MUL":
             System.out.println("Function is MUL ");
             int mul = number1*number2;
             mul = absoluteValue(mul);
             System.out.println("Result is " + mul);
             break;
             default:
             System.out.println("Look the text!");
             break;
             }
             String line = random5Characters();
     System.out.println("Random 5 characters: " + line);
     }
}