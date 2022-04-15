package com.sourceCode;

public class Dealership {

    public static void main(String[] args) {
        // write your code here
        Customer cust1 = new Customer();
        cust1.setName("Akash");
        cust1.setAddress("Street 14 , Sector 5");
        cust1.setCashOnHand(90000000);

        Customer cust2 = new Customer();
        cust1.setName("Nishu");
        cust1.setAddress("Street 14, QR 4/A");
        cust1.setCashOnHand(900000);

        Employee employee1 = new Employee();
        employee1.setEmployeeName("Shashank");
        employee1.setEmployeePost("SalesMan");

        Employee employee2 = new Employee();
        employee2.setEmployeeName("Harshit");
        employee2.setEmployeePost("Mananger");

        Vehicle vehicle = new Vehicle();
        vehicle.setMake("BMW");
        vehicle.setModel("A-Series");
        vehicle.setPrice(800000);

        Vehicle vehicle1 =  new Vehicle("Ferrari", "abs", 900000);

        Vehicle car = new Vehicle("BMM", "M3", 20000);
        Vehicle car2 = new Vehicle("BMM", "M4", 20000);


        boolean value = car.equals(car2); //we have override the methods in the Vehicle class to be checkin every field in the .equals method using Hashcode generate.
        System.out.println(value);





        cust1.purchaseCar(vehicle,employee1,false);


    }
}
