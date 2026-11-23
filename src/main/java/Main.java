public class Main {
    public static void main(String[] args) {
        Employee m = new Manager("Aman", 1);
        Employee d = new Developer("Rahul", 2);

        m.work();
        System.out.println("Salary: " + m.calculateSalary());

        d.work();
        System.out.println("Salary: " + d.calculateSalary());
    }
}