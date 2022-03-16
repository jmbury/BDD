package CucumberSteps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Before_After {
//
//    @BeforeStep
//    public void printBeforeStep(){
//        System.out.println("Print it before each step");
//    }
//
//    @AfterStep
//    public void printItAfterStep(){
//        System.out.println("afterStep");
//    }
//
    @BeforeAll
    public static void printBeforeAll(){
        System.out.println("before all \n");
    }
//    @AfterAll
//    public static void printAtferAll(){
//        System.out.println("after all");
}
