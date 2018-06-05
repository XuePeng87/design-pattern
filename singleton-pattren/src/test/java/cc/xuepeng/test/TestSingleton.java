package cc.xuepeng.test;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingleton {

    private static final String RESULT = "something";

    @Test
    public void testExample01() {
        cc.xuepeng.example01.Singleton singleton = cc.xuepeng.example01.Singleton.getInstance();
        Assert.assertEquals(RESULT, singleton.createSomething());
        Assert.assertNotNull(singleton);
    }

    @Test
    public void testExample02() {
        cc.xuepeng.example02.Singleton singleton = cc.xuepeng.example02.Singleton.getInstance();
        Assert.assertEquals(RESULT, singleton.createSomething());
        Assert.assertNotNull(singleton);
    }

    @Test
    public void testExample03() {
        cc.xuepeng.example03.Singleton singleton = cc.xuepeng.example03.Singleton.getInstance();
        Assert.assertEquals(RESULT, singleton.createSomething());
        Assert.assertNotNull(singleton);
    }

    @Test
    public void testExample04() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException {
        cc.xuepeng.example04.Singleton singleton = cc.xuepeng.example04.Singleton.getInstance();
        Assert.assertEquals(RESULT, singleton.createSomething());
        Assert.assertNotNull(singleton);


        Class<?> c = Class.forName("cc.xuepeng.example04.Singleton");
        Constructor[] cts = c.getDeclaredConstructors();
        cts[1].setAccessible(true);
        cc.xuepeng.example04.Singleton result = (cc.xuepeng.example04.Singleton) cts[1].newInstance();
        System.out.println(result.createSomething());
    }

    @Test
    public void testExample05() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException {
        cc.xuepeng.example05.Singleton singleton = cc.xuepeng.example05.Singleton.INSTANCE;
        Assert.assertEquals(RESULT, singleton.createSomething());
        Assert.assertNotNull(singleton);
        Class<?> c = Class.forName("cc.xuepeng.example05.Singleton");
        c.newInstance();
    }

    @Test
    public void testExample06() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException {
        cc.xuepeng.example06.Singleton singleton = cc.xuepeng.example06.Singleton.getInstance();
        Assert.assertEquals(RESULT, singleton.createSomething());
        Assert.assertNotNull(singleton);

        Class<?> c = Class.forName("cc.xuepeng.example06.Singleton");
        Constructor[] cts = c.getDeclaredConstructors();
        cts[1].setAccessible(true);
        cc.xuepeng.example06.Singleton result = (cc.xuepeng.example06.Singleton) cts[1].newInstance();
        System.out.println(result.createSomething());
    }

}
