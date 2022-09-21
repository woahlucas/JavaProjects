import javax.swing.JOptionPane;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String output = "";
        String input = JOptionPane.showInputDialog("Let's do some math! \n" + "\n 1. Addition" + "\n 2. Subtraction" +
                "\n 3. Division" + "\n 4. Multiplication" + "\n 5. Exit");
        int in = Integer.parseInt(input);
        Scanner keyboard = new Scanner(System.in);

        double firstnumber;
        double secondnumber;
        double result;

        switch (in) {
            case 1:
                firstnumber = Double.parseDouble(
                        JOptionPane.showInputDialog("Let's add some numbers!\n" + "\n Choose your first number:"));
                secondnumber = Double.parseDouble(
                        JOptionPane.showInputDialog("Choose your second number:"));
                result = firstnumber + secondnumber;
                JOptionPane.showMessageDialog(null, "The result is: " + result);
                break;
            case 2:
                firstnumber = Double.parseDouble(
                        JOptionPane.showInputDialog("Let's subtract some numbers!\n" + "\n Choose your first number:"));
                secondnumber = Double.parseDouble(
                        JOptionPane.showInputDialog("Choose your second number:"));
                result = firstnumber - secondnumber;
                JOptionPane.showMessageDialog(null, "The result is: " + result);
                break;
            case 3:
                firstnumber = Double.parseDouble(
                        JOptionPane.showInputDialog("Let's divide some numbers!\n" + "\n Choose your first number:"));
                secondnumber = Double.parseDouble(
                        JOptionPane.showInputDialog("Choose your second number:"));
                result = firstnumber / secondnumber;
                JOptionPane.showMessageDialog(null, "The result is: " + result);
                break;
            case 4:
                firstnumber = Double.parseDouble(
                        JOptionPane.showInputDialog("Let's multiply some numbers!\n" + "\n Choose your first number:"));
                secondnumber = Double.parseDouble(
                        JOptionPane.showInputDialog("Choose your second number:"));
                result = firstnumber * secondnumber;
                JOptionPane.showMessageDialog(null, "The result is: " + result);
                break;
            case 5:
                System.exit(0);
                break;
        }
    }
}
