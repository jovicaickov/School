package main;

import student.Student;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Cao");
        Student jovica = new Student ();
        jovica.setFirstName("Joca");
        jovica.setYearOfBirth(1994);
        jovica.showData();
        
        
        Student melani = new Student ("Melanie","Ickova", 1994);
        melani.showData();
    }
    
}
