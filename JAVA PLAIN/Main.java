
class User {
    private String username;
    private String password;

  
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

class Admin extends User {

  
    public Admin(String username, String password) {
        super(username, password);
    }
    public void manageUsers() {
        System.out.println("Admin can manage users");
    }
}

public class Main {
    public static void main(String[] args) {
    
        User user = new User("user1", "pass123");
        
  
        Admin admin = new Admin("admin1", "adminpass");

        if (user.login("user1", "pass123")) {
            System.out.println("User login successful");
        } else {
            System.out.println("User login failed");
        }

        if (admin.login("admin1", "adminpass")) {
            System.out.println("Admin login successful");
            admin.manageUsers();
        } else {
            System.out.println("Admin login failed");
        }
    }
}





// // Defining the Vehicle class
// class Vehicle {
//     public void move() {
//         System.out.println("The vehicle is moving");
//     }
// }

// // Extending the Vehicle class with the Car class
// class Car extends Vehicle {
//     public void speed() {
//         System.out.println("The car is speeding");
//     }
// }

// // Main class to test the functionality
// public class Main {
//     public static void main(String[] args) {
//         Car myCar = new Car();
//         myCar.move();  // Output: The vehicle is moving
//         myCar.speed(); // Output: The car is speeding
//     }
// }



// // Base class
// class Animal {
//     private String name;

//     public Animal(String name) {
//         this.name = name;
//     }

//     public void eat() {
//         System.out.println(name + " is eating.");
//     }

//     public void sleep() {
//         System.out.println(name + " is sleeping.");
//     }

//     public String getName() {
//         return name;
//     }
// }

// // Derived class
// class Dog extends Animal {
//     public Dog(String name) {
//         super(name);
//     }

//     public void bark() {
//         System.out.println(getName() + " is barking.");
//     }
// }

// // Derived class
// class Cat extends Animal {
//     public Cat(String name) {
//         super(name);
//     }

//     public void meow() {
//         System.out.println(getName() + " is meowing.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog dog = new Dog("Buddy");
//         Cat cat = new Cat("Whiskers");

//         dog.eat();
//         dog.sleep();
//         dog.bark();

//         cat.eat();
//         cat.sleep();
//         cat.meow();
//     }
// }
