import java.util.Locale;

public class pracitsestring {
    public static void main(String[] args) {
        String name= "Asif Ali";
        System.out.println(name.toLowerCase(Locale.ROOT));
        String rep= " asi f ali";
        System.out.println(rep.replace(" ","_"));

        String as= "Dear <|name|>,Thanks a lot";
        as=as.replace("<|name|>","asif");
        System.out.println(as);

        String ms= "hi i   am asif ali";
        System.out.println(ms.indexOf("  "));
        System.out.println(ms.indexOf("   "));

        System.out.println("hi asif\n\t this is java course and\n\t you can learn this");


    }
}
