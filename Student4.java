class Student4 {
    int id;
    String name;
    int[] marks;

    void setstudent(int id, String name, int[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    int calctotal() {
        int total = 0;

        for (int i = 0; i <this. marks.length; i++) {
            total = total + this.marks[i];
        }

        return total;
    }

    double calcavg() {
        return (double) calctotal() / this.marks.length;
    }

    char getresult() {
        char result='\u0000';
		double avg = calcavg();
		

        if (avg >= 75) {
            result= 'A';
        } else if (avg >= 65) {
            result= 'B';
        } else if (avg >= 55) {
            result= 'C';
        } else if (avg >= 45) {
            result= 'D';
        } else {
            result= 'F';
        }
		return result;
    }

    String[] getSubjectResult() {
        String[] subjectResult = new String[marks.length];

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 35) {
                subjectResult[i] = "Pass";
            } else {
                subjectResult[i] = "Fail";
            }
        }

        return subjectResult;
    }

    void display( int id, String name,int[] marks) {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);

        String[] subjectResult = getSubjectResult();

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
    "Subject " + (i + 1) + " Marks: " + marks[i]
                + " - " + subjectResult[i]
            );
        }

        System.out.println("Total: " + calctotal());
        System.out.println("Average: " + calcavg());
        System.out.println("Grade: " + getresult());
    }
}


