# Control Flow Statements

Java provides three types of control flow statements.

- ## Decision Making Statements
    - if statement
    - switch statement
- ## Loop Statements
    - do while loop
    - while loop
    - for loop
    - for-each loop
- ## Jump Statements
    - break statement
    - continue statement


> ## If Statements
Java if statement is used to test the condition.
There are various types in if statements.
- if statement
- if-else statement
- if-else-if statement
- nested if statement 

- **if Statement**

***Syntax***

<code>
if(condition)

{

     //code to be executed.

}
</code>

- **if-else Statement**

***Syntax***

<code>
if(condition)

{

    // Executes if condition is true.

}

else

{

    // Executes if condition is false.

}

</code>

- **if-else-if Statement**

***Syntax***

<code>
if(condition-1)

{

    // Executes if condition-1 is true.

}

else if(condition-2)

{

    // Executes if condition-2 is true.

}


...



else

{

    // Executes if all conditions are false.

}
</code>

- **Nested if Statement**

***Syntax***

<code>
if(condition)

{

    // Executes the below code if the condition is true.
    
    if(condition)
    
    {
    
        // Executes the code if the condition was true.
    
    }

}