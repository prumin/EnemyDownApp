package plugin.enemydown.app;

public class DuplicateConfigException extends Exception {

  public DuplicateConfigException(Throwable cause) {
    super(cause);
  }

  public DuplicateConfigException() {
    super();
  }

  public DuplicateConfigException(String message) {
    super(message);
  }

  public DuplicateConfigException(String message, Throwable cause) {
    super(message, cause);
  }
}
