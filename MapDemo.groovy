def map = ['id':'FX-11', 'name':'ABC', 'no':'234', 100:'Y']
println "map: $map"

def map1 = ['id':'FX-11', 100:'Y', 'name':'ABC', 'no':'234']
println "map1: $map1"

println (map == map1)

println ([1:'a', 2:'b', 1:'c'] == [1:'c', 2:'b'])

def map2 = [:]
map2[1] = 'a'
map2[2] = 'b'
map2[true] = 'p'
map2['d'] = 'q'
println "map2: $map2"

def foo = "test"
map2 << [foo:"bar"]
println "map2: $map2"