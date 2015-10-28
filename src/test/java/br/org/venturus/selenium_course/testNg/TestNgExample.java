package br.org.venturus.selenium_course.testNg;

import org.testng.annotations.*;

/***
 * Created by Venturus Curso de Selenium on 28/10/2015.
 */
public class TestNgExample {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("The Method 'before Suite' was executed");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("The Method 'after Suite' was executed");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("The Method 'before Test' was executed");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("The Method 'after Test' was executed");
    }

    @BeforeGroups
    public void beforeGroup() {
        System.out.println("The Method 'before Group' was executed");
    }

    @AfterGroups
    public void afterGroup() {
        System.out.println("The Method 'after Group' was executed");
    }

    /***
     * This method will be executed before all test case, just one time
     */
    @BeforeClass
    public void beforeClass() {
        System.out.println("The Method 'before Class' was executed");
    }

    /***
     * This method will be executed after all test case, just one time
     */
    @AfterClass
    public void afterClass() {
        System.out.println("The Method 'after class' was executed");
    }

    /***
     * This method will be executed before of every test case
     */
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("The Method 'before method' was executed");
    }

    /***
     * This method will be executed after every test case. It are util to close any resource used into tests
     */
    @AfterMethod
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

    @Test (testName = "testCaseNamed01", enabled = true)
    public void testCase04() {
        System.out.println("Method configured to be executed");
    }

    @Test (testName = "testCaseNamed02", enabled = false)
    public void testCase05() {
        System.out.println("Method configured to not be executed");
    }
}
