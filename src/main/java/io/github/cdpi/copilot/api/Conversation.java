package io.github.cdpi.copilot.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
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
	public List<Message> getMessages()
		{
		return Collections.unmodifiableList(messages);
		}

	/**
	 * @since 0.1.0
	 */
	public <U extends Comparable<? super U>> List<Message> getMessages(final Function<Message, U> comparator)
		{
		final var sorted = new ArrayList<>(messages);

		sorted.sort(Comparator.comparing(comparator, Comparator.nullsLast(Comparator.naturalOrder())));

		return Collections.unmodifiableList(sorted);
		}

	/**
	 * @since 0.1.0
	 */
	public List<Message> getMessagesSortedByCreatedAt()
		{
		return getMessages(Message::getCreatedAt);
		}
	}
