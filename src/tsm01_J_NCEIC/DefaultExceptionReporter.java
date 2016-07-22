package tsm01_J_NCEIC;

public class DefaultExceptionReporter implements ExceptionReporter { 
	public DefaultExceptionReporter(ExceptionReporter er) {
		er.setExceptionReporter(new DefaultExceptionReporter(er) { 
			public void report(Throwable t) {
				filter(t); 
			}

			private void filter(Throwable t) {
				// TODO Auto-generated method stub
			}
		}); 
	}
	// Default implementations of setExceptionReporter() and report() 

	@Override
	public void setExceptionReporter(ExceptionReporter er) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void report(Throwable exception) {
		// TODO Auto-generated method stub
		
	}
}
