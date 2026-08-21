public class teacher
{
    // states
    String name;
    int age;
    float monthlySalary;
    String subjectTeach;
    int YOE;
    float bonus_percentage;

    //behaviours
    //method1
    boolean is_senior_teacher(int YOE)
    {
        if (YOE>5){
            return true;
        }
        else{
            return false;
        }
    }

    //method2
    float annualSalary(float monthlySalary){
        return 12 * monthlySalary;
    }

    //method3
    float salaryPackage(float annualSalary, float bonus_percentage){
        return (bonus_percentage * annualSalary) + annualSalary;
    }

    //method4
    void displayAge(int age){
        System.out.println("Age: " + age);
    }
}