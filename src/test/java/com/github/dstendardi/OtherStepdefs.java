package com.github.dstendardi;

import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(initializers = MyContextInitializer.class)
public class OtherStepdefs {
    @Autowired
    private World foo;

    @Given("^b$")
    public void b() throws Throwable {
        foo.hello();
    }
}
