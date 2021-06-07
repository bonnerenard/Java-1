public class HomeWorkApp5 {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0]=new Employee("Boldina Elena","engineer","eboldina@mail.ru",87585,50000,28);
        employee[1]=new Employee("Gorna lili","analyst","lgorna@mail.ru",67554,65000,35);
        employee[2]=new Employee("Babadga Vugar","director","vbabadga@mail.ru",64566,150000,31);
        employee[3]=new Employee("Tueva Anastasiya","engineer","atueva@mail.ru",86676,50000,42);
        employee[4]=new Employee("Nenashev Boris","engineer","bnenashev@mail.ru",83457,50000,46);
        for(int i=0;i<employee.length;i++){
            if (employee[i].age>40){
                employee[i].printInfo();
            }
        }
    }

}
