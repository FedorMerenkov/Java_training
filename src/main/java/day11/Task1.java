package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Warehouse warehouse2 = new Warehouse();
        Courier courier1 = new Courier(warehouse1);
        Picker picker1 = new Picker(warehouse1);
        Courier courier2 = new Courier(warehouse1);
        Picker picker2 = new Picker(warehouse1);
        for (int i = 0; i < 20; i++) {
            courier1.bonus();
            courier1.doWork();
        }
        for (int i = 0; i < 20; i++) {
            picker1.bonus();
            picker1.doWork();
        }
        for (int i = 0; i < 60; i++) {
            courier2.bonus();
            courier2.doWork();
        }
        for (int i = 0; i < 60; i++) {
            picker2.bonus();
            picker2.doWork();
        }
        System.out.println(warehouse1.getBalance() + " " + warehouse1.getCountOrders());
        System.out.println(warehouse2.getBalance() + " " + warehouse2.getCountOrders());
        System.out.println(courier1.getSalary() + " " + picker1.getSalary());
        System.out.println(courier2.getSalary() + " " + picker2.getSalary());
        Courier courier3 = new Courier(warehouse2);
        courier3.doWork();
        courier3.doWork();
        System.out.println(warehouse2.getBalance());
        Picker picker3 = new Picker(warehouse1);
        picker3.doWork();
        System.out.println(warehouse1.getCountOrders());
    }
}
