println "Dynamic methods"
class Sample{
    String name
}

Sample.metaClass.display = { 
    println "This is dynamic method"
}

def obj = new Sample()
obj.display()

class MethodLender{
    def myMethod(){
        "in myMethod"
    }
}

def obj1 = new MethodLender()
Sample.metaClass.sampleMethod = obj1.&myMethod

println obj.sampleMethod()

println "Adding Constructor to a class"
Sample.metaClass.constructor << { String sampleName -> 
    new Sample(name:sampleName)    
}
println new Sample("Aju").name