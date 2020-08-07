/*   Created by IntelliJ IDEA.
 *   Author: Pragya Sharma
 *   Date: 07/08/20
 *   Time: 6:12 PM
 *   File: RandomDetails.java
 */
public class RandomDetails {
    public static void main(String[] args) {
        String[] namesOfStudents = {"Kritika Sharma", "Komal Bindal", "Pragya Sharma", "Ishank Sharma", "Tanu Bharadwaj"};
        String[] courses = {"B.tech", "B.tech", "B.tech", "11th Standard", "B.Sc."};
        long[] phoneNumbers = {9654152475L, 9846573586L, 9796754713L, 9557629284L, 9798400476L};
        int[] rollNumbers = {18, 17, 45, 20, 34};
        float[] marksInPercentage = {86.7f, 96.4f, 94.8f, 87.25f, 91.5f};
        int randomIndex = (int) (Math.random() * namesOfStudents.length);
        System.out.println("Name of the Student is " + namesOfStudents[randomIndex]);
        System.out.println("Roll Number of the Student is " + rollNumbers[randomIndex]);
        System.out.println("phoneNumber of the Student id " + phoneNumbers[randomIndex]);
        System.out.println("Course of the Student is " + courses[randomIndex]);
        System.out.println("Percentage Marks of Student is " + marksInPercentage[randomIndex]);
    }
}
