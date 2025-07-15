package io.github.cdpi.copilot.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>Conversation</h1>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public final class Conversation
	{
	@SerializedName("conversationTitle")
	private String title;
	private List<Message> messages;

	/**
	 * @since 0.1.0
	 */
	public String getTitle()
		{
		return title;
		}

	/**
	 * @since 0.1.0
	 */
	public Collection<Message> getMessages()
		{
		return Collections.unmodifiableList(messages);
		}

	/**
	 * @since 0.1.0
	 */
	public Collection<Message> getMessagesSortedByCreatedAt()
		{
		final var sorted = new ArrayList<>(messages);

		sorted.sort(Comparator.comparing(Message::getCreatedAt, Comparator.nullsLast(Comparator.naturalOrder())));

		return Collections.unmodifiableList(sorted);
		}
	}
