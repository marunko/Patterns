abstract class Prototype_Transport{
	abstract void move();
	abstract void signal();
}

abstract class Proto_Ship extends Prototype_Transport{
	abstract void swim();
}
abstract class Proto_Plane extends Prototype_Transport{
	abstract void fly();
}
abstract class Proto_Vehicle extends Prototype_Transport{
	abstract void drive();
}

class Bus extends Proto_Vehicle{

	@Override
	void drive() {

	}

	@Override
	void move() {

	}

	@Override
	void signal() {
	
	}
	 
}
class Car extends Proto_Vehicle{
	@Override
	void drive() {

	}

	@Override
	void move() {

	}

	@Override
	void signal() {
	
	}
}
class Passenger_Plane extends Proto_Plane{

	@Override
	void fly() {
 	
	}

	@Override
	void move() {
 
	}

	@Override
	void signal() {
 
	}
}
class Military_Jet extends Proto_Plane{

	@Override
	void fly() {
 	
	}

	@Override
	void move() {
 
	}

	@Override
	void signal() {

	}
}
