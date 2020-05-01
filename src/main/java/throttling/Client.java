package throttling;

public abstract class Client {
    protected String clientName;
    protected RemoteService remoteService;

    public abstract void action();

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public RemoteService getRemoteService() {
        return remoteService;
    }

    public void setRemoteService(RemoteService remoteService) {
        this.remoteService = remoteService;
    }
}
