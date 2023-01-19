 public class Main {
  
    public static void main(String[] args) {
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);
       boolean choice = person.applyPassport();

       Person newp = new Person(person);
       newp.setSeatNumber(newp.chooseSeat());
       newp.setName("shema tonny");

        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + newp.getSeatNumber() + "\n");

        if (choice ==true){
            System.out.println("Congratulations "+ person.getName()+ " . your passport was approved");
           }else{
            System.out.println("we are sorry "+ person.getName()+ " . we can not process your application");
    
           }

    }
  
  
}
