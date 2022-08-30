package learnJava;

public class Identifiers {
}

/**
    Java learnJava.Identifiers

->
        They may only compose of:
        a - z
        A - Z
        0 – 9
        $
        _ (underscore)

        •	learnJava.Identifiers shouldn’t start with a digit.
        •	Java learnJava.Identifiers (and in turn the Java language itself) are case sensitive.
        •	Use of Reserved words as learnJava.Identifiers will lead to a compile time error.
        •	All pre-defined Java class names (e.g. datatype names) and Java Interface names can be used as learnJava.Identifiers. (But is not recommended as it reduces code readability).
        E.g.
class Test{
    Public Static void main(String [] args)
    {
        int String = 10;
        System.out.println(String);		< ----------The code here is valid and O/P is 10.
    }							But this style of coding is not recommended
}


    Reserved Words

    There are 53 reserved words. They can be divided into 2 types:
        1)	Reserved Literals (3)
        a)	True
        b)	False
        c)	Null
        2)	Keywords
        a)	Used Keywords (48)
        b)	Unused Keywords (2)
        i)	goto
        ii)	Const

        https://www.geeksforgeeks.org/list-of-all-java-keywords/

         
        Keywords for datatypes (8): byte, short, int, long, float, double, Boolean, char
        Keywords Flow control (11): if, else, switch, case, default, while, do, for, break, continue, return
        Keywords Modifiers (12): public, private, protected, static, final, abstract, synchronized, native,
strictfp, transient, volatile, default (not used)
        Keywords for Exception Handling (6): try, catch, finally, assert, throw, throws
        Class related keywords (6): class, interface, extends, implements, package, import
        Object related keywords (4): new, instanceof, super, this
        void return type keyword.


        Return type is mandatory in Java, if a method won’t return anything then that method has to be declared with a “void” return type.

        goto, const are banned keywords in Java.
        Use “final” instead of “const”.

        Use of goto and/or const will lead to a compile time error.

        Null is default value of object reference.

        Enum
        We can use enum to define a group of named constants.

*/