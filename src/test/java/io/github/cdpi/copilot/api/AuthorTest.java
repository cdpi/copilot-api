package io.github.cdpi.copilot.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthorTest extends Assertions
	{
	@Test
	public void testEnum()
		{
		assertEquals(Author.values().length, 2);

		assertEquals(Author.AI.ordinal(), 0);
		assertEquals(Author.HUMAN.ordinal(), 1);
		}
	}
