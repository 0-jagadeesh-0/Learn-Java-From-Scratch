# Control Flow Statements

Java provides three types of control flow statements.

- ## Decision Making Statements
    - [if statement](https://github.com/0-jagadeesh-0/Learn-Java-From-Scratch/tree/main/Control%20Flow%20Statements#if-statements)
    - [switch statement](https://github.com/0-jagadeesh-0/Learn-Java-From-Scratch/tree/main/Control%20Flow%20Statements#switch-statement)
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


### **if Statement**

***Syntax***

<code>
if(condition)

{

     //code to be executed.

}
</code>

### **if-else Statement**

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

### **if-else-if Statement**

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

### **Nested if Statement**

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
</code>

> ## switch statement

The Java switch statement executes one statement from multiple conditions. It is like if-else-if ladder statement.

***Syntax***

<code>
switch(expression)
{

case value1:

    //code to be executed

    break;

case value2:

    //code to be executed

    break;

case value3:

    //code to be executed

    break;

default:

    //code to be executed if all statements are not matched.
    
}
</code>

> ## For Loop

The Java for loop is used to iterate a part of the program several times. If the number of iteration is fixed, it is recommended to use for loop.
We can initialize the variable, check condition and increment/decrement value. 
It consists of four parts:

1. **Initialization**: It is the initial condition which is executed once when the loop starts. Here, we can initialize the variable, or we can use an already initialized variable. It is an optional condition. 
2. **Condition**: It is the second condition which is executed each time to test the condition of the loop. It continues execution until the condition is false. It must return boolean value either true or false. It is an optional condition.
3. **Increment/Decrement**: It increments or decrements the variable value. It is an optional condition.
4. **Statement**: The statement of the loop is executed each time until the second condition is false.

***Syntax***

<code>
for(initialization;condition;increment/decrement)

{

    //code or statement to be executed.

}
</code>

> ## For-Each Loop

The for-each loop is used to traverse array or collection in Java. It is easier to use than simple for loop because we don't need to increment value and use subscript notation.

It works on the basis of elements and not the index. It returns element one by one in the defined variable.

***Syntax***

<code>
for(data_type variable : array/collection)

{

    //code or statement to be executed.

}
</code>

> ## while Loop

The Java while loop is used to iterate a part of the program repeatedly until the specified Boolean condition is true. As soon as the Boolean condition becomes false, the loop automatically stops.

***Syntax***

<code>
while(condition)

{

    //code to be executed.

}
</code>

> ## do-while Loop

The Java do-while loop is used to iterate a part of the program repeatedly, until the specified condition is true. If the number of iteration is not fixed and you must have to execute the loop at least once, it is recommended to use a do-while loop.

***Syntax***

<code>
do
{
    //code to be executed.
}while(condition);

> ## Break Statement

The Java break statement is used to break loop or switch statement. It breaks the current flow of the program at specified condition. In case of inner loop, it breaks only inner loop.

***Syntax***

<code>
for(int i=0;i< n;i++)

{
    if(n==3)

    {

        break;   //terminates the loop when n=3
    
    }

}
</code>

> ## Continue Statement

The Java continue statement is used to continue the loop. It continues the current flow of the program and skips the remaining code at the specified condition. In case of an inner loop, it continues the inner loop only.

***Syntax***

<code>
for(int i=0;i< n;i++)

{
    if(n==3)

    {

        continue;   //skips the below statements when n=3
    
    }
    
    //code to be executed.

}
</code>
