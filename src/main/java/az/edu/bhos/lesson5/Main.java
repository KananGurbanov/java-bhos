package az.edu.bhos.lesson5;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Pet toplan = new Pet("Toplan", PetType.DOG);
        Woman woman = new Woman("Mehriban", 25, toplan); //123
        Woman woman2 = new Woman("sadgfggsd", 25, toplan); //123


        HashMap hashMap = new HashMap();
        hashMap.put("Topla", toplan);

        //1. get hashcode
        //2. get index from that hashcode
        //3. put object
        // if 2 objects are returned with true using equals, then their hashcodes are same
        // if their hashcodes are same, that does not necessarily mean that they are same

        if (woman.equals(woman2)) {
            System.out.println(woman2.hashCode() == woman.hashCode());
        }


    }
}
