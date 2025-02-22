package OOP;
// Hierarchical Inheritance 
class shapes {
    //  final can be used to overriding

    // final void area (){
    //     System.out.println("I sm in shapes");
    // }
    void area (){
        System.out.println("I sm in shapes");
    }
}

class square extends shapes{
    @Override
    void area(){
        System.out.println("I sm in square");
    }
}

class circle extends shapes{
    @Override
    void area(){
        System.out.println("I sm in circle");
    }
}

// area is represented in multiple ways(polymorphism)
public class shape{
    public static void main(String[] args) {
        shapes shapes = new shapes();
        square square = new square();
        circle circle = new circle();
        shapes.area();
        square.area();
        circle.area();
    }
}