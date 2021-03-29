package HomeWork5;

public class FiveClass {

    public static void main(String[] args) {

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("mail@mail.ru", 911, 15000, 22);
        employeesArray[1] = new Employee("mail@gmail.ru", 112, 25000, 42);
        employeesArray[2] = new Employee("gmail@mail.ru", 89095719589l, 10000, 34);
        employeesArray[3] = new Employee("mail@onego.ru", 89214581059l, 5000, 24);
        employeesArray[4] = new Employee("mail@rkmail.ru", 02, 9000, 18);

        for (int i = 0; i < employeesArray.length; i++) {
            if(employeesArray[i].getAge() > 40){
                employeesArray[i].printEmployeeInfo();
            }
        }

    }

}
