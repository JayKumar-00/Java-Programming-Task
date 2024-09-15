import java.util.ArrayList;
import java.util.Scanner;
public class Task_01{
    public static void calculate(ArrayList<Float> grades){
        float largest = grades.get(0);

        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i) > largest) {
                largest = grades.get(i);
            }
        }
        System.out.println("Highest Grade of class is : " + largest);

        float smallest = grades.get(0);

        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i) < smallest) {
                smallest = grades.get(i);
            }
        }
        System.out.println("Lowest Grade of class is : " + smallest);

        float sum = 0;
        for(int i=0;i<grades.size(); i++){
            sum += grades.get(i);
        }
        float avg = sum / grades.size();
        System.out.println("Average of class is : " + avg);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers of student: ");
        int students = sc.nextInt();

        ArrayList<Float> grades = new ArrayList<>();

        for(int i=0; i<students; i++){
            System.out.println("Enter the marks for student " + (i+1) + " : ");

            float marks = sc.nextInt();
            grades.add(marks);
        }

        System.out.println("Grades of " + students + ": "+ grades);

        calculate(grades);
    }
}
