class student {
    int rollno;
    String name;
    static String college_name;

    student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;

    }
}

class studentoopsques {
    public static void main(String[] args) {
        student obj = new student(247080, "sumit");
        student.college_name = "saitm";
        System.out.println(obj.rollno);
        System.out.println(obj.name);
        System.out.println(student.college_name);
    }
}
