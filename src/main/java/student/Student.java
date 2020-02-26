package student;


public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    
    
    public Student () {
        this.firstName = "";
        this.lastName = "";
        this.yearOfBirth = 0;
    }
    
    public Student (String FirstName, String LastName, int YearOfBirth) {
        this.firstName = FirstName;
        this.lastName = LastName;
        this.yearOfBirth = YearOfBirth;
    }
    
    
    public String getFirstName () {
        return this.firstName;
    }
    
    public void setFirstName (String FirstName) {
        this.firstName = FirstName;
    }
    
    public String getLastName () {
        return this.lastName;
    }
    
    public void setLastName (String LastName) {
        this.lastName = LastName;
    }
    
    public int getYearOfBirth () {
        return this.yearOfBirth;
    }
    
    public void setYearOfBirth (int YearOfBirth) {
        this.yearOfBirth = YearOfBirth;
    }
    
    
    public void showData () {
        System.out.println("Ime: " + this.getFirstName());
        System.out.println("Prezime: " + this.getLastName());
        System.out.println("Godina rodjenja: " + this.getYearOfBirth());
        System.out.println();
    }
    
}


