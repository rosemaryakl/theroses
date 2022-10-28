package theroses_project;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import org.junit.runner.RunWith;

import Game.Game;
import Game.UserInput;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserInputTest {
	
	@InjectMocks
	public UserInput dc; 
	
	@Mock
	public static Game gc;
	private static final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	@BeforeClass
	public static void setup() {
		System.out.println("Before Class");	
	    gc = mock(Game.class);
	    System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@Before
	public void init() {
		dc = new UserInput(gc);
	}
	
	@Test(expected=IllegalStateException.class)
	public void testWinGame() {
	    dc.winGame();
	    assertEquals("Game won! Thanks for playing", outputStreamCaptor.toString().trim());
	    dc.scanner.next();
	}
}
