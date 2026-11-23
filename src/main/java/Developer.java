public class Developer extends Employee {
    public Developer(String name, int id) {
        super(name, id);
    }
    @Override
    public void work() {
        System.out.println(getName() + " code likh raha hai");
    }
    @Override
    public double calculateSalary() {
        return 40000;
    }
}