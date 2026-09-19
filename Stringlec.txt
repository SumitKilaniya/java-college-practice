-->String is an object that represent the sequence of characters . it is the most fundamental and commanly used classes in java.lang package.
string-->class, data type,array,literal
== and .equals if we are creating object of it

string can store a sequence of characters, enclosed by double quotes and very character is stored in 16 bits
String str=".......";         -------> literal
Strnig str1 =new String("....");    ---------> object

string is an character array.( to store as amny as characters). a string acts the same as array of characters.
string is an immutable class which means a constant cannot be changed once cretaed.if we like to change , we need to create a new object.String is automatically thread safe.
not synchronised(one after one) , it is default thred safe.
if we want to do so qe have to create ne object.



key characteristics of string:

1.OBJECTS----> unlike primitive data types like (int , char) String is a class and instances of string are object. 

2. IMMUTABILITY---->once a string obect is created its value can't be changed, ant operation appeared to modify a string actually result in  the creation of a new string object.

3. STRING LITERAL ---> THE mosy common way to create a string is using a string literal.-which is a sequence of characters enclosed in double quotes.
string str=".....";

4. STRING CLASS---> the string class provides a rich set of methods for manipulating the strings including methids for comparison , searching, changing case and more.

5. MEMORY MANAGEMENT---->  string objects are stored in heap memory. java's string pool optimises the memory usage by storing identical string literals 

6. USAGE:-->. security , thread safety, and memory efficiency 

SCP=STRING CONSTANT POOL

-SPECIAL TYPE OF MEMORY space THAT HOLD STRING LITERAL.
string using literal --->

wheneever a string object is created using literal - the object will be created in the string constant pool.--- this allow jvm to optimise the initialisation of a string literal and the scp is present in the heap. 
ex----> 

String str="....";



string using new keyword:--->
 a string can also be declared using new keyword, in case of string are dynamically allocated ,they are assigned a new memory location in the heap.

example-->
string str = new String("java");


--------------------------------------------------------------------------------
|method                 example                      output
|length()               "hello".length              5
|
|charAt(1)              "hello".charAt(1)            'e'
|
|substring(1,4)         "hello".substring(1,4).      "ell"
|
|toLowerCase()          "Java".toLowerCase()        "java"
|
|equals("java")         "Java".equals("java")        false
|
|equalsIgnoreCaes()     "java".equalsIgnoreCaes("Java")     true
|
|contains("va")         "java".contains("va")           true
|
|replace("a","o")       "java".replace("a","o").        jovo
|
|split(" ")             "java language".split(" ")          ["java","language"]
|--------------------------------------------------------------------------------

String BUFFER=====>>>

String buffer class objects are mutable so they can be modified , the length and content of string buffer sequence can be changed  through certain methid calls.it has two name operations (methods) 
1. append(.)
2. insert(.)


StringBuffer. sb=new StringBuffer("Java");
sb.append("python");
sop("sb")

. string buffer is thread safe because its methods are synchronised and hence it is slightly slower than string builder.

string builder --- it is used to create mutable (changable) strings, it is not thread safe(not synchronised). it  is faster in single threaded program.

StringBuilder. sb1=new StringBuilder("Java");


Is the string changing?
|
|------ NO -->String
|
|------ Yes
        |
        |----->SINGLE-THREAD---------> USE  StringBuilder
        |----->multi-thread----------> use StringBuffer

        

