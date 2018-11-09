import javafx.scene.control.ComboBox;

public class Student implements Comparable<Student> {
    private String fullName;
    private float averageGrade;

    public Student(String fullName, float averageGrade) {
        setFullName(fullName);
        setAverageGrade(averageGrade);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(float averageGrade) {
        this.averageGrade = averageGrade;
    }

    public String toString()
    {
        return String.format("%s has an average of %.1f%%", fullName, averageGrade);
    }

    @Override
    public int compareTo(Student otherStudent) {
        if (this.getAverageGrade() > otherStudent.getAverageGrade())
            return 1;
        else
            return -1;
    }
}
