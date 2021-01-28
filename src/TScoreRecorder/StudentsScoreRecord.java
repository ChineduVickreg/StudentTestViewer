package TScoreRecorder;

public class StudentsScoreRecord {
    public static void main(String[] args) {
        int[][] scores = {{75, 83, 65, 59, 87}, {58, 68, 94, 83, 58}, {80, 73, 67, 45, 53}, {90, 76, 54, 65, 32}, {100, 54, 76, 23, 65}};
        int obinnaScores[] = scores[0];
        int SeyiScores[] = scores[1];
        int ChinweScores[] = scores[2];
        int FemiScores[] = scores[3];
        int musaScores[] = scores[4];
        String[] studentName = {"OBINNA", "SEYI", "CHINWE", "FEMI", "MUSA"};
//        for(int i = 0; i < studentName.length; i++){
//            System.out.println(studentName);
//        }
        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s%n","Maths", "English", "Biology", "Chemistry", "Physics",  "Total", "Min score", "Max score", "Av score");
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                System.out.print(scores[row][column] + "       ");
            }
            System.out.println();

        }
        System.out.printf("Obinna's Total Score: %d%n ", totalScore(obinnaScores));
        System.out.printf("Obinna's Minimum score: %d%n ", minScore(obinnaScores));
        System.out.printf("Obinna's Maximum score: %d%n ", maxScore(obinnaScores));
        System.out.printf("Obinna's Average score: %d%n ", averageScore(obinnaScores));

        System.out.printf("Seyi's Total score: %d%n ", totalScore(SeyiScores));
        System.out.printf("Seyi's Minimum score: %d%n ", minScore(SeyiScores));
        System.out.printf("Seyi's Maximum score: %d%n ", maxScore(SeyiScores));
        System.out.printf("Seyi's Average score: %d%n ", averageScore(SeyiScores));

        System.out.printf("Chinwe's Total score: %d%n ", totalScore(ChinweScores));
        System.out.printf("Chinwe's Minimum score: %d%n ", minScore(ChinweScores));
        System.out.printf("Chinwe's Maximum score: %d%n ", maxScore(ChinweScores));
        System.out.printf("Chinwe's Average score: %d%n ", averageScore(ChinweScores));

        System.out.printf("Femi's Total score: %d%n ", totalScore(FemiScores));
        System.out.printf("Femi's Minimum score: %d%n ", minScore(FemiScores));
        System.out.printf("Femi's Maximum score: %d%n ", maxScore(FemiScores));
        System.out.printf("Femi's Average score: %d%n ", averageScore(FemiScores));

        System.out.printf("Femi's Total score: %d%n ", totalScore(musaScores));
        System.out.printf("Femi's Minimum score: %d%n ", minScore(musaScores));
        System.out.printf("Femi's Maximum score: %d%n ", maxScore(musaScores));
        System.out.printf("Femi's Average score: %d%n ", averageScore(musaScores));
    }


    public static int minScore(int[] scores) {
        int minimum = scores[0];
        for (int score : scores) {
                if (score < minimum) {
                    minimum = score;
                }
            }
        return minimum;
    }

    public static int maxScore(int[] scores){
        int maximum = scores[0];
        for (int score : scores){
            if (score > maximum){
                maximum = score;
            }
        }
        return maximum;
    }
    public static int totalScore(int[] scores){
        int total = 0;
        for (int  score : scores){
                total +=score;
            }

        return total;
    }

    public static int averageScore(int[] scores){
        int average =  0;
        average = totalScore(scores) / scores.length;
        return average;
    }
}