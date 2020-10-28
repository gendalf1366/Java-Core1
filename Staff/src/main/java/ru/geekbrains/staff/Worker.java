package ru.geekbrains.staff;

public class Worker {
    public String name;
    public String position;
    public String email;
    public int number;
    public int salary;
    public int age;


    public Worker(String name, String position, String email, int number, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;

        if(age >= 18) {
            this.age = age;
        } else {
            System.out.println("Сотрудник должен быть старше 18 лет");
        }
    }

    int GetAge() {
        return age;
    }

    public void show(){
        System.out.println(name + " " + position + " " + email + " " + number + " " + salary + " " + age);
    }
}
