# Variables

A variable is a name given to a memory location. It is the basic unit of storage in a program.

- The value stored in a variable can be changed during program execution.
- A variable is only a name given to a memory location, all the operations done on the variable effects that memory location.
- In Java, all the variables must be declared before use.

### Types of Variables
1. Local Variables
2. Instance Variables
3. Static Variables

- #### Local Variables
    A variable defined within a block or method or constructor is called a local variable.
    These variables are created when the block is entered or the function is called and destroyed after exiting from the block or when the call returns from the function. 

- #### Instance Variable
    Instance variables are non-static variables and are declared in a class outside any method, constructor or block.
    As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
- #### Static Variable
    These variables are declared similarly as instance variables, the difference is that static variables are declared using the static keyword within a class outside any method constructor or block.