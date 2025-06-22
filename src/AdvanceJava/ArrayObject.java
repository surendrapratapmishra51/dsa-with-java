package AdvanceJava;

    class Student {
        int rollno;
        String name;
        int marks;
    }
    public class ArrayObject {
        public static void main(String[] args) {

            Student s1 = new Student();
            s1.rollno = 1;
            s1.name = "Navin";
            s1.marks = 88;

            Student s2 = new Student();
            s2.rollno = 2;
            s2.name = "Harsh";
            s2.marks = 67;

            Student s3 = new Student();
            s3.rollno = 3;
            s3.name = "Kiran";
            s3.marks = 98;

            Student student[] = new Student[3]; // we are creating an array which can hold student references
            student[0] = s1;
            student[1] = s2;
            student[2] = s3;

            for(int i = 0; i<student.length; i++){
                System.out.println(student[i].name + ";" +student[i].marks);
            }

        }
    }


