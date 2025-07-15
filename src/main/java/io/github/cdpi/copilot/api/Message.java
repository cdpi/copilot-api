package io.github.cdpi.copilot.api;

import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <h1>Message</h1>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public final class Message
	{
	private String id;
	private String author;
	private String channel;
	private String createdAt;
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
	public String getAuthor()
		{
		return author;
		}

	/**
	 * @since 0.1.0
	 */
	public String getChannel()
		{
		return channel;
		}

	/**
	 * @since 0.1.0
	 */
	public OffsetDateTime getCreatedAt()
		{
		return OffsetDateTime.parse(createdAt);
		}

	/*
	public LocalDateTime getCreatedAt2()
		{
		final var offsetDateTime = OffsetDateTime.parse(createdAt);

		final var swissDateTime = offsetDateTime.atZoneSameInstant(ZoneId.of("Europe/Zurich"));

		return swissDateTime.toLocalDateTime();
		}
	*/

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
	public Collection<Content> getContent()
		{
		return Collections.unmodifiableList(content);
		}
	}
