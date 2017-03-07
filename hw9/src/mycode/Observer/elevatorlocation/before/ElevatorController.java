package mycode.Observer.elevatorlocation.before;

import java.util.ArrayList;

public class ElevatorController implements Subject{
	private int curFloor = 1;
	private ArrayList<Observer> observers;
	
	public ElevatorController(){
		observers = new ArrayList<Observer>();
	}

	public void gotoFloor(int destination) {
		this.curFloor = destination ;
		Notify();
	}
	
	public int getCurFloor() {
		return curFloor ;
	}
	@Override
	public void Attach(Observer o) {
		observers.add(o);
	}
	@Override
	public void Detach(Observer o) {
		int i = observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}
	}
	@Override
	public void Notify() {
		for(int i = 0; i < observers.size(); i++){
			Observer observer = (Observer)observers.get(i);
			observer.Update();
		}
	}
}
