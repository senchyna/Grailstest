package grailstest

class Main {

	String name 
    String make
    String model
	
    static constraints = {
	    name maxSize: 255
        make inList: ['Ford', 'Chevrolet', 'Nissan']
        model nullable: true
    }
}
