package com.sourceCode;

public class Employee {


    private String employeeName;
    private String employeePost;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePost() {
        return employeePost;
    }

    public void setEmployeePost(String employeePost) {
        this.employeePost = employeePost;
    }









    public void handleCustomer(Customer cust , boolean finance, Vehicle vehicle){
        if(finance == true){
            double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
            runCreditHistory(cust,loanAmount);
        }
        else if (vehicle.getPrice() <= cust.getCashOnHand()){
            System.out.println("Customer pays in cash");
            processTransaction(cust,vehicle);
        }
        else {
            System.out.println("Customer Needs to sell their other Organs to Buy this Vehicle" + vehicle);
        }
    }
//
    public void runCreditHistory(Customer cust, double loanAmount ){
        System.out.println("Ran credit History for Customer.");
        System.out.println("Customer" +  "has been approved to purchase the vehicle");
    }


    public void processTransaction(Customer cust, Vehicle vehicle){
        System.out.println("Customer" + " has purchased the vehicle" + vehicle + " in Cash for the Price "
        + vehicle.getPrice());
    }

}
