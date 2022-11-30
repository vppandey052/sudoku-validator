package adapter.exception;

/**
 * @author vinay.panday
 * @version 1.0
 */
public class EmptyFileException extends Exception {

  public EmptyFileException() {
    super("The file is empty");
  }
}
