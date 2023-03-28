import java.util.List;

public class Calculations {
    private List<Integer> gradeList;
    private List<Integer> weightList;

    public Calculations(List<Integer> gradeList, List<Integer> weightList) {
        this.gradeList = gradeList;
        this.weightList = weightList;
    }

    public double getWeightenedAverage() {
        double gradeValue = 0;
        double weightSum = 0;
        for (int i = 0; i < gradeList.size(); i++) {
            int grade = gradeList.get(i);
            int weight = weightList.get(i);

            gradeValue += grade*weight;
            weightSum += weight;
        }
        double average = gradeValue/weightSum;
        return average;
    }


    public double getDeviation() {
        double sum = 0;
        int i = 0;
        for (i = 0; i < gradeList.size(); i++) {
            int grade = gradeList.get(i);

            sum += grade;
        }
        double avg=  sum / i;

        double score = 0;
        for (i = 0; i < gradeList.size(); i++) {
            int grade = gradeList.get(i);

            score += (grade*grade);
        }

        return Math.sqrt((score/i)-(avg*avg));
        // todo - test
    }
}