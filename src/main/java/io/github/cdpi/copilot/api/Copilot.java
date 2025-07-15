package io.github.cdpi.copilot.api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.time.OffsetDateTime;
import org.apache.http.client.fluent.Request;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

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

	protected final Gson gson;

	/**
	 * @since 0.1.0
	 */
	public Copilot()
		{
		super();

		final var offsetDateTimeDeserializer = new JsonDeserializer<OffsetDateTime>()
			{
			@Override
			public OffsetDateTime deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context) throws JsonParseException
				{
				return OffsetDateTime.parse(json.getAsString());
				}
			};

		gson = new GsonBuilder().registerTypeAdapter(OffsetDateTime.class, offsetDateTimeDeserializer).create();
		}

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
		return gson.fromJson(get(url), classOfT);
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
