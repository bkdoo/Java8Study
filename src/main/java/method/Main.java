package method;

import method.defaultMethod.Basic;
import method.defaultMethod.BasicImpl;
import method.defaultMethod.OtherImpl;
import method.java8defaultMethod.Java8DefaultMethodTest;

public class Main {
    public static void main(String[] args) {
        BasicImpl basic = new BasicImpl();
        basic.printName();
        basic.printDefault();
        OtherImpl other = new OtherImpl();
        other.printDefault();

        Basic.printStatic();

        Java8DefaultMethodTest java8DefaultMethodTest = new Java8DefaultMethodTest();
        java8DefaultMethodTest.forEachTest();
        java8DefaultMethodTest.spliteratorTest();
        java8DefaultMethodTest.removeIfTest();
    }
}
