import java.util.Scanner;

class Student4{
    int id;
    String name;
    String subjects[];
    int marks[];

    void setStudent4(int id,String name,String subjects[],int marks[]){
        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
    }

    int calTotal() {
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }

        return total;
    }

    double calAverage(int total) {
        double avg = total / (double) marks.length;
        return avg;
    }

    char getResult(double avg) {
        char result;

        if (avg >= 75) {
            result = 'A';
        } else if (avg >= 65) {
            result = 'B';
        } else if (avg >= 55) {
            result = 'C';
        } else if (avg >= 45) {
            result = 'D';
        } else {
            result = 'F';
        }

        return result;
    }

    void display() {
    int total = calTotal();
    double avg = calAverage(total);

    System.out.println("\n========== STUDENT DETAILS ==========");
    System.out.println("ID            : " + id);
    System.out.println("Name          : " + name);
    System.out.println("-------------------------------------");

    for (int i = 0; i < marks.length; i++) {
        char result = getResult(marks[i]);

        System.out.println("Subject       : " + subjects[i]);
        System.out.println("Marks         : " + marks[i]);
        System.out.println("Grade         : " + result);
        System.out.println("-------------------------------------");
    }

    System.out.println("Total         : " + total);
    System.out.println("Average       : " + avg);
    System.out.println("Overall Grade : " + getResult(avg));
    System.out.println("=====================================");
    }
}