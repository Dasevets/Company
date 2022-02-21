
/*
Создать класс компания, в которой находится список сотрудников

Создать класс сотрудник,
с полями: имя, возраст, опыт работы.
с методами: work(), communication()

Наследовать от класса сотрудник, классы:
директор, начальник отдела, инженер.
Переопределить методы (каждый сотрудник должен делать свою работу, отчитываться перед начальством и давать задание подчиненным)

 */


public class Company {
    public static void main(String[] args) {
        Company company = new Company();
        Employee[] employees = new Employee[4];

        Director dir = new Director("Mr. Ford", 55, 20);
        HeadOfDepartment hod = new HeadOfDepartment("Kyle", 35, 7);
        Engineer en1 = new Engineer("John", 60, 35);
        Engineer en2 = new Engineer("J.D.", 23, 0);
        employees[0] = dir;
        employees[1] = hod;
        employees[2] = en1;
        employees[3] = en2;
        company.start(employees);
    }

    public void start(Employee[] employees){

        for(Employee emp: employees){
            emp.work();
        }
    }
}
