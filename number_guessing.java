import javax.swing.*;
public class number_guessing {
    public static void main(String[] args) {
        int computeNum = (int) (Math.random() * 100 + 1);
        int userAns = 0;
        int count = 1;
        try {
            while (userAns != computeNum) {
                String response = JOptionPane.showInputDialog(null, "Guess a number between 1 and 100.");
                userAns = Integer.parseInt(response);
                JOptionPane.showMessageDialog(null, " " + determineGuess(userAns, computeNum, count));
                count++;
            }
        } catch (Exception e) {
        }
    }
     public static String determineGuess(int userAns, int computeNum, int count) {
        if (userAns <= 0 || userAns > 100) {
            return "Your guess is invalid";
        } else if (userAns == computeNum) {
            return "GREAT! You guessed the correct number.You won the game. \n You guessed the number in " + count+" attempts.";
        } else if (userAns > computeNum) {
            return "Your guess is too high, try again! \n Enter Number : " + count;
        } else if (userAns < computeNum) {
            return "Your guess is too low, try again! \n Enter Number :  " + count;
        } else {
            return "Your guess is incorrect \n Enter Number : " + count;
        }
    }
}