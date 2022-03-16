package CucumberSteps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.Statement;

public class CucumberTraining {

    int currentAccount;
    int savingAccount;


    @Given("I have {int} on currentAccount")
    public void setCurrentAccount(int value){
        currentAccount = value;


    }
    @And("I have {int} on savingAccount")
    public void setSavingAccount(int value){
        savingAccount = value;

    }
    @When("I transfer {int} from currentAccount to savingAccount")
    public void transferMoney(int value){
        currentAccount = currentAccount - value;
        savingAccount = savingAccount + value;

    }

    @Then("Tranfer was executed")
    public void showTranfer(){
        System.out.println("currentAccount=" + currentAccount);
        System.out.println("savingAccount=" + savingAccount);

    }
    @And("Statement appear {string}")
    public void statement(String hodor){
        System.out.println(hodor);
    }
}
