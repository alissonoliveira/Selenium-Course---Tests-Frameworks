package br.org.venturus.selenium_course.testNg.xml_file;

import org.testng.annotations.Test;

/***
 * Created by Venturus Curso de Selenium on 28/10/2015.
 */
public class TestNgExampleByGroup {

    @Test(testName = "instructorsTestsCase", groups = {"all", "instructors"})
    public void toBeExecutedForInstructors() {
        System.out.println("This test can be executed for group 'all' ou 'instructors'");
    }

    @Test (testName = "developersTestsCase", groups = {"all", "developers"})
    public void toBeExecutedForDevelopers() {
        System.out.println("This test can be executed for group 'all' ou 'developers'");
    }

    @Test (testName = "testersTestsCase", groups = {"all", "testers"})
    public void toBeExecutedForTesters() {
        System.out.println("This test can be executed for group 'all' ou 'testers'");
    }
}
