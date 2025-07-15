package io.github.cdpi.copilot.api;

import java.io.IOException;
import org.apache.http.client.fluent.Request;
import com.google.gson.Gson;

/**
 * <h1>Copilot</h1>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public class Copilot
	{
	protected static final String URL = "https://copilot.microsoft.com/c/api/";
	protected static final String CONVERSATIONS = URL + "conversations/";
	protected static final String CONVERSATIONS_SHARES = CONVERSATIONS + "shares/";
	protected static final String CONVERSATIONS_SHARES_ID = CONVERSATIONS_SHARES + "%s";

	protected static final Gson GSON = new Gson();

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public final Conversation conversation(final String id) throws IOException
		{
		return get(CONVERSATIONS_SHARES_ID.formatted(id), Conversation.class);
		}

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	protected final <T> T get(final String url, final Class<T> classOfT) throws IOException
		{
		return GSON.fromJson(get(url), classOfT);
		}

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	protected final String get(final String url) throws IOException
		{
		return Request.Get(url).execute().returnContent().asString();
		}
	}
