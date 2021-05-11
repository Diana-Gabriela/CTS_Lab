package ro.ase.csie.cts.g1094.dp.chain;

public class BroadcastMesageHandler extends ChatHandler{

	@Override
	public void processMessage(ChatMessage msg) {


		if (msg.destination.toLowerCase().equals("@everyone")) {
			System.out.println("@evryone " + msg.text);
			
		}
		if(this.next != null) {
			this.next.processMessage(msg);
		}
	}

}
