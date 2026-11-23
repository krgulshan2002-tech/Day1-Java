public class Manager extends Employee {
    public Manager(String name, int id) {
        super(name, id);
    }
    @Override
    public void work() {
        System.out.println(getName() + " team ko manage kar raha hai");
    }
    @Override
    public double calculateSalary() {
        return 50000;
    }
}