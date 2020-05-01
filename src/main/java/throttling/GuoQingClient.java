package throttling;

public class GuoQingClient extends Client {

    @Override
    public void action() {
        System.out.println(this.clientName + "进入大门");
        remoteService.takeOfficialSeal(this.clientName);
    }
}
