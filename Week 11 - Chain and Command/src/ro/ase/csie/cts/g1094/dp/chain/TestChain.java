package ro.ase.csie.cts.g1094.dp.chain;

public class TestChain {

	public static void main(String[] args) {


		ChatHandler broadcastNode = new BroadcastMesageHandler();
		ChatHandler privateNode = new PrivateMessageHandler();
		ChatHandler filterNode = new EnglishFilter(7);
		
		filterNode.setNext(privateNode);
		privateNode.setNext(broadcastNode);
		
		
		ChatHandler chatServer = filterNode;
		
		chatServer.processMessage(new ChatMessage("@everyone", "hello gents", 0));
		chatServer.processMessage(new ChatMessage("@everyone", "hit him", 0));
		chatServer.processMessage(new ChatMessage("@john", "lovely weather today", 0));
		chatServer.processMessage(new ChatMessage("@john", "indeed", 0));

		
	}

}
