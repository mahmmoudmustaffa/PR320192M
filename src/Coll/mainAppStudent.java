/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 *
 * @author aashgar
 */
public class mainAppStudent {
    public static void main(String[] args) {
        Student[] students ={
            new Student("Ahmad", "CS", 71.77),
            new Student("Maher", "ART", 99.99),
            new Student("Zaki", "IS", 88.01),
            new Student("Alaa", "ENG", 80.77),
            new Student("Omar", "PRG", 100.8),
            new Student("Ahmad", "IS", 79.77),
            new Student("Ahmad", "Eng", 77.77),
            new Student("Alaa", "CS", 89.77),
        };
        List<Student> studentsList = new
            ArrayList<>(Arrays.asList(students));
        System.out.println("All Students ...");
        for(Student student: studentsList)
            System.out.println(student);
        
//        Collections.sort(studentsList, new Comparator<Student>() {
//
//            @Override
//            public int compare(Student o1, Student o2) {
//                if(o2.getGrade() > o1.getGrade())
//                    return 1;
//                else if(o2.getGrade()< o1.getGrade())
//                    return -1;
//                return 0;
//            }
//        });
//        System.out.println("Sorting By grade ...");
        //studentsList.stream()
          //      .forEach(System.out:: println);
        
       double avg= studentsList.stream()
                .mapToDouble(Student::getGrade)
                .average()
                .getAsDouble();
        System.out.println("Average is:");
        System.out.println(avg);
        
        System.out.println("\nSorting by lambdas ...");
        studentsList.stream()
                .sorted(Comparator.comparing(Student::getGrade))
                .forEach(System.out:: println);
        
        System.out.println("\nStudents with grade >= 80");
        studentsList.stream()
                .filter(s -> {
                    if(s.getGrade() >= 80)
                        return true;
                    else return false;
                })
                .forEach(System.out:: println);
        
        System.out.println("\n Sorting by name ...");
        studentsList.stream()
                .sorted(Comparator.comparing(Student::getName)
                   .thenComparing(Student::getMajor))
                .forEach(System.out::println);
        System.out.println("\nGrouping by major");
        studentsList.stream()
                .collect(Collectors.groupingBy(Student::getMajor))
                .forEach((major,stuMajor)->{
                System.out.println(major);
                stuMajor.forEach(
                        s -> System.out.printf("%30s\n",s));
                
                });
        System.out.println("Counting No. of students by major");
        studentsList.stream()
                .collect(Collectors.groupingBy(
                        Student::getMajor,Collectors.counting()))
                .forEach((major,count)->{
                    System.out.println("Major: "+major+" has count: "+
                            count);
                });
        
        
    }
}
