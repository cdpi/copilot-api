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
	private String url;
	private String thumbnailUrl;
	private String prompt;
	private int partId;
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
	public boolean isText()
		{
		return Type.TEXT.equals(type);
		}

	/**
	 * @since 0.1.0
	 */
	public boolean isImage()
		{
		return Type.IMAGE.equals(type);
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
	public String getURL()
		{
		return url;
		}

	/**
	 * @since 0.1.0
	 */
	public String getThumbnailURL()
		{
		return thumbnailUrl;
		}

	/**
	 * @since 0.1.0
	 */
	public String getPrompt()
		{
		return prompt;
		}

	/**
	 * @since 0.1.0
	 */
	public int getPartID()
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
