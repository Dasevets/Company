public class Engineer extends Employee{

    public Engineer(String name, int age, int workExp){
        super(name, age, workExp);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("and develop innovations");
        communication();
    }


    @Override
    public void communication() {
        super.communication();
        System.out.println("for head of department");
        report();
    }

    public void report(){
        System.out.println("Send report for head of department");
    }
}
