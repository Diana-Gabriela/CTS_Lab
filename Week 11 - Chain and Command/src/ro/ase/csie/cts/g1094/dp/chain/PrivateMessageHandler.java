package ro.ase.csie.cts.g1094.dp.chain;

public class PrivateMessageHandler extends ChatHandler{

	@Override
	public void processMessage(ChatMessage msg) {

		if(msg.destination.toLowerCase().equals("@eveyone")) {
			if(this.next != null) {
				this.next.processMessage(msg);
			}
			else
			{
				System.out.println("Private msg for " + msg.destination + " : "+ msg.text);
			}
		}
	}

}
