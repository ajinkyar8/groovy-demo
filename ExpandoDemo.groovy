def store = new Expando()
store.name = "Big Bazaar"
store.city = "Pune"
store.purchase = {"Thank you for shopping at $name at $city"}
println store.purchase()