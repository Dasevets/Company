public class Director extends Employee {

    public Director(String name, int age, int workExp){
        super(name,age,workExp);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("and manages company");

        communication();

    }

    @Override
    public void communication() {
        super.communication();
        System.out.println("for Head of Department");
    }
}
