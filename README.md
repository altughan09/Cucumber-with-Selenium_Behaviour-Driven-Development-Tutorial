# Cucumber-with-Selenium_Behaviour-Driven-Development-Tutorial
**Behavior-driven development is a software development process that is derived from Test-Driven Development (TDD) concept.**


BDD simply focuses on:
*	**Where** to start in the process
*	**What** to test and what not to test
*	**How much** to test in one go
*	**What** to call the tests
*	**How** to understand why a test fails

In this tutorial I have implemented in my project a BDD tool known as **Cucumber**. To make the testing phase easier I also took advantage of **Selenium Framework** for automating my Chrome browser. Below is the jar files list added to my project. 

**Selenium jar files:** (Downloaded from Selenium Official Website)
* Selenium-server-standalone

**Cucumber jar files** (Downloaded from Maven Repository)
* Cucumber-core
* Cucumber-html
* cobertura code coverage
* Cucumber-java
* Cucumber-junit
* Cucumber-jvm-deps
* Cucumber-reporting
* Hemcrest-core
* Gherkin
* Junit

Tested **scenario** was the Reset functionality of the login form inside demo website available at http://demo.guru99.com/V4/

In the output I wanted to see the following:

* Launch browser.
* Demo site is loaded.
* Username and password I provided in the Step definiton are placed on the login page.
* All values are resetted.
