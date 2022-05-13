# Answers

# How is the flexibility, of your implementation, e.g., how you add or remove in future new drink types?
    I have created enum class which contains the information about all types of beverages.
    It is flexible enough to add/remove beverages from the class easily. 
    If in the future new beverage type is added required to add its create drink login in switch case. 
    If a drink is removed required to remove logic from create drink switch case.

# How is the simplicity and understandability of your implementation?
    BeverageTypes is an enum class holds the information about types of the beverages.
    Beverage class contains the information about beverages as well as count the total number of condiments and total
    count of milk and sugar.
    The vending machine class inherits the Beverage class which override the addMilk and addSugar methods.
    With the help of the UML diagram it is possible to understand how the code works.

# How you avoided duplicated code?
    While implementing this assignment first I created two classes Tea and Coffee which extends the bevearge class.
    Then further I created sub classes for types of beverages which extends the tea/coffee class.
    To avoid this I have created a single class called VendingMachine and made an enum class which holds all the name of
    the beverages and used that inside the VendingMachine class.
    I did not implement any pattern in my assignment1 but might be with the help of strategy pattern can be possible to 
    avoid the duplicated of code.

# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```




