package ru.geekbrains.staff;

public class Staff {
    public static void main(String[] args) {

        Worker[] workersArray = {
                new Worker("Ivanov Ivan", "Engineer",
                        "iivanov@mail.com", 892312312, 30000, 25),
                new Worker("Petrov Petr", "Lead Engineer",
                        "ppenrov@mail.com", 892312311, 42000, 40),
                new Worker("Vasilev Vasil", "Head of Department",
                        "vvasilev@mail.com", 892313313, 55000, 55),
                new Worker("Sidorov Sidor", "Assistant",
                        "ssidorov@mail.com", 892312312, 25000, 42),
                new Worker("Sergeev Sergey", "Trainee",
                        "ssergeev@mail.com", 892312312, 15000, 19)
        };

        for(Worker item : workersArray) {
            if(item.GetAge() > 40) item.show();
        }

    }
}
