class Customer {
    Integer id
    String name
}

Customer c = new Customer(id:1, name:"John")
println c.name

field1 = 'id'
field2 = 'name'

c[field1] = 122
c[field2] = 'jack'

println c[field1]