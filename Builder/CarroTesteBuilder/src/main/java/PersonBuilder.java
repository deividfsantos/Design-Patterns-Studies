public class PersonBuilder {

    private Person person;

    public PersonBuilder() {
        this.person = new Person();
    }

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }

    public PersonBuilder withName(String name){
        this.person.setName(name);
        return this;
    }

    public PersonBuilder withPhone(long phone){
        this.person.setPhone(phone);
        return this;
    }

    public PersonBuilder withAge(int age){
        this.person.setAge(age);
        return this;
    }

    public PersonBuilder withCar(String color, String licensePlate, String brand, String model, int year){
        Car car = new Car();
        car.setColor(color);
        car.setLicensePlate(licensePlate);
        car.setBrand(brand);
        car.setModel(model);
        car.setYear(year);
        this.person.setCar(car);
        return this;
    }

    public PersonBuilder withAdress(int number, String city, String state, String country){
        Adress adress = new Adress();
        adress.setCity(city);
        adress.setNumber(number);
        adress.setCountry(country);
        adress.setState(state);
        this.person.setAdress(adress);
        return this;
    }

    public Person build(){
        return this.person;
    }

}
