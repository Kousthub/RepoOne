import java.util.ArrayList; /** This is called Explicit import*/
import java.util.*; /** This is called Implicit import*/

public class JavaFileStructure {
    public static void main(String[] args){

        java.util.ArrayList newList = new java.util.ArrayList(); /** -> This is called fully qualified name */
    }
}



/**

The name of the Java file should be same as name of the public class(if there is one)
If there is no public class, the java file can have any name.

Whenever a .java file is complied, an associated .class file will be created for every class within the .java file

 Just a random point, java.lang package and the classes within the current working directory don't need to be imported

 -> Whenever we are "Implicitly" importing a package, all the classes present inside that package are made available, but not those inside subpackages
 e.g: import java.*; will import all classes within java package, but will not import classes within util subpackage

 -> A java source file can contain atmost 1 package statement is allowed.

 -> general java source file structure
 package statement
 import statement
 class/interface/enum declaration
 */
