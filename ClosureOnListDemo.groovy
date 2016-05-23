def list = [1,2,3,4]
//it means any element of list which meets the condition
println (list.find{ it > 1 } )
println (list.findAll{ it > 1 } )

/* find index of any element from given list such that the element is present in the "list" object 
& that element is found as first element in given list
*/
println (list.findIndexOf{ it in [5,2,3] } )
println "every {it < 5}"
println (list.every{ it < 5} )
println "any {it > 1}"
println (list.any{ it > 1 } )
println "list.sum(100)"
println (list.sum(100))
println "list.join('-')"
println (list.join('-') )
println "use of inject"
println (list.inject('counting: '){str, item -> str+item} )
println this
//println owner     //doesn't work