package homework_5.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        Random random = new Random();

        List<String> names = new ArrayList<>(Arrays.asList("Игорь", "Марина", "Анна", "Дмитрий", "Екатерина", "Алексей", "Ольга", "Владимир", "Светлана", "Андрей",
                "Олег", "Никита", "Геннадий", "Митрофан", "Антон"));
        List<String> departments = new ArrayList<>(Arrays.asList("IT", "HR", "Sales", "IS"));


        for (int i = 0; i < 15; i++) {
            String name = names.get(i);
            int age = 20 + random.nextInt(46);
            String department = departments.get(random.nextInt(departments.size()));
            int salary = 10000 + random.nextInt(91) * 1000;

            Employee employee = new Employee(name, age, department, salary);
            employees.add(employee);

        }
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("=======Сотрудники старше 30 лет=======");
        printEmployeesOverAge(employees, 30);

        System.out.println("=======Сотрудники IT департамента=======");
        System.out.println(getEmployeesCountByDepartment(employees, "IT"));

        System.out.println("=======Самый богатый=======");
        System.out.println(getEmployeeWithMaxSalary(employees));

        System.out.println("=======Список сотрудников HR=======");
        System.out.println(getEmployeeListByDepartment(employees, "HR"));

        System.out.println("=======Средняя зарплата=======");
        System.out.println(getAverageSalary(employees));

    }

    private static void printEmployeesOverAge(List<Employee> employees, int age) {

        employees.stream().filter(x -> x.getAge() > age)
                .sorted((a, b) -> Integer.compare(a.getAge(), b.getAge())).forEach(x -> System.out.println(x));

    }

    private static int getEmployeesCountByDepartment(List<Employee> employees, String department) {
        return (int) employees.stream().filter(x -> x.getDepartment().equals(department)).count();
    }

    private static Employee getEmployeeWithMaxSalary(List<Employee> employees) {
        return employees.stream().max((a, b) -> Integer.compare(a.getSalary(), b.getSalary())).get();
    }

    private static List<String> getEmployeeListByDepartment(List<Employee> employees, String department) {
        return employees.stream().filter(x -> x.getDepartment().equals(department))
                .map(x -> x.getName()).sorted().collect(Collectors.toList());
    }

    private static double getAverageSalary(List<Employee> employees) {
        return (double) employees.stream().mapToInt(x -> x.getSalary()).sum() / employees.size();
    }


}
