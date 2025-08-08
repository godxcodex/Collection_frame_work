package List;
import java.util.Arrays;
import java.util.List;
public class Array_list1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,33,44,5,6,77,30,26,34);
        // you can not add any thing but only change the thing by using set methord//
        list.set(2, 67);
        Integer [] arr = {22,3,4,53,78};
        List<Integer> list2 = Arrays.asList(arr);
        list2.set(2, 666); // if you make changes in list by using set it will also change in array//
        System.out.println(list2);
        for(int i :arr){
            System.out.print(i+" ");
        }

    }
}
