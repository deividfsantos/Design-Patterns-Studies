public class Person {

    private String name;
    private long phone;
    private int age;
    private Car car;
    private Adress adress;

    public Person(String name, long phone, int age, Car car, Adress adress) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.car = car;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", age=" + age +
                ", car=" + car +
                ", adress=" + adress +
                '}';
    }
}
