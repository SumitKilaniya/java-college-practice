-----------------------------------------------------------------------------
                                   defalut.| private |  protected |  public  |
                                   -------------------------------------------
same class                           yes.    yes.       yes.         yes.    | 

same package subclass                yes.     No.       yes.         yes.    |

same package non subclass           yes.      No.       yes.        yes.     |

different package subclass          no.       no.       yes.        yes.     |
 
different package non subclass.     no.       no.       no.         no       |
-----------------------------------------------------------------------------


  reference
    |
a.calsss load obj = new(object usi ka bnega jiske sath new use hua h ) a();--------constructor deafult ----allocating memory to object. us class ke default var ka initialisation 


as soon as class load then its static var / method load hote h.





CLASSES IN JAVA :------->
classs is a user defined data type ,it consists of fields and methods which can be accessed and used by creating an instance of that class, it represent a set of properties or methods that are common to all objects of one type 
a class is a blueprint of an object 


DIFFERENT TYPES OF CLASSES :--------->
1.  CONCRETE OR REGULAR CLASS------- this is the most common type of class, it can have field , method and constructors, suc class can be instanciated (object can be created )

exmaple---->
class demo{
    int x;
    void f1(){
        ........
    }
}
class driver {
    psvm{
        demo obj=new demo();
        obj.f1();
    }
}

2. ABSTRACT CLASS:------> declared with the keyword abstract. such classes can not be instanciated directly . Abstract class can have abstract methods (methods without body) and concrete methods used for inheritance and partial abstraction.

exmaple------>

abstract class vehicle{
    void drive();
    void applybreak(){
        sop("vehicle stopped");
    }
}
class main extends vehicle {
    public void drive(){
sop("vehicle started")
    }   
}
psvm{
 vehicle obj=new main();
 obj.drive();
 obj.applybreak();
}


3. final class---------->.  such classes declared with final keyword , final class can not be inherited it is used to create immutable and not extendable classes

example--->
final class constant{
    final double pie=3.14;
}
public class driver extends constant{ ❌ }



4. interface classs-------> it is declared with the interface keyword. it provides 100% abstraction.it contains only constants and abstract methods(without body )(before java 8 (jdk version 1.8)) it should ebe inherited 


interface a {
    public void f1();
    public vooid f2();
}
class b implements a{
    public void f1(){
        sop("methods  a from interface");
    }
    public void f2(){
        sop("method b from interface");
    }
}
class main{
psvm{
    b obj=new b();
    b.f1();
    b.f2();
}
}

singleton class------->a class  that allows only one object to be created ----one user can login at one place or device at a time often used in loging, caching , db connections , 

example ----=->
singleton class a{
    static singleton instance ;
    private singleton(){

    }
}singleton getinstance(){
    if (singleton instance == null){
        instance =new singleton();
    }
}
class main{
    psvm{
        ........
    }
}

CONSTRUCTOR:-------->
CONSTRUCTOR is a special type of method that is used to initialise the objects . it has same name as class. it has no return type , not even void . constructor get called automatically when an object is created.

example------>


class myclass{
    int num1;
    int num2;
    myclass(){
        this.num1=10;
        this.num2=100;
    }
}
class main{
    psvm{

    }
}



only instance var will be initialised by default value 0 not static var(class var)--initialise before use .
default will be called anyway .

class myclass{
    int num1;
    int num2;
    myclass(int x , int y){
        this.num1=x;
        this.num2=y;
    }
}
class main{
    psvm{
 myclass obj=new myclass();
 obj.num1;

 myclass obj2=new myclass(10,100);
 obj2.num2;
    }
}

current class ke var ka refrence hold krta h ---------this 


TYPES OF CONSTRUCTORS---
1. DEFAULT 
2. NON ARGUMENT
3. PARAMETERISED 

THIS KEYWORD-------->this is a refrence variable that refer to the current object .
used when there is confusion between local or instance  variable.

