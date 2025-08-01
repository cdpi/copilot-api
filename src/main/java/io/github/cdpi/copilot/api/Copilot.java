package io.github.cdpi.copilot.api;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.time.OffsetDateTime;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.cdpi.api.API;
import io.github.cdpi.json.JSON;

/**
 * <h1>Copilot</h1>
 * 
 * @version 0.4.4
 * @since 0.1.0
 */
public class Copilot extends API
	{
	protected static final String ROOT = "https://copilot.microsoft.com/c/api/";

	protected static final String CONVERSATIONS = ROOT + "conversations/";

	protected static final String GET_CONVERSATION_TEMPLATE = CONVERSATIONS + "shares/%s";

	protected static final String GET_CONVERSATION_PREVIEW_TEMPLATE = CONVERSATIONS + "shares/%s/preview";

	protected static final Gson GSON = new GsonBuilder()
		.registerTypeAdapter(OffsetDateTime.class, JSON.getOffsetDateTimeDeserializer())
		.registerTypeAdapter(Author.class, JSON.getEnumDeserializer(Author.class))
		.registerTypeAdapter(Channel.class, JSON.getEnumDeserializer(Channel.class))
		.registerTypeAdapter(Content.Type.class, JSON.getEnumDeserializer(Content.Type.class))
		.create();

	/**
	 * @since 0.1.0
	 */
	public Copilot()
		{
		super();
		}

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public final Conversation getConversation(final String id) throws IOException
		{
		return getAsT(GET_CONVERSATION_TEMPLATE.formatted(id), Conversation.class);
		}

	/**
	 * @throws IOException
	 * 
	 * @since 0.4.4
	 */
	public final BufferedImage getConversationPreview(final String id) throws IOException
		{
		return getAsImage(GET_CONVERSATION_PREVIEW_TEMPLATE.formatted(id));
		}

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	private final <T> T getAsT(final String url, final Class<T> classOfT) throws IOException
		{
		return GSON.fromJson(getAsString(url), classOfT);
		}
	}
