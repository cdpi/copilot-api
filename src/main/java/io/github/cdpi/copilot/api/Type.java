package io.github.cdpi.copilot.api;

/**
 * <h1>Type</h1>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public final class Type
	{
	public static final String TEXT = "text";
	public static final String IMAGE = "image";

	/*
	Propositions Copilot dans VS Code :
	public static final String IMAGE = "image";
	public static final String VIDEO = "video";
	public static final String AUDIO = "audio";
	public static final String FILE = "file";
	public static final String CODE = "code";
	*/

	/**
	 * @since 0.1.0
	 */
	private Type()
		{
		throw new UnsupportedOperationException();
		}
	}
