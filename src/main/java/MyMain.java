import java.util.ArrayList;
import java.util.Arrays;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int count = 0;
        for (int i : list)
            count += (i % 2 == 0) ? 0 : 1;
        return count;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        for (int i : list1) {
            for (int j :list2) {
                if (i == j) return true;
            }
        }
        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.stream(arr).forEach(list::add);
        return list;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        int[] arr1 = new int[5];
        list1.add(1);
        list1.add(5);
        list1.add(9);
        list1.add(423);
        list1.add(465232);
        list1.add(7);
        list1.add(94);
        list1.add(100);
        list2.add(1);
        list2.add(6);
        list3.add(900);
        list3.add(40);
        arr1[0] = 5;
        arr1[1] = 9;
        arr1[2] = 83;
        arr1[3] = 600;
        arr1[4] = 1000;
        System.out.println(countOdd(list1));
        System.out.println(checkDuplicates(list1, list2));
        System.out.println(checkDuplicates(list1, list3));
        System.out.println(convertToArrayList(arr1));
    }
}
