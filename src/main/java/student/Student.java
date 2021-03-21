package student;




public class Student {
    
   
    
    
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Object Course;
    private Object Computer;
    
            
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
    
    public Object getCourse() {
        return this.Course;
    }
       
    public Object getComputer() {
        return this.Computer;
    }
    
    public Student(Object Course, Object Computer) {
        this.Course = Course;
        this.Computer = Computer;
    }
    
    public Student(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }
    
    public void info() {
        System.out.println("First name: " + this.getFirstName());
        System.out.println("Last name: " + this.getLastName());
        System.out.println("Year of birth: " + this.getYearOfBirth());
        System.out.println("Course name: " + this.getName());
        System.out.println("Course number of classes: " + this.getNumberOfClasses());
        System.out.println("Process tact: " + this);
        System.out.println("Memory: " + this.);
    }
    
}
