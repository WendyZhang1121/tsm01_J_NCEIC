package tsm01_J_NCEIC;

public interface ExceptionReporter {

	public void setExceptionReporter(ExceptionReporter er); 
	public void report(Throwable exception);
}