package test;

/*
 * Generic class to provide a tuple of test data
 * Test data of type T, model data of Type S
 */
public class TestTuple<T, S> {
    public T test;
    public S model;

    public TestTuple(T test, S model) {
        this.test = test;
        this.model = model;
    }
}
