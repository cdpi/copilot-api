package io.github.cdpi.copilot.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TypeTest extends Assertions
	{
	@Test
	public void testConstants()
		{
		assertEquals(Type.TEXT, "text");
		assertEquals(Type.IMAGE, "image");
		}
	}
