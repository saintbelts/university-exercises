/*
 Ask the user for two partial grades and a final grade, and print the final grade, which is obtained by averaging the three previous grades.
*/
public class Average_Grades {
    public static void main(String[] args) {
        float grade1 = 80.75f;
        float grade2 = 89.79f;
        float finalGrade = (float) (grade1 + grade2) / 2;
        System.out.printf("Final grade: %.2f", finalGrade);
    }
}
