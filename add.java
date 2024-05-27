class add {
    public <T extends number> Number sum(T x, T y) {
        return x.intValue() + y.intValue();
    }

    public static void main(String args[]) {
        add obj = new add();
        System.out.println(obj.<Integer>sum(100, 20));
        System.out.println(obj.<Double>sum(100.025, 20.23));
        System.out.println(obj.<Short>sum((short) (10), (short) (100)));
    }
}