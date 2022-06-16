class Cddd
{    
    String name;
    double height;
    double weight;

    void Set_value(String n, double h, double w)
    {
        name = n;
        height = h;
        weight = w;
    }

    double BMI()
    {
        return weight/(height*height/10000);
    }

    void show_details()
    {
        System.out.println("Name : "+name);
        System.out.println("Height : "+height+"cm");
        System.out.println("Weight : "+weight+"kg");
        System.out.println("BMI : "+ BMI());
    }

}


public class hw8_3
{
    public static void main(String args[])
    {
        Cddd student = new Cddd();

        student.Set_value("Sandy", 165.5, 58.2);
        student.show_details();
    }
}