b = "world";
a = '''hello 
$b''';
println a;
a = """hello
$b""";
println a;

a = 'hello groovy'
b = 'hi'
println b + a;
println b + a - 'hello'

println (a.count('g') == 5)
println '////////////'

c = 'ccc' 
d = 'ddd'
println c instanceof String
c = c<<d
println c instanceof StringBuffer
println '////////////'

c = "${->d} friend"