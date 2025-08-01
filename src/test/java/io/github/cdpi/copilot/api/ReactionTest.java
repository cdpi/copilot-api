package io.github.cdpi.copilot.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReactionTest extends Assertions
	{
	@Test
	public void testConstants()
		{
		assertEquals(Reaction.UP, "thumbs-up");
		assertEquals(Reaction.DOWN, "thumbs-down");
		}
	}
