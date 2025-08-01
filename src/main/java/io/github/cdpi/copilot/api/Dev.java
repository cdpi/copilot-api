package io.github.cdpi.copilot.api;

public class Dev
	{
	public static void main(String[] args) throws Throwable
		{
		final var copilot = new Copilot();

		copilot.getConversation("ux3WzaSttRTCMPYU5FnDv").getMessages(true).forEach(message ->
			{
			/*
			System.out.println("Message ID: " + message.getID());
			System.out.println("Created At: " + message.getCreatedAt());
			System.out.println("Channel: " + message.getChannel());
			System.out.println("Author: " + message.getAuthor());
			System.out.println("Content: ");
			message.getContent(true).forEach(content ->
				{
				if (content.isText())
					{
					System.out.println(content.getText().substring(0, 20));
					}
				else
					{
					System.out.println("Content type: " + content.getType());
					}
				});
			*/
			message.getContent(true).forEach(content ->
				{
				System.out.println("Content type: " + content.getType());
				});
			});
		}
	}
