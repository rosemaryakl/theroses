package theroses_project;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

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
	
	@BeforeClass
	public static void setup() {
		System.out.println("Before Class");
	    when(gc.movePlayer(2)).thenReturn(null);
	    gc = mock(Game.class);
	}
	
	@Before
	public void init() {
		dc = new UserInput(gc);
	}
	
	@Test
	public void test() {
	    assertEquals(mockedmovePlayer.getUniqueId(), 23);
	}
}
