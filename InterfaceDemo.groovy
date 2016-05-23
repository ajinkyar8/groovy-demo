interface Helper{
    void helpInKitchen();
    void helpInCleaning();
}

//This map implements the methods declared in the interface
helperMethods = [    
    helpInKitchen: { println 'Make food' },
    helpInCleaning: { println 'Wash plates' } 
]

class TheHelper{
    public void takeHelp(Helper h){
        h.helpInKitchen(); 
    } 
}

//Since the map implements the methods of interface, it is passed as parameter in place of interface
//The map is casted to interface
new TheHelper().takeHelp(helperMethods as Helper);
}