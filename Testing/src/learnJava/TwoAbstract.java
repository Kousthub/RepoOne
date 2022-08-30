public abstract class TwoAbstract {
    public abstract int getNumberofAbstractModifiers();
}

class subTwoAbstract{
    public int getNumberofAbstractModifiers(){
        return 0; // -> Child classes are responsible to provide implementation for parent class abstract methods
    }
}

abstract class Vehicle{
    public abstract int getNumberOfWheels();
}
class Bus extends Vehicle{
    @Override
    public int getNumberOfWheels() {
        return 6;
    }
    class Auto extends Vehicle{
        @Override
        public int getNumberOfWheels() {
            return 3;
        }
    }
}
class Test {
    public static void main(String[] args) {
        Bus b = new Bus();
        System.out.print(b.getNumberOfWheels());
    }
}
/**

 * Abstract modifier can be applied on:
 *                                  * methods
 *                                  * classes
 *                                  * but not on variables

 * abstract methods only have a declaration but no implementation (abstract methods cannot have body)
 * -> Abstract methods are used when it is not possible to know what is to be returned given the current level
   eg: is not possible to return the number of wheels on a vehicle, without knowing which type of vehicle it is.
 * If a class contains at least one abstract method, then it should also be declared as abstract


 *  Abstract classes are partially implemented classes or might have to be declared abstract because of the existence of abstract method
 *  -> Abstract classes need not contain abstract methods
 *  Object instantiation is not possible for abstract classes, hence methods within abstract classes cannot be directly accessed
 *  Classes can be declared abstract to specifically prevent object creation for that class
 *  It is highly recommended to declare every "Adapter classes" as abstract as methods they contain do not contain any implementation.

 *  Child classes are responsible to provide implementation for parent class abstract methods
 *  -- If child classes are to provide implementation for abstract methods within a parent class, they should do so for all abstract methods present
 *  -- In the event of child class not providing implementation for all abstract methods within a parent class, we have to go for next level child class
 */


// public abstract class vehicle {
//     public abstract int getNumberofwheels();
// }