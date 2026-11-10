package AccessModifier;
public class AccessModifier { 

    private int id;       
    private String name; 
    private int[] marks; 

    public AccessModifier(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setmarks(int[] marks) {
        this.marks = marks;
    }

    private int calctotal() {
        int total = 0; 

        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }

        return total;
    }

    private double calcavg() {
        return (double) calctotal() / marks.length;
    }

    private char getResult(double average) {
        char result; 

        if (average >= 75) {
            result = 'A';
        } else if (average >= 65) {
            result = 'B';
        } else if (average >= 55) {
            result = 'C';
        } else if (average >= 45) {
            result = 'D';
        } else {
            result = 'F';
        }

        return result;
    }

    private String[] getSubjectResult() {
        String[] subjectResult = new String[this.marks.length];

        for (int i = 0; i < this.marks.length; i++) {
            if (this.marks[i] >= 35) {
                subjectResult[i] = "Pass";
            } else {
                subjectResult[i] = "Fail";
            }
        }

        return subjectResult;
    }

    public void display() {
        String[] subjectResult = getSubjectResult();

        System.out.println();
        System.out.println("==================================");
        System.out.println("       STUDENT REPORT");
        System.out.println("==================================");

        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);

        System.out.println("----------------------------------");
        System.out.println("Subject Marks and Results");
        System.out.println("----------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                "Subject " + (i + 1) + " : " + marks[i]
                + " - " + subjectResult[i]
            );
        }

        System.out.println("----------------------------------");
        System.out.println("Total   : " + calctotal());
        System.out.println("Average : " + calcavg());
        System.out.println("Grade   : " + getResult(calcavg()));
        System.out.println("==================================");
    }
}