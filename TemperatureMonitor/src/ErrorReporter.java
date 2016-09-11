import java.util.List;

public class ErrorReporter implements Runnable {

	private List<MonitorError> errors;

	public ErrorReporter(List<MonitorError> errors) {
		this.errors = errors;
	}

	public void addTempError(String labName, float tempture,boolean aboveRange) {
		errors.add(new MonitorError(labName, MonitorError.TEMPERATURE_ERROR,aboveRange));
	}

	@Override
	public void run() {
		while (true) {
			if (errors.size() > 0) {
				System.out.println(errors.get(0));
				errors.remove(0);
			}
		}

	}

}
