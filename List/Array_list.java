
package List;
import java.util.ArrayList;
import java.util.List;
public class Array_list {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(34);
        list.add(22);
        list.add(33);
        System.out.println(list);
        List <Integer> list1 = List.of(1,33,44);// can change in this means can not add // change//or modifide if Using --> List.of 
        list.addAll(list1);// Use to add the list elements in a list // 
        list.sort(null);
        System.out.println(list);
    }
}
