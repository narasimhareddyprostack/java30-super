import java.util.HashMap;
import java.util.*;
class HMProductCRUD {
    public static void main(String[] args) {
      HashMap<String,String>  product=new HashMap<String,String>();
      product.put("pId", "101");
      product.put("name", "Iphone 5s");
      product.put("price", "7500");
      product.put("color", "red");
      product.put("avail", "true");
      System.out.println(product);
      System.out.println("Display key and values using entrySet()");

      Set<Map.Entry<String,String>> entries=product.entrySet();

      for (Map.Entry<String,String> entry : entries) {
        System.out.println(entry.getKey()+":"+entry.getValue());
      }
    
    }
}
