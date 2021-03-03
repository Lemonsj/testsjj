import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-01
 * Time: 20:15
 **/
public class Java20Test {

    @BeforeClass
    public void beforeclass() {
        System.out.println("**************beforeclass");
    }
    @Before
    public void before() {
        System.out.println("**************Before");
    }
    @After
    public void after() {
        System.out.println("**************after");
    }
    @Test
    public void add() {
        Java20 a = new Java20();
        int ret = a.add(10,20);
        System.out.println(ret);
    }
}