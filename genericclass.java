class genricclass<T> {
    T t, m;

    public void add(T t, T m) {
        this.t = t;
        this.m = m;
    }

    public T get() {

        return t;

    }

    public static void main(String args[]) {
        genricclass<Integer> obj1 = new genricclass<Integer>();
        genricclass<Double> obj2 = new genricclass<Double>();
        genricclass<String> obj3 = new genricclass<String>();
        obj1.add(10, 5);
        obj2.add(2.5, 0.5);
        obj3.add("java", "jbng");
        System.out.println(obj1.get());
        System.out.println(obj2.get());
        System.out.println(obj3.get());
    }
}