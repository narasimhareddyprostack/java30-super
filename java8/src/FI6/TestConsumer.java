package FI6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        List<String> enames=new ArrayList<String>();
        enames.add("rahul");
        enames.add("sonia");
        enames.add("priyanka");
        Consumer<List> cn = names-> { for (Object name: names) {
                                         System.out.println(name);
                                        }
                                     };
        cn.accept(enames);
    }
}
