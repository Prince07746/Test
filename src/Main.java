import java.util.ArrayList;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CustomerStore customerStore = new CustomerStore();


        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Sedan("SedanCar", generateFakeModel(), 40, generateLicensePlate()));
        vehicles.add(new Sedan("SedanCar", generateFakeModel(), 41, generateLicensePlate()));
        vehicles.add(new SportBike("SportBike", generateFakeModel(), 29, generateLicensePlate()));
        vehicles.add(new SportBike("SportBike", generateFakeModel(), 49, generateLicensePlate()));

        
    }
    
    public static String generateLicensePlate() {
        Random rand = new Random();
        return "KAMP" + (rand.nextInt(9000) + 1000);
    }
    public static String generateFakeModel() {
        String[] fakemodel = {"Zonda", "shown", "", "et", "Gaal"};
        Random rand = new Random();
        return fakemodel[rand.nextInt(fakemodel.length)];
    }
}


interface Vehicle{
    String getLicensePlate();
    String getVehicleType();
    double getRentalPricePerDay();
    void printVehicleDetails();
    void printRentedBy();
    void rentVehicle(Customer customer);
    void returnVehicle(Customer customer);
}


abstract class Car implements Vehicle{
   private String name;
   private String model;
   private double rentalPricePerDay;
   private String type;
   private String licensePlate;

   public Car(String name,String model,double rentalPricePerDay,String licensePlate){
     this.name = name;
     this.model = model;
     this.rentalPricePerDay = rentalPricePerDay;
     this.licensePlate = licensePlate;
     type = "CAR";
   }
   @Override
   public void returnVehicle(Customer customer){

   }
   @Override
   public void rentVehicle(Customer customer){

   }
   @Override
   public void printRentedBy(){

   }
   @Override
   public void printVehicleDetails(){
       System.out.println("Name: "+this.name+" model: "+model+" price: "+this.rentalPricePerDay+" type: "+this.type);
   }
   @Override
   public double getRentalPricePerDay(){
       return rentalPricePerDay;
   }
   @Override
   public String getLicensePlate(){
       return licensePlate;
   }
   @Override
   public String getVehicleType(){
       return  type;
   }
   @Override
    public String toString(){
       return "Name: "+this.name+" model: "+model+" price: "+this.rentalPricePerDay+" type: "+this.type;
   }
}





abstract class Motorcycle implements Vehicle{
    private String name;
    private String model;
    private double rentalPricePerDay;
    private String type;
    private String licensePlate;
    ArrayList<>
    public Motorcycle(String name,String model,double rentalPricePerDay,String licensePlate){
        this.name = name;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.licensePlate = licensePlate;
        type = "Motorcycle";
    }
    @Override
    public void returnVehicle(Customer customer){

    }
    @Override
    public void rentVehicle(Customer customer){

    }
    @Override
    public void printRentedBy(){

    }
    @Override
    public void printVehicleDetails(){
        System.out.println("Name: "+this.name+" model: "+model+" price: "+this.rentalPricePerDay+" type: "+this.type);
    }
    @Override
    public double getRentalPricePerDay(){
        return rentalPricePerDay;
    }
    @Override
    public String getLicensePlate(){
        return licensePlate;
    }
    @Override
    public String getVehicleType(){
        return  type;
    }
    @Override
    public String toString(){
        return "Name: "+this.name+" model: "+model+" price: "+this.rentalPricePerDay+" type: "+this.type;
    }
}



class Sedan extends Car{

    public Sedan(String name,String model,double rentalPricePerDay,String licensePlate){
        super(name, model, rentalPricePerDay, licensePlate);
    }

    @Override
    public void returnVehicle(Customer customer) {
        super.returnVehicle(customer);
    }

    @Override
    public void rentVehicle(Customer customer) {
        super.rentVehicle(customer);
    }

    @Override
    public void printRentedBy() {
        super.printRentedBy();
    }

    @Override
    public void printVehicleDetails() {
        super.printVehicleDetails();
    }

    @Override
    public double getRentalPricePerDay() {
        return super.getRentalPricePerDay();
    }

    @Override
    public String getLicensePlate() {
        return super.getLicensePlate();
    }

    @Override
    public String getVehicleType() {
        return super.getVehicleType();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

class SportBike extends Motorcycle{
    public SportBike(String name,String model,double rentalPricePerDay,String licensePlate){
        super(name, model, rentalPricePerDay, licensePlate);
    }

    @Override
    public void returnVehicle(Customer customer) {
        super.returnVehicle(customer);
    }

    @Override
    public void rentVehicle(Customer customer) {
        super.rentVehicle(customer);
    }

    @Override
    public void printRentedBy() {
        super.printRentedBy();
    }

    @Override
    public void printVehicleDetails() {
        super.printVehicleDetails();
    }

    @Override
    public double getRentalPricePerDay() {
        return super.getRentalPricePerDay();
    }

    @Override
    public String getLicensePlate() {
        return super.getLicensePlate();
    }

    @Override
    public String getVehicleType() {
        return super.getVehicleType();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}



class Customer{
    private String name;
    private double account;
    public Customer(String name,double account){
        this.name = name;
        this.account = account;
    }

}


class CustomerStore{
    ArrayList<Customer>  customers;
    public CustomerStore(){
        customers = new ArrayList<>();
    }

    public void addNewCustomer(){

    }
}


//
//ou are tasked with designing a vehicle rental system. The system will manage different types of vehicles (cars and motorcycles) and customers who can rent these vehicles. You will need to implement:
//
//Vehicle Interface:
//
//Define a Vehicle interface with the following methods:
//String getLicensePlate()
//String getVehicleType()
//double getRentalPricePerDay()
//void printVehicleDetails()
//void printRentedBy()
//void rentVehicle(Customer customer)
//void returnVehicle(Customer customer)
//
//
//Car and Motorcycle Classes:
//
//Create two abstract classes, Car and Motorcycle, that implement the Vehicle interface. These classes should:
//Implement the necessary methods from the Vehicle interface.
//Store basic vehicle-related information such as license plate, vehicle type, and rental price.
//Maintain a list of customers who have rented the vehicles using an array or ArrayList.
//
//
//Customer Class:
//
//Define a Customer class to store basic customer information such as name, age, and customer ID.
//
//
//Vehicle Implementations:
//
//Create two concrete classes:
//
//Sedan, which extends Car.
//        SportBike, which extends Motorcycle.
//        Each class should define specific vehicle-related fields and implement any abstract methods.
//
//
//Main Program:
//
//In the main program, create 10 instances of the Customer class and assign some of them to rent either a Sedan or a SportBike.
//After renting and returning some vehicles, print out the details of the vehicles and which customers have rented them.
//Upload your codes to github
//
//deadline :6.13pm
