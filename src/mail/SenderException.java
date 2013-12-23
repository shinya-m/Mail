package mail;

public class SenderException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
    public SenderException( Exception e ){
        super( e );
    }
}
