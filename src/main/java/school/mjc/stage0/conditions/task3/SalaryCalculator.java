package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10_000) {
            System.out.println(salary * 0.85);
        } else if (salary <= 20_000) {
            System.out.println(salary * 0.82);
        } else {
            System.out.println(salary * 0.8);
        }
    }
}
