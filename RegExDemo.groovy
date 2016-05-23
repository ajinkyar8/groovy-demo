str = 'aaaa'
if (str =~ /a*/) {
    println 'a*' 
}
if (str =~ /a+/) {
    println 'a+'
}
if (str =~ /a?/) {
    println 'a?'
}
if (str =~ /0-9/)
    println '0-9'

def num = '1'
if (num =~ /0-9/)
    println '0-9'
    
str1 = 'abc'
if (str1 =~ /^a/)
    println '^a'
if (str1 =~ /c$/)
    println 'c$'