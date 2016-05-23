def stack = [2, 3, 4, 5, 'hello']
println stack
println stack.class

stack << 'a'
println stack

stack.pop()
println stack

stack.push(10)
println stack

println "stack[0] : ${stack[0]}"