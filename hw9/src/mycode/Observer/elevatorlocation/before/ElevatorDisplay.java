package mycode.Observer.elevatorlocation.before;

public class ElevatorDisplay implements Observer {
	ElevatorController elevatorController;
	public ElevatorDisplay(ElevatorController _elevatorController) {
		elevatorController = _elevatorController;
		_elevatorController.Attach(this);
	}
	@Override
	public void Update() {
		int curFloor = elevatorController.getCurFloor();
		System.out.println("Elevator Display: " + curFloor) ;
	}
}
