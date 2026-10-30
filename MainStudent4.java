import java.util.Scanner;

class MainStudent4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = input.nextInt();
        input.nextLine();

        String subjects[] = new String[n];
        int marks[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter subject " + (i + 1) + " name: ");
            subjects[i] = input.nextLine();

            System.out.print("Enter " + subjects[i] + " mark: ");
            marks[i] = input.nextInt();
            input.nextLine();
        }

        Student4 Stu1 = new StudentRecord();

        Stu1.setStudentRecord(id, name, subjects, marks);
        Stu1.display();
    }
}