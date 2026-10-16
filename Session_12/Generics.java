class Box{
    private Object item;
    void set(Object item){
        this.item = item;

    }

    Object  get(){
        return item;
    }
}

class Boxs<T> {
    private T item;

    void set(T item) {
        this.item = item;
    }

    T get() {
        return item;
    }
}

class Generics{
    public static void main(String[] args){
        //// Without generics//////
        Box box = new Box();
        box.set("Tanisha");
        String s = (String) box.get();
        System.out.println(s);
        box.set(02);
        int t = (int)box.get();
        System.out.println(t);

        ////with Generics//////
        Boxs<String> b1 = new Boxs<>();  //<> we specifies string on left so telling that to java
        b1.set("Hello");
        String s1 = b1.get();
        System.out.println(s1);
  
        ///With Generics - Integer
        Boxs<Integer> b = new Boxs<>();
        b.set(10);  //-> Integer to int
        int num  = b.get();
        System.out.println(num);

    }
}



