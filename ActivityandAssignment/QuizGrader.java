public class QuizGrader {
    public static void main(String[] args) {

        //  Answer key
        char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'};

        // Answers ng student, manifesting pasado sa Finals plsplspls
        char[] studentAnswers = {'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'};

        // Zero muna tayo, sana di mazero
        int correctCount = 0;

        // Check natin isa-isa kung slay ba ang answers
        for (int i = 0; i < answerKey.length; i++) {

            // Kapag match, plus one agad
            if (studentAnswers[i] == answerKey[i]) {
                correctCount++;
            }
        }

        // Compute natin ang percentage
        double scorePercentage = (double) correctCount / answerKey.length * 100;

        System.out.println("Correct Answers: " + correctCount + "/" + answerKey.length);
        System.out.println("Score Percentage: " + scorePercentage + "%");

        // Time to find out kung pasado or need mag-review ulit
        if (scorePercentage >= 70.0) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

    }
}
