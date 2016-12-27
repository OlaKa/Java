package com.gmail.murmeldjur.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

/**
 * Created by Ola on 2016-12-25.
 */
public class Main {

    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("Red RidingHood", 35);
        Employee charming = new Employee("Prince Charming", 31);


        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);

        Function<Employee, String> getLastName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf(' ') + 1);
        };

        String lastName = getLastName.apply(employees.get(2));
        System.out.println(lastName);

        Function <Employee,String> upperCase = employee -> employee.getName().toUpperCase();
        Function<String,String> firstName = name -> name.substring(0,name.indexOf(' '));
        Function chainedFunction = upperCase.andThen(firstName);
        System.out.println(chainedFunction.apply(employees.get(3)));

        BiFunction<String,Employee,String> concatAge = (String name, Employee employee)->{
            return name.concat(" " + employee.getName());
        };

        String upperName = upperCase.apply(employees.get(0));
        System.out.println(concatAge.apply(upperName, employees.get(0)));

        IntUnaryOperator incBy5 = i -> i+5;
        System.out.println(incBy5.applyAsInt(10));

        Consumer<String> c1 = s ->s.toUpperCase();
        Consumer<String> c2 = s -> System.out.println(s);
        c1.andThen(c2).accept("Hello World!");

        //System.out.println("Employees over 30");
        //System.out.println("*********************");

      /*  printEmployeesByAge(employees,"Employees over 30", employee -> employee.getAge() > 30);
        printEmployeesByAge(employees,"\nEmployees 30 and under", employee -> employee.getAge() <= 30);
        printEmployeesByAge(employees, "Employees 25 and under", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge() < 25;
            }
        });

        IntPredicate intp = i -> i > 15;
        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
        for (int i = 0;i<10;i++){
            System.out.println(randomSupplier.get());
        }

        employees.forEach( employee -> {
            String lastName = employee.getName().substring(employee.getName().indexOf(' ') + 1);
            System.out.println(lastName);
        });*/

        /*employees.forEach(employee -> {
            if(employee.getAge() > 30){
                System.out.println(employee.getName());
            }
        });*/
        /*for(Employee employee: employees) {
            if (employee.getAge() > 30)
                System.out.println(employee.getName());
        }*/
        /*employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });*/
    }
    private static void printEmployeesByAge(List<Employee> employees,
                                            String ageText,
                                            Predicate<Employee> ageCondition){
        System.out.println(ageText);
        System.out.printf("******************\n");
        for(Employee employee: employees){
            if (ageCondition.test(employee)){
                if (ageCondition.test(employee)){
                    System.out.println(employee.getName());
                }
            }
        }
    }
}
