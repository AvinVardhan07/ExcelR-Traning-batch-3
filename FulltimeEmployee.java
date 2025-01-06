
class Employee {
    String name;
    String empId;

    
    public Employee() {
        this.name = "";
        this.empId = "";
    }

    
    public Employee(String name, String empId) {
        this.name = name;
        this.empId = empId;
    }
}


public class FulltimeEmployee extends Employee {
    double basic;
    double bonus;

  
    public FulltimeEmployee() {
        super(); 
        this.basic = 0.0;
        this.bonus = 0.0;
    }

   
    public FulltimeEmployee(String name, String empId, double basic, double bonus) {
        super(name, empId);
        this.basic = basic;
        this.bonus = bonus;
    }

  
    public double computeSal() {
        return basic + bonus;
    }

  
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Salary: " + basic);
        System.out.println("Bonus: " + bonus);
        System.out.println("Gross Salary: " + computeSal());
    }

    public static void main(String[] args) {
      
        FulltimeEmployee emp1 = new FulltimeEmployee();
        emp1.showDetails();

        
        FulltimeEmployee emp2 = new FulltimeEmployee("Avin", "vardhan", 50000, 5000);
        emp2.showDetails();
    }
}
