package io.github.cdpi.copilot.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TypeTest extends Assertions
	{
	//@Test
	public void testConstants()
		{
		//assertEquals(Type.TEXT, "text");
		//assertEquals(Type.IMAGE, "image");
		}

	@Test
	public void testEnum()
		{
		assertEquals(Content.Type.values().length, 2);

		assertEquals(Content.Type.IMAGE.ordinal(), 0);
		assertEquals(Content.Type.TEXT.ordinal(), 1);
		}
	}
