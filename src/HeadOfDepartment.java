public class HeadOfDepartment extends Employee{
    public HeadOfDepartment(String name, int age, int workExp){
        super(name, age, workExp);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("and manages engineer");
        communication();
    }



    @Override
    public void communication() {
        super.communication();
        System.out.println(" for engineer and director");
        report();


    }

    public void report(){
        System.out.println("Accept report from engineers");
        System.out.println("Send report for director");
    }
}
