import java.util.HashMap;
public class ehashmapif {
   
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 4, 3, 2, 4};
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
             
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
             
                hm.put(arr[i], 1);
            }
        }
        for (int key : hm.keySet()) {
            System.out.println(key + " -> " + hm.get(key));
        }
    }
}

    
}
