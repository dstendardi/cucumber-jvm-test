package com.github.dstendardi;


import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(initializers = MyContextInitializer.class)
public class MainStepdefs {

    @Autowired
    private World foo;

    @Given("^a$")
    public void a() throws Throwable {
        foo.hello();
    }
}
