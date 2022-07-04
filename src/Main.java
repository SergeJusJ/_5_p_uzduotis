import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Student studentas = new Student();
/*       studentas.age = 17;
     studentas.setSurname("Giedraitis");
     studentas.setName("Juozapas");
       studentas.grades.add(9);
       studentas.name = "Juozapas";
       studentas.surname = "Giedraitis";
       studentas.grades.add(10);
        studentas.addGrade(10);
        studentas.addGrade(9);
        */

    /*    Student studentas3 = new Student("Algis", "Ramanauskas",54);
        ArrayList<Student> students = new ArrayList<>();
        students.add(studentas);
        students.add(studentas3);
*/

        //studentu masyvas
        ArrayList<Student> students = new ArrayList<>();
//studentas vienas
        Student student = new Student();

        Scanner sc = new Scanner(System.in);

        System.out.println("Ivesk Varda: "); student.setName(sc.nextLine());

        System.out.println("Ivesk Pavarde: "); student.setSurname(sc.nextLine());

        System.out.println("Enter email: "); student.setEmail(sc.nextLine());

        System.out.println("Ivesk Age: "); student.setAge(sc.nextInt());

        System.out.println("Ivesk PhoneNr: "); student.setPhNr(sc.nextInt());

       // System.out.println("Ivestas Studentas:  " + student.toString());

        students.add(student);

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }



      /*  String text = "";
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.print(student.getName() + " " + student.getSurname() + " ");
            for (int a = 0; a < student.getGrades().size(); a++) {
                int grade = student.getGrades().get(a);
                System.out.print(grade + ", ");
                text = text + grade + ", ";
            }
            System.out.println();
            System.out.println(text);
        }*/


      //  Student.classInfo();



      //  HelperClass.distance();



    }


}