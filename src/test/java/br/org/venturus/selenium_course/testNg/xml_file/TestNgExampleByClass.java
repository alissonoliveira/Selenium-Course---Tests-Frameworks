package br.org.venturus.selenium_course.testNg.xml_file;

import org.testng.Assert;
import org.testng.annotations.Test;

/***
 * Created by Venturus Curso de Selenium on 28/10/2015.
 */
public class TestNgExampleByClass {

    @Test (testName = "testCaseNamed01")
    public void toBeExecuted() {
        System.out.println("Method configured by .xml file to be executed");
    }

    @Test (testName = "testCaseNamed02")
    public void notBeExecuted() {
        Assert.fail("Test has failed because a prohibited method was executed");
    }
}