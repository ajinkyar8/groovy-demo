obj = "hello";
if (obj?.value == 1) 
    println 1;
else println 2;

def a = [1, 2, 3, 4, 5];
println a*.toString();

def list = [10, 20, 30]
println list.toString()

a = 4; b = 3;
println (a <=> b);

println 5/3;
println (5/3 as Integer);

contact = "111222abc333"
if (contact =~ /[A-Z a-z]/)
    println "contact number not valid"
