package seminar6;

public class Main {
    public static void main(String[] args) {
        // конструкция WorkerBuilder.getInstance().build() запрещает доступ других потоков к данному worker'у
//        Worker worker = WorkerBuilder.getInstance().salary(25000).setName("Ivan").cabinet((byte) 24).build();
//        System.out.println(worker);
        Cat cat = CatBuilder.getInstance().setName("Барсик").setAge(5).setBreed("сибирская").setColor("рыжий").build();
        System.out.println(cat);
    }
}
