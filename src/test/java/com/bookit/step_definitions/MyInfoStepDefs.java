package com.bookit.step_definitions;

import com.bookit.pages.SelfPage;
import com.bookit.pages.SignInPage;
import com.bookit.utilities.Driver;
import com.bookit.utilities.Environment;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import com.bookit.pages.SelfPage;
import com.bookit.pages.SignInPage;
import com.bookit.utilities.Driver;
import com.bookit.utilities.Environment;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;


    public class MyInfoStepDefs {

        @Given("user logs in using {string} credentials")
        public void userLogsInUsingCredentials(String role) {

            Driver.get().get(Environment.URL);
            Driver.get().manage().window().maximize();
            SignInPage signInPage = new SignInPage();
            signInPage.login(role);

        }

        @When("user is on the my self page")
        public void user_is_on_the_my_self_page() {
            SelfPage selfPage = new SelfPage();
            selfPage.goToSelf();

        }

    }
