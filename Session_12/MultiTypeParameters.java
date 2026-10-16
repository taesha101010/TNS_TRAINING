import  java.util.*; // java.lang.reflect.
// class Pair <K,V>{
//     private K key;
//     private V value;

//     Pair(K key, V value){
//         this.key = key;
//         this.value = value;
//     }

//     K getKey(){
//         return key;}

//     V getValue(){
//         return value;
//     }

// }

class Pairs{
    private Object key;
    private Object value;

    Pairs(Object key, Object value){
        this.key = key;
        this.value = value;
    }

    Object getKey(){
        return key;}

    Object getValue(){
        return value;
    }

}

public class MultiTypeParameters {
    public static void main(String[] args) {
         ////////With Generics///////////////
        // Pair<String, Integer> p = new Pair<>("Age: ", 21);
        // String k = p.getKey();
        // Integer v = p.getValue();


        /////////////Witout Generics////////////
        Pairs p = new Pairs("Age ", 21);
        String K = (String) p.getKey();
        Integer V = (Integer) p.getValue();

        System.out.println(K + ": " + V);
    }
}
