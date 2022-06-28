class CRantangle
{
    private int length;
    private int width;

    private void show()
    {
        System.out.print("length="+length);
        System.out.print(", width="+width);
    }
}

class CData extends CRantangle
{

}


/*
 *  CRantangle "has-a" length,
 *  CRantangle "has-a" width,
 *  CRantangle "has-a" show,
 *  CData "is-a" CRantangle.
 */