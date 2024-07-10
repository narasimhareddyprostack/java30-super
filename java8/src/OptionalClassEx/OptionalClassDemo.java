package OptionalClassEx;

import com.sun.security.jgss.GSSUtil;

import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {
        //String s1="Rahul";
        String s1=null;
        Optional opt=Optional.ofNullable(s1);
        if(opt.isPresent()){
            System.out.println(opt.get().toString().toUpperCase());
        }
        else{
            System.out.println("employee - String value Null");
        }
    }
}
