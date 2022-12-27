package fifth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeWorking {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(
                Arrays.asList(
                        new Employee("Tony Stark", 45000, 34),
                        new Employee("Thor Odison", 35000, 24),
                        new Employee("Bruce Banner", 20000, 44),
                        new Employee("Henry Pym", 14000, 30),
                        new Employee("Peter Parker", 5000, 29),
                        new Employee("Peter Parker", 4500, 22)
                )
        );

        Comparator<Employee> compareWithName = Comparator.comparing(employee -> employee.getName());
        Comparator<Employee> compareWithAge = Comparator.comparing(employee -> employee.getAge());
        Comparator<Employee> compareWithSalary = Comparator.comparing(employee -> employee.getSalary());

        Comparator<Employee> compareWithNameAndAgeSalary = compareWithName
                .thenComparing(compareWithAge)
                .thenComparing(compareWithSalary);
        // we can also reverse the comparator
//        Comparator<Employee> reversed = compareWithNameAndAge.reversed();
//        employees.sort(reversed);
          employees.sort(compareWithNameAndAgeSalary);
        employees.forEach(employee -> System.out.println(employee));
    }
}
