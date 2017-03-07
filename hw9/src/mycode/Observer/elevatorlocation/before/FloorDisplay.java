package mycode.Observer.elevatorlocation.before;

public class FloorDisplay implements Observer{
	ElevatorController elevatorController;
	public FloorDisplay(ElevatorController _elevatorController) {
		elevatorController = _elevatorController;
		_elevatorController.Attach(this);
	}

	@Override
	public void Update() {
		int curFloor = elevatorController.getCurFloor();
		System.out.println("Floor Display: " + curFloor) ;
	}
}
