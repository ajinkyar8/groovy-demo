class Names{
    String firstname, lastname;
    String getName(){
        return "$firstname $lastname"
    }
}

def bean = new Names(firstname: "Harry")

bean.lastname = "Potter"

println "Following statement internally accesses method getName()"
println bean.name;

class Employee{
    String name
    void setName(name){
        this.name = name
    }
    String getName(){
        return "Hello $name"
    }
}

def em = new Employee(name: "Aju")
println "Property of bean, means method"
println em.name
println "Field of bean"
println em.@name