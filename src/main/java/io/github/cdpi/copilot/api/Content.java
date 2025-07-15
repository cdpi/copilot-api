package io.github.cdpi.copilot.api;

/**
 * <h1>Content</h1>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public final class Content
	{
	private String type;
	private String text;
	private String partId;
	private String reaction;

	/**
	 * @since 0.1.0
	 */
	public String getType()
		{
		return type;
		}

	/**
	 * @since 0.1.0
	 */
	public String getText()
		{
		return text;
		}

	/**
	 * @since 0.1.0
	 */
	public boolean isText()
		{
		return Type.TEXT.equals(type);
		}

	/**
	 * @since 0.1.0
	 */
	public String getPartId()
		{
		return partId;
		}

	/**
	 * @since 0.1.0
	 */
	public String getReaction()
		{
		return reaction;
		}
	}
