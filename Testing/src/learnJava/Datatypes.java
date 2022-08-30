package learnJava;

public class Datatypes {

    int x = 10;

    public void exp (String[] args){
        // if (x) {  //-------------- > This will throw a compile time error saying “required: boolean, found: int”
        //     System.out.println("Hello");
        // }
        //     else{
        //     System.out.println("Hey");
        // }
        //
        //
        //     while(1){ //-------------> This will throw a compile time error saying “required: boolean, found: int”
        //     System.out.println("Hi");
        // }

        // Basically, both these expressions are valid in C, C++ but in Java we have a to supply a boolean datatype.
    }
}

/**
    Java DataTypes

    Java is a strongly typed programming language. (because of the following reasons)
        •	In Java, every variable and expression has some type.
        •	Each and every datatype is clearly defined.
        •	Every assignment is checked by complier for type compatibility.

        When compared with old languages like C++, C Java has more OOPS features but at the same time Java doesn’t support many OOPS features such as multiple inheritance, operator overloading, etc. Hence, we can conclude that Java is NOT a pure object-oriented programming language.
        Also, we are depending on primitive datatypes which are non-objects.


        Primitive learnJava.Datatypes
        1.	Numeric learnJava.Datatypes
            a.	Integral learnJava.Datatypes
                i.	byte
                ii.	short
                iii.	int
                iv.	long
            b.	Floating learnJava.Datatypes
                i.	float
                ii.	double
        2.	Non-Numeric learnJava.Datatypes
                i.	char
                ii.	boolean


        Except boolean and char, remaining datatypes are considered as signed datatypes because we can represent both +ve and -ve datatypes.

        Byte
        1 byte = 8 bits
        Range: 127 to -128

        Of these 8 bits, most significant bit is used to represent the sign of the data, while the rest 7 bits store the data.
        -ve numbers will be represented using 2’s compliment.
        byte is the best datatype to handle data via data streams (either from files or from the network).

        Short
        Size: 2 bytes (16 bits)
        Range: -215 to 215 – 1, Short is an outdated datatype.

        Int
        Size: 4 bytes (32 bits)
        Range: -231 to 231 -1

        If we assign int x = 2147483648 (which is 1 larger than max int value) (then we get Compile time error: integer number too large)

        Long
        Size: 8 bytes (64 bits)
        Range: -263 to 263 - 1

        E.g., long is return type of length().

        Float
        5 to 6 decimal places
        Single precision
        Size: 4 bytes
        Range: -3.4e38 to 3.4e38

        Double
        14 to 15 decimal places
        Double precision
        Size: 8 bytes
        Range: -1.7e308 to 1.7e308

        Boolean
        Size: Not applicable (Virtual machine dependent)
        Range: Not applicable (allowed values are true or false)
 */

