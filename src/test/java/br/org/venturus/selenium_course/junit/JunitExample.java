package br.org.venturus.selenium_course.junit;

import org.junit.*;

/***
 * Created by Venturus Curso de Selenium on 28/10/2015.
 */
public class JunitExample {

    /***
     * This method will be executed before all test case, just one time
     */
    @BeforeClass
    public static void beforeClass() {
        System.out.println("The Method 'before Class' was executed");
    }

    /***
     * This method will be executed after all test case, just one time
     */
    @AfterClass
    public static void afterClass() {
        System.out.println("The Method 'after class' was executed");
    }

    /***
     * This method will be executed before of every test case
     */
    @Before
    public void beforeMethod() {
        System.out.println("The Method 'before method' was executed");
    }

    /***
     * This method will be executed after every test case. It are util to close any resource used into tests
     */
    @After
    public void afterMethod() {
        System.out.println("The Method 'after method' was executed");
    }

    @Test
    public void testCase01() {
        System.out.println("Test case recognized by 01 was executed");
    }

    @Test
    public void testCase02() {
        System.out.println("Test case recognized by 02 was executed");
    }

    @Test
    public void testCase03() {
        System.out.println("Test case recognized by 03 was executed");
    }
}