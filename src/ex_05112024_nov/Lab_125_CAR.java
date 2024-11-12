package ex_05112024_nov;

public class Lab_125_CAR {
    // Define the class
        // Fields (or attributes)
        String brand;
        String color;
        int year;

    public Lab_125_CAR(String brand) {
        this.brand = brand;
    }

    // Constructor to initialize the attributes
        public void Car(String brand, String color, int year) {
            this.brand = brand;
            this.color = color;
            this.year  = year;
        }

        // Method to display the car's details
        public void displayDetails() {
            System.out.println("Brand: " + brand);
            System.out.println("Color: " + color);
            System.out.println("Year: " + year);
        }
    }


