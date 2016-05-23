class Car{
    def drive(){ println "Driving!" }
    def turn(){ println "Turning!" }
    def brakes(){ println "Brakes!" }
}

def doAction(vehicle, action){
    vehicle."$action"()
}

def toyota = new Car()
doAction(toyota, "turn")