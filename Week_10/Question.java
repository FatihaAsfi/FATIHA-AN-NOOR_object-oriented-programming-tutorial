import javax.swing.JOptionPane;

public class Question {

    private int bossHP = 20;
    private int playerHP = 10;
    private int score = 0;

    private String[] questions = {
            "1. Which keyword is used to create an object in Java?",
            "2. Which method is the entry point of a Java program?",
            "3. Which keyword is used for inheritance?",
            "4. Which keyword is used to define a class?",
            "5. Which keyword is used to inherit an interface?"
    };

    private String[] answers = {
            "new",
            "main",
            "extends",
            "class",
            "implements"
    };

    public void startQuiz() {

        JOptionPane.showMessageDialog(null,
                "Welcome to Code Boss Battle!\n\n" +
                "Boss HP: 20\n" +
                "Player HP: 10\n\n" +
                "Correct Answer:\nBoss HP -20\nScore +10\n\n" +
                "Wrong Answer:\nPlayer HP -10");

        for (int i = 0; i < questions.length; i++) {

            if (bossHP <= 0 || playerHP <= 0)
                break;

            String input = JOptionPane.showInputDialog(
                    questions[i] +
                    "\n\nBoss HP: " + bossHP +
                    "\nPlayer HP: " + playerHP);

            if (input != null && input.equalsIgnoreCase(answers[i])) {

                bossHP -= 20;
                score += 10;

                JOptionPane.showMessageDialog(null,
                        "Correct!\n\nBoss HP = " + bossHP +
                        "\nPlayer HP = " + playerHP +
                        "\nScore = " + score);

            } else {

                playerHP -= 10;

                JOptionPane.showMessageDialog(null,
                        "Wrong!\n\nBoss HP = " + bossHP +
                        "\nPlayer HP = " + playerHP +
                        "\nScore = " + score);
            }
        }

        if (bossHP <= 0) {
            JOptionPane.showMessageDialog(null,
                    "🎉 YOU WIN!\n\nBoss Defeated!\nFinal Score: " + score);
        } else {
            JOptionPane.showMessageDialog(null,
                    "💀 GAME OVER!\n\nYour HP reached 0.\nFinal Score: " + score);
        }
    }
}