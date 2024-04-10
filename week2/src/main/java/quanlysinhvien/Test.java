package quanlysinhvien;

public class Test {
    public static void main(String[] args) {
        // Create a StudentManagement object
        StudentManagement management = new StudentManagement();

        // Create students
        Student student1 = new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn");
        Student student2 = new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");
        Student student3 = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
        Student student4 = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");
        student2.setGroup("K66CC");
        student4.setGroup("K66CC");

        management.addStudent(student1);
        management.addStudent(student2);
        management.addStudent(student3);
        management.addStudent(student4);

        // Test sameGroup method
        System.out.println(StudentManagement.sameGroup(student1, student2)); // false
        System.out.println(StudentManagement.sameGroup(student3, student4)); // true

        // Print students by group
        System.out.println(management.studentsByGroup());
    }
}
