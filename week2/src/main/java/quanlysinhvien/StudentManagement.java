package quanlysinhvien;

import java.util.Arrays;

public class StudentManagement {
    private Student[] students;
    private int numOfStudent = 0;

    public StudentManagement() {
        students = new Student[100];
    }

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Add a new student to students array.
     *
     * @param newStudent new student
     */
    public void addStudent(Student newStudent) {
        // check if newStudent already exists
        boolean exist = false;

        for (int i = 0; i < numOfStudent; i++) {
            if (newStudent.equals(students[i])) {
                exist = true;
                break;
            }
        }

        if (!exist && numOfStudent < 100) {
            students[numOfStudent] = newStudent;
            numOfStudent++;
        }
    }

    /**
     * Print student by group.
     */
    public String studentsByGroup() {
        String result = "";
        String[] listGroups = new String[numOfStudent];
        int count = 0;

        for (int i = 0; i < numOfStudent; i++) {
            String group = students[i].getGroup();
            if (!Arrays.asList(listGroups).contains(group)) {
                listGroups[count] = group;
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            result += listGroups[i] + "\n";
            for (int j = 0; j < numOfStudent; j++) {
                if (students[j].getGroup().equals(listGroups[i])) {
                    result += students[j].getInfo() + "\n";
                }
            }
        }

        return result;
    }

    /**
     * Remove student from array.
     *
     * @param id student id
     */
    public void removeStudent(String id) {
        for (int i = 0; i < numOfStudent; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < numOfStudent - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numOfStudent - 1] = null;
                numOfStudent--;
                return;
            }
        }
    }
}
