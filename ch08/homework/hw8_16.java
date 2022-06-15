class CSphere    // 定義 CRectangle 類別
{   
    private double pi = 3.14;
    private int x;      // 園心的x座標
    private int y;      // 園心的y座標
    private int z;      // 園心的z座標
    private int radius; // 園球的半徑

    void setLocation(int l_x , int l_y , int l_z)
    {
        x = l_x;
        y = l_y;
        z = l_z;
    }

    void setRadius(int r)
    {
        radius = r;
    }

    double surfaceArea()
    {
        return 4*pi*radius*radius;
    }

    double volume()
    {
        return (4/3)*pi*radius*radius*radius;
    }

    void show_center()
    {
        System.out.println("Center of the Sphere is ("+x+", "+y+", "+z+")");
    }
}

public class hw8_16
{
    public static void main(String args[])
    {
        CSphere sphere1 = new CSphere(); // 建立sphere1物件

        sphere1.setLocation(3, 4, 5);          
        sphere1.setRadius(5);
        
        sphere1.show_center();
        System.out.println("Surface area of the Sphere is "+sphere1.surfaceArea());
        System.out.println("Volume of the Sphere is "+sphere1.volume());

    }
}