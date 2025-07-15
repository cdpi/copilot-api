package io.github.cdpi.copilot.api;

public class Dev extends Copilot
	{
	public static void main(String[] args) throws Throwable
		{
		final var dev = new Dev();

		//System.out.println(dev.get(CONVERSATIONS_SHARES_ID.formatted("ux3WzaSttRTCMPYU5FnDv")));

		dev.conversation("ux3WzaSttRTCMPYU5FnDv").getMessagesSortedByCreatedAt().forEach(message ->
			{
			System.out.println("Message ID: " + message.getID());
			System.out.println("Created At: " + message.getCreatedAt());
			System.out.println("Channel: " + message.getChannel());
			System.out.println("Content: ");
			message.getContent().forEach(content ->
				{
				if (content.isText())
					{
					System.out.println(content.getText());
					}
				else
					{
					System.out.println("Content type: " + content.getType());
					}
				});
			});
		}
	}
