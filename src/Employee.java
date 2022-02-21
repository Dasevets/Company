public abstract class Employee {
    private String name;
    private int age;
    private int workExperience;

    protected Employee(String name, int age, int workExperience) {
        this.name = name;
        this.age = age;
        this.workExperience = workExperience;
        if(workExperience > age - 18){
            System.out.println("It can not be");
        }
    }

    protected void work(){
        System.out.print("Work hard ");

    }

    protected void communication(){
        System.out.print("Message sent ");
    }

}
