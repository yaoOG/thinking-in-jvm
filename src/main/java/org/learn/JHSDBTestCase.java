package org.learn;

import org.omg.CORBA.ObjectHolder;

/**
 * @author choo
 */
public class JHSDBTestCase {
    private static class ObjectHolder {
    }

    static class Test {
        static JHSDBTestCase.ObjectHolder staticObj = new JHSDBTestCase.ObjectHolder();
        JHSDBTestCase.ObjectHolder instanceObj = new JHSDBTestCase.ObjectHolder();

        void foo() {
            JHSDBTestCase.ObjectHolder localObj = new JHSDBTestCase.ObjectHolder();
            System.out.println("done"); // 这里设一个断点
        }
    }


    public static void main(String[] args) {
        Test test = new JHSDBTestCase.Test();
        test.foo();
    }
}

