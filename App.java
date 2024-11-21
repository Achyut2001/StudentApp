package Application;

import java.util.*;

public class App extends Student {
    public App(int id, String name, int sal) {
        super(id, name, sal);
    }
    public static void main(String[] args) {
        List<Student> ar = new LinkedList<>();
        ar.add(new Student(2, "Solanki", 45555));
        ar.add(new Student(1, "Mayank", 1234));
        ar.add(new Student(3, "Aggarwal", 7852));
        ar.add(new Student(4, "Anshul", 1233));

        // Sorting the list by ID
        Collections.sort(ar);

        // Remove By Id
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id which u want to Delete");
        int idToRemove = sc.nextInt();

        // Using iterator to remove by id
        Iterator<Student> iterator = ar.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == idToRemove) {
                iterator.remove();
            }
        }
        /*Adding new Data*/


        System.out.println("PROVIDE STUDENT DETAILS TO ADD");
        System.out.println("PROVIDE THE ID OF EMPLOYEE");
        int newId = sc.nextInt();
        System.out.println("PROVIDE THE NAME OF EMPLOYEE");
        String name = sc.next();
        sc.nextLine();
        System.out.println("PROVIDE THE SAL OF EMPLOYEE");
        int sal = sc.nextInt();

        ar.add(new Student(newId, name, sal));

        for (Object obj : ar) {
            System.out.println(obj);
        }

        /*Updating data*/

        for (Object obj : ar) {
            System.out.println(obj);
        }

        /*Updating data*/
        System.out.println("Enter ID to update student details:");
        int idToUpdate = sc.nextInt();
        sc.nextLine();
        boolean isUpdated = false;

        for (Student student : ar) {
            if (student.getId() == idToUpdate) {
                System.out.println("Enter new name:");
                String updatedName = sc.nextLine();
                System.out.println("Enter new salary:");
                int updatedSal = sc.nextInt();
                sc.nextLine();
                student.setName(updatedName);
                student.setSal(updatedSal);

                isUpdated = true;
                break;
            }
        }

        if (isUpdated) {
            System.out.println("Student details updated successfully.");
        } else {
            System.out.println("Student with the given ID not found.");
        }

// Display updated list
        System.out.println("Updated list of students:");
        for (Object obj : ar) {
            System.out.println(obj);
        }


    }
}
