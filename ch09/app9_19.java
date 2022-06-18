import javax.swing.text.BoxView;

class CBox
    {
        private int length;     // CBox 類別物件的長
        private int width;      // CBox 類別物件的寬
        private int height;     // CBox 類別物件的高
        private CColor cr;      // CBox 類別物件的物件變數cr，用以表示顏色


        public CBox(int l, int w, int h, String col)
        {
            length = l;
            width = w;
            height = h;
            cr = new CColor(col);
        }

        class CColor
        {
            private String color;

            public CColor(String clr)
            {
                color = clr;
            }
            public void show_color()
            {
                System.out.println("color = "+color);
            }
        }

        public void show()
        {
            System.out.println("length = "+length);
            System.out.println("width = "+width);
            System.out.println("height = "+height);
            cr.show_color();
            // System.out.println("color = "+color.clr);
        }
    }



public class app9_19 //外部類別
{
    public static void main(String args[])
    {
        CBox box = new CBox(2, 3, 4, "Blue");
        box.show();
    }

}
