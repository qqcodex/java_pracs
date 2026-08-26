public class student
{
    // states ("characteristics")
     float height;
     double weight;
     String id;
     String name;
     boolean is_tall;

     // behaviours ("methods")
    void takeclassesregularly()
    {

    }

    double addtwoNumbers(double x,double y)
    {
        return x+y;
    }

    public static void main(String[] args) // main method always the same in Java
    {
        student alex = new student(); // instantiation
        alex.name = "Alex Sharma";
        student aqil = new student();
        aqil.name = "Aqil Alias";
        System.out.println(alex.name +" "+ aqil.name); // shows where object is stored in memory, JVM allocates the memory to object
    }
}

