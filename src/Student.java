public class Student {

    //variables
    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores = 0.0;
    private int testScoreCount = 0;

    //student class
    public Student(String firstName, String lastName, int gradYear)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this. gradYear = gradYear;
    }

    // Sets gradYear to newGradYear
    public void updateGradYear(int newGradYear)
    {
        gradYear = newGradYear ;
    }

    // Adds newTestScore to accumulatedTestScores
// and increments testScoreCount by 1
    public void addTestScore(double newTestScore)
    {
        testScoreCount ++;
        accumulatedTestScores += newTestScore;
    }

    // Returns the number of test scores that have been added
    public int getTestScoreCount()
    {
        return testScoreCount;
    }
    // Returns the Student’s average test score as the
// quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore()
    {
        return accumulatedTestScores/testScoreCount;
    }

    // this method prints all info of a Student object to the console
    public void printStudentInfo()
    {
        System.out.println("Student name:" + firstName + " " + lastName);
        System.out.println("Graduation year:" + gradYear);
        System.out.println("Average test score:" + averageTestScore());
        System.out.println("Number of tests averaged:" + testScoreCount);
    }
}