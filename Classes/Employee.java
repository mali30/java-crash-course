package company.mohamedali.Classes;

public class Employee {
    private int baseSalary;
    private int hourlyWage;

    // static field
    // use static fields when a value is independent of an object
    public static int numberOfEmployees;

    public Employee(int baseSalary, int hourlyWage){
        setHourlyWage(hourlyWage);
        setBaseSalary(baseSalary);

        numberOfEmployees++;
    }

    public static void printNumberofEmployees(){
        System.out.println(numberOfEmployees);
    }

    // CONSTRUCTOR OVERLOADING
    public Employee(int baseSalary){
        this(baseSalary, 0);
    }

    // no paramters needed. encapsulate them
    public int calculateWage(int extraHours){
        return baseSalary + (hourlyWage * extraHours);
    }

    // METHOD OVERLOADING - no paramaters. can also just pass in 0
    public int calculateWage(){
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0){
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        }

        this.baseSalary = baseSalary;
    }

    // making these private since we don't need them - abstraction
    private int getBaseSalary(){
        return baseSalary;
    }

    // making these private since we don't need them - abstraction
    private int getHourlyWage(){
        return hourlyWage;
    }

    private void setHourlyWage(int hourlyWage){
        if(hourlyWage <= 0){
            throw new IllegalArgumentException("Hourly wage cant be less than " + hourlyWage);
        }
        this.hourlyWage = hourlyWage;
    }
}
