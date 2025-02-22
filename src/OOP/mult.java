package OOP;

class box {
    double l, w, h, volume; // Added volume as an instance variable

    // Constructor for a cube
    box(double side) {
        this.l = this.w = this.h = side;
        this.volume = Math.pow(side, 3); // Store volume as an instance variable
    }

    // Default constructor
    box() {
        this.l = this.w = this.h = -1;
        this.volume = 0; // Set volume to 0
    }

    // Constructor for a box with different dimensions
    box(double l, double b, double h) {
        this.l = l;
        this.w = b;
        this.h = h;
        this.volume = l * b * h; // Store volume as an instance variable
    }
}

// Subclass of box
class boxmass extends box {             //single inheritance
    double density;
    double mass;

    // Default constructor
    boxmass() {
        super();
        this.density = 1000;
        this.mass = 0;
    }

    // Constructor for a rectangular box
    boxmass(double l, double b, double h, double density) {
        super(l, b, h);
        this.density = density;
        this.mass = this.volume * density; // Now volume is accessible
    }

    // Constructor for a cube
    boxmass(double side, double density) {
        super(side);
        this.density = density;
        this.mass = this.volume * density; // Now volume is accessible
    }
}

// Subclass of boxmass
class boxweight extends boxmass {          // multi-level inheritance
    double gravity;
    double weight;

    // Default constructor
    boxweight() {
        super();
        this.gravity = 9.8; // Set default gravity
        this.weight = this.mass * this.gravity;
        System.out.println("The weight of the box is " + this.weight);
    }

    // Constructor for a rectangular box
    boxweight(double l, double b, double h, double density, double gravity) {
        super(l, b, h, density);
        this.gravity = gravity;
        this.weight = this.mass * this.gravity;
        System.out.println("The weight of the box is " + this.weight);
    }

    // Constructor for a cube
    boxweight(double side, double density, double gravity) {
        super(side, density);
        this.gravity = gravity;
        this.weight = this.mass * this.gravity;
        System.out.println("The weight of the cube is " + this.weight);
    }
}

// Main Class
public class mult {
    public static void main(String[] args) {
        boxweight cube = new boxweight(3,4,9.8); // Correct constructor call
    }
}

