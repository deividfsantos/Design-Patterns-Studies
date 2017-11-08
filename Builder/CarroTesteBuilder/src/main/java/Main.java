public class Main {

    public static void main(String[] args) {
        Person person = PersonBuilder.builder()
                .withName("Joaquim")
                .withAge(18)
                .withPhone(984564215)
                .withCar("Red", "ABC-5656", "Renault", "Clio", 2001)
                .withAdress(123, "Gravatai", "RS", "Brazil")
                .build();

        System.out.println(person);

    }

}
