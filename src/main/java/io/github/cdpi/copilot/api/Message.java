package io.github.cdpi.copilot.api;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * <h1>Message</h1>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public final class Message
	{
	private String id;
	private Author author;
	private Channel channel;
	private OffsetDateTime createdAt;
	private String reaction;
	private List<Content> content;

	/**
	 * @since 0.1.0
	 */
	public String getID()
		{
		return id;
		}

	/**
	 * @since 0.1.0
	 */
	public Author getAuthor()
		{
		return author;
		}

	/**
	 * @since 0.1.0
	 */
	public Channel getChannel()
		{
		return channel;
		}

	/**
	 * @since 0.1.0
	 */
	public OffsetDateTime getCreatedAt()
		{
		return createdAt;
		}

	/**
	 * @since 0.1.0
	 */
	public String getReaction()
		{
		return reaction;
		}

	/**
	 * @since 0.1.0
	 */
	public List<Content> getContent()
		{
		return Collections.unmodifiableList(content);
		}

	/**
	 * @since 0.1.0
	 */
	public <T extends Comparable<? super T>> List<Content> getContent(final Function<Content, T> comparator)
		{
		final var sorted = new ArrayList<>(content);

		sorted.sort(Comparator.comparing(comparator, Comparator.nullsLast(Comparator.naturalOrder())));

		return Collections.unmodifiableList(sorted);
		}

	/**
	 * @since 0.1.0
	 */
	public List<Content> getContent(final boolean sortedByPartID)
		{
		return sortedByPartID ? getContent(Content::getPartID) : getContent();
		}
	}
