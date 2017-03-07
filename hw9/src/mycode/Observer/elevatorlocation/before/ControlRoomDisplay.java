package mycode.Observer.elevatorlocation.before;

public class ControlRoomDisplay implements Observer{
	ElevatorController elevatorController;
	public ControlRoomDisplay(ElevatorController _elevatorController) {
		elevatorController = _elevatorController;
		_elevatorController.Attach(this);
	}

	@Override
	public void Update() {
		int curFloor = elevatorController.getCurFloor();
		System.out.println("Control Room: " + curFloor) ;	
	}
}
