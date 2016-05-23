def list = [2, 3, 4, 5, 'hello']
println list
println list.class
println (list.class == ArrayList)

list << 6
println list

list << 7 << 'i' 
println list

list << [10, 'R']
println list

//list.add(new HashMap().put("hello", "world"))
list.add(12)
println list

list.addAll([9,8])
println list

list1 = [2, 4, 6, 7]
println (list1.max()) 
println (list1.min()) 

list1.remove(3)
println list1

list2 = ['a', 'b', 'f', 'r']
println list2

list2.remove('f')
println list2

Collections.reverse(list2)
println "list2: $list2"

list2 << 'f'
println "list2: $list2"

list2 << 'r'
println "list2: $list2"

list2.removeAll('r')
println "list2: $list2"

list3 = list2.reverse()
println "list3: $list3"

Collections.replaceAll(list3, 'b', 'c')
println "list3: $list3"

