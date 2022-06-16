class CBox
{    
    int length;
    int width;
    int height;

    int volume() //回傳box物件的體積
    {
        return length*width*height;
    }

    int surfaceArea() //回傳box物件的表面積
    {
        return 2*(length*width+width*height+height*length);
    }

    void showData()
    {
        System.out.println("length : "+length);
        System.out.println("width : "+width);
        System.out.println("height : "+height);
    }

    void showAll()
    {
        showData();
        System.out.println("volume : "+volume() );
        System.out.println("surfaceArea : "+surfaceArea());
      
    }

}


public class hw8_5
{
    public static void main(String args[])
    {
        CBox box;
        box = new CBox();

        // 請於此處填上程式碼
        box.length = 1;
        box.width = 1;
        box.height = 1;

        box.showAll();
       
    }
}