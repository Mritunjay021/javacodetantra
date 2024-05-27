class addition {
    public <T extends Number> Number sum(T x, T y) {
        if (x instanceof Double)
            return x.doubleValue() + y.doubleValue();
        else if (x instanceof Short)
            return x.shortValue() + y.shortValue();
        return x.intValue() + y.intValue();
    }

    public static void main(String[] args) {
        addition obj = new addition();
        System.out.println(obj.<Integer>sum(100, 20));
        System.out.println(obj.<Double>sum(100.99, 120.99));
        System.out.println(obj.<Short>sum((short) 10, (short) 100));
    }
}