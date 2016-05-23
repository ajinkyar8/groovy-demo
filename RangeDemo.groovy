println ( (0..10).contains(0) )
println ( (0..10).contains(-1) )
println ( (0..<10).contains(10) )

Range r = (0..<10)
println r.size()

def a = 0..10
println (a instanceof Range)

def today = new Date()
def yday = today - 1
println ( (yday..today).size() )

println ( ('a'..'c').contains('c') )