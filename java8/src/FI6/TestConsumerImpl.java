package FI6;

import java.util.ArrayList;
import java.util.List;

public class TestConsumerImpl {
    public static void main(String[] args) {
        List<String> enames=new ArrayList<String>();
        enames.add("rahul");
        enames.add("sonia");
        enames.add("priyanka");
        ConsumerOne cn=names-> { for (Object name: names) {
                                        System.out.println(name);
                                    }
                                };
        cn.accept(enames);
    }
}
