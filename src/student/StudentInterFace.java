
package student;

import java.util.Scanner;


public class StudentInterFace {

    
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Scanner scan = new Scanner(System.in);
        
        String name;
        int score;
        while(true){
        System.out.println("Enter name for First student (min 1 letter): ");
        name = scan.nextLine();
        stu1.setName(name);
        for (int i = 1; i < 3; i++) {
            System.out.format("Enter test score %d for %s> ", i, stu1.getNames());
            score = scan.nextInt();
            stu1.setScore(i, score);
        
        }
        String errormag =stu1.validateData();
        if (errormag == null){
            break;
        }else{
            System.out.println(errormag);
        }
        
        scan.nextLine();
        }
        System.out.println("\n----------------------\n");
        System.out.println("Enter name for second student: ");
        name = scan.nextLine();
        stu2.setName(name);
        for (int i = 1; i < 3; i++) {
            System.out.format("Enter test score %d for %s> ", i, stu2.getNames());
            score = scan.nextInt();
            stu2.setScore(i,score);
        }
        System.out.println("\n----------------------\n");
        System.out.println(stu1);
        System.out.println(stu2);
        
        if(stu1.getAverage()>stu2.getAverage()){
            
           
            System.out.format("Average for %s is %.2f", stu1.getNames(),stu1.getAverage());
        }
        else{
            System.out.format("Average for %s is %.2f", stu2.getNames(),stu2.getAverage());
        }
        if(stu1.getHighScore()>stu2.getHighScore()){
        System.out.format("High score for %s is %.2f", stu1.getNames(),stu1.getHighScore());
        }
        else{
        System.out.format("High score for %s is %.2f", stu2.getNames(),stu2.getHighScore());
        }
        
    }
    
}

