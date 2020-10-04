import java.util.Scanner;
import java.util.ArrayList;

public class Grade {
    int q;
    int f;
    int s;
    int p;
    ArrayList <Integer> grade = new ArrayList<Integer>();


    public void readGrade () {
        Scanner in = new Scanner(System.in);
        System.out.println("Put quality from 1 to 10");
        q = in.nextInt();
        while (!isValid(q)) {
            System.out.println("Put quality from 1 to 10");
            q = in.nextInt();
        }
        grade.add(q);

        System.out.println("Put formalization from 1 to 10");
        f = in.nextInt();
        while (!isValid(f)) {
            System.out.println("Put formalization from 1 to 10");
            f = in.nextInt();
        }
        grade.add(f);


       System.out.println("Put speed from 1 to 10, to skip put 0");
        s = in.nextInt();
        if (s == 0) {
            System.out.println("You skip grade");
        } else {
            while (!isValid(s)) {
                System.out.println("Put speed from 1 to 10, to skip put 0");
                s = in.nextInt();
            }
            grade.add(s);
        }

        System.out.println("Put politeness from 1 to 10, to skip put 0");
        p = in.nextInt();
        if (p == 0) {
            System.out.println("You skip grade");
        } else {
            while (!isValid(p)) {
                System.out.println("Put speed from 1 to 10, to skip put 0");
                p = in.nextInt();
            }
            grade.add(p);
        }

        System.out.println ("List of grades is " + grade);
    }

    private static boolean isValid (int a) {
        if (a > 0 && a < 11) {
            return true;
        } else {
            System.out.println("Your grade is not valid!");
            return false;
        }
    }


    public void calculateGrade() {
        double median = 0;
        for (int i = 0; i < grade.size(); i++){
            median += (double)grade.get(i);
        }
        median = median / grade.size();
        System.out.println("Your median is " + median);
    }

}
