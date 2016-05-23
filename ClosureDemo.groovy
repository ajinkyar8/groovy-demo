def clos = {println "hello"}
clos()

def clos1 = {x -> println x}
clos1(5)

def clos2 = {println it}
clos2("world")

//def clos3 = {x -> println it}     //doesnt work
//clos3(4)

def clos4 = {x,y -> println x+y}
clos4("hi ", "hello")

def clos5 = {String x, Integer y -> println x*y }
clos5("hello ", 9)

def c = 10
def clos6 = {num -> num * c}
println clos6(3)

println "Closure as closure argument"
def process = {closure, num -> 
    num = closure(num) + closure(num); 
    println num;
}
process(clos6, 5);
process({it}, 5);

println "Closure as method argument"
def list = ['a', 'b', 'c']
def closure7 = { it.toUpperCase() }
println closure7(list)