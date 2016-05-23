class MyClass implements GroovyInterceptable{
    def dynamic(name, args){
        def metaMethod = metaClass.getMetaMethod(name, args)
        def result = metaMethod.invoke(this, args)
        return result
    }
    def hello(arg){ println arg }
    def hey(arg){ println "how r u?, $arg" }
}

def my = new MyClass()
println "Enter method name:"
def name = "hey"
//System.in.withReader{ reader -> name = reader.readLine() }
my.dynamic(name, "I am Aju")
