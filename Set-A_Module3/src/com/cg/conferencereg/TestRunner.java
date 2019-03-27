package com.cg.conferencereg;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
features= {"features"},
glue= {"com.cg.conferencereg"})
//tags= {"@execute"})
public class TestRunner {

}