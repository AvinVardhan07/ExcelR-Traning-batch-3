class Employee {
    String id, firstName, lastName, address;


    public Employee() {
        id = "";
        firstName = "";
        lastName = "";
        address = "";
    }

   
    public Employee(String id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

  
    public String getFullName() {
        return firstName + " " + lastName;
    }
}

class PartTimeEmployee extends Employee {
    double hoursWorked, amountPerHour;

    
    public PartTimeEmployee() {
        super();
        hoursWorked = 0;
        amountPerHour = 0;
    }

  
    public PartTimeEmployee(String id, String firstName, String lastName, String address, double hoursWorked, double amountPerHour) {
        super(id, firstName, lastName, address);
        this.hoursWorked = hoursWorked;
        this.amountPerHour = amountPerHour;
    }

   
    public double computeSal() {
        return hoursWorked * amountPerHour;
    }

    
    public void showDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + getFullName());
        System.out.println("Address: " + address);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Amount per Hour: " + amountPerHour);
        System.out.println("Salary: " + computeSal());
    }

    public static void main(String[] args) {
       
        PartTimeEmployee emp1 = new PartTimeEmployee();
        emp1.showDetails();

        PartTimeEmployee emp2 = new PartTimeEmployee("2311cs010021", "Avin", "vardhan", "hyderabad", 25, 20);
        emp2.showDetails();
    }
}
