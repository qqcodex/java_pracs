import java.util.ArrayList;

class faculty extends Person
{
    String facultyName;
    String Designation;
    double Salary;
    department Department;

    faculty (String name, int age,String Designation, double Salary, department Department)
    {
        super(name,age);
        this.Designation = Designation;
        this.Salary = Salary;
        this.Department = Department;
    }
}

public class college {
    String collegeName;
    String location;
    int totalStudents;
    boolean isPublic;
    double annualTuitionFee;
    int ranking;
    department mathDept;
    faculty drAlex;
    department physicsDept;
    faculty drWu;
    faculty jamesBond;
    static ArrayList<faculty> phyfacultyMembers = new ArrayList<>();


    public college(){}

    public college(String collegeName) {
        this.collegeName = collegeName;
    }

    public static void main(String[] args) {
        college SPMS = new college("School of Physical and Mathematical Sciences");

        SPMS.mathDept = new department("Mathematics", "ARC");
        SPMS.drAlex = new faculty("Dr Alex", 50,"Professor", 15000.00, SPMS.mathDept);

        SPMS.physicsDept = new department("Physics", "South Spine");
        SPMS.drWu = new faculty("Dr Wu", 45,"Assoc Professor", 12000.00, SPMS.physicsDept);
        SPMS.jamesBond = new faculty("James Bond", 30,"Teaching Assistant", 2000.00, SPMS.physicsDept);
        phyfacultyMembers.add(SPMS.drWu);
        phyfacultyMembers.add(SPMS.jamesBond);



        System.out.println(SPMS.drAlex.facultyName + " teaches " + SPMS.mathDept.deptName + " at " + SPMS.collegeName);
        System.out.println(SPMS.drWu.facultyName + " teaches " + SPMS.physicsDept.deptName + " at " + SPMS.collegeName);
        System.out.println(SPMS.jamesBond.facultyName + " helps in " + SPMS.physicsDept.deptName + " classes at " + SPMS.collegeName);

        System.out.println("---Staff Directory---");
        int i;
        for (faculty f :
             phyfacultyMembers)
        {
            System.out.println(f.name+" ("+f.Designation+")");
        }
    }
}
