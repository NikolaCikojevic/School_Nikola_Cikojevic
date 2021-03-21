package student;

public class Student {
    
    private String firstName;
    private String lastName;
    private int yearOfBirth;
            
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public void setlastName(String newLastName) {
        this.lastName = newLastName;
    }
    
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }
    
    public void setYearOfBirth(int newYearOfBirth) {
        this.yearOfBirth = newYearOfBirth;
    }
    
    public Student() {
        
    }
    
    public Student(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }
    
    public void info() {
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Year of birth: " + this.yearOfBirth);

        
    }
}
