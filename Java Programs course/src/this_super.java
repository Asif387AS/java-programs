class firstclass
{
    int x;
    firstclass(int a)
    {
        this.x=a;

    }

    public int getX() {
        return x;
    }
}

public class this_super {
    public static void main(String[] args) {
     firstclass f=new firstclass(3);
        System.out.println(f.getX());

    }
}
