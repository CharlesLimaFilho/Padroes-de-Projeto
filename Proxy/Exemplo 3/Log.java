public class Log {
    private String clientName;
    private boolean accessGranted;

    public Log(String clientName, boolean accessGranted) {
        this.clientName = clientName;
        this.accessGranted = accessGranted;
    }

    public String getClientName() {
        return clientName;
    }

    public boolean isAccessGranted() {
        return accessGranted;
    }
}
