package lambda.referenceMethod;

public class SampleClass {
    private String sample;

    public SampleClass() {
    }

    public SampleClass(String sample) {
        this.sample = sample;
    }

    public String hello(String sample) {
        return sample + "hello!";
    }

    public static String hi(String sample) {
        return sample + "hi";
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }
}
