import java.util.function.*;

public class Main {
    public static void main(String[] args) {
       //1
        StringConcate sc=(a,b)->Integer.toString(a)+b;

        BinaryOperator <String> sum=(a,b)->a+b;
        System.out.println(sum.apply("Hello ","everybody!"));

        //2
        Checkable ch= a->a.length()==3;
        System.out.println(ch.check("asdgh"));

        Predicate <String> checkLength= s -> s.length()==3;
        System.out.println(checkLength.test("asd"));

       //3
        Printable pr= a-> System.out.println("!"+a+"!");
        pr.print("hello");

        Consumer<String> pr1= a-> System.out.println("!"+a+"!");
        pr1.accept("Hello");

        //4
        Producable pro=()->"Hello word!";
        System.out.println(pro.produce());

        Supplier<String> supplier=()->"Hello word!";
        System.out.println(supplier.get());

        //5
        Transformable tr=s->s.length()==4? s="****":s;
        System.out.println(tr.modify("asdf"));
        System.out.println(tr.modify("asd"));


        UnaryOperator <String> st= s ->s.length()==4? s="****":s;
        System.out.println(st.apply("asdf"));
        System.out.println(st.apply("asd"));


    }
}