// // public class oopscon {
// //     String model;
// //     String color;
// //     int year;

// //     // Method to display details
// //     void displayDetail() {
// //         System.out.println("Model: " + model);
// //         System.out.println("Color: " + color);
// //         System.out.println("Year: " + year);
// //     }

// //     // Inner class (Main) extending OopsCon
// //     public class Main extends oopscon {
// //         int speed = 350;

// //         // Method to display full details including speed
// //         void displayFullDetails() {
// //             displayDetail();  // Calling the parent class method
// //             System.out.println("Max Speed: " + speed + " km/h");
// //         }
// //     }

// //     // Main method to run the program
// //     public static void main(String[] args) {
// //         oopscon oo = new oopscon();
// //         // Creating an object of the inner class Main
// //         Main m = oo.new Main();

// //         // Setting values for OopsCon properties
// //         m.model = "Tesla";
// //         m.color = "White";
// //         m.year = 2023;

// //         // Calling the method of the Main subclass to display full details
// //         m.displayFullDetails();  // This calls the method in the Main class which also calls the parent class method
// //     }

// // Hypothetical code (not valid in Java)
// class A {
//     void print() {
//         System.out.println("Printing from A");
//     }
// }

// class B extends A {
//     void print() {
//         System.out.println("Printing from B");
//     }
// }

// class C extends A {
//     void print() {
//         System.out.println("Printing from C");
//     }
// }

// // // Now, if Java allowed this:
// // class D extends B, C {
// //     // Which version of print() to inherit? B's or C's?
// // }

// public class Main {
//     public static void main(String[] args) {
//         D obj = new D();
//         obj.print();  // Ambiguous! Which method to call?
//     }
// }



