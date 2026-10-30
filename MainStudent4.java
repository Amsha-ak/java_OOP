class MainStudent4 {
    public static void main(String[] args) {
        Student4 s = new Student4();

        int id = 101;
        String name = "Amshajiny";
        int[] marks = {80, 70, 60, 50, 40};

        s.setstudent(id, name, marks);
        s.display(id, name, marks);
    }
}