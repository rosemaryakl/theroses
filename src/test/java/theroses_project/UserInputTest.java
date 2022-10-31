package theroses_project;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import Game.Game;
import Game.UserInput;
import org.junit.After;
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
    private static final InputStream systemIn = System.in;
    private ByteArrayInputStream testIn;
    @BeforeClass
    public static void setup() {
        System.out.println("Before Class"); 
        //gc = mock(Game.class);
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }
    @Before
    public void init() {
        //dc = new UserInput(gc);
    }
    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
    }
    @Test//(expected=IllegalStateException.class)
    public void testWinGame() {
        dc.winGame();
        assertEquals("Game over! Thanks for playing", outputStreamCaptor.toString().trim());
        //assertFalse(dc.scanner.next()==null);
    }
//  @Test
//  public void testMovement()
//    {
//      String forwardMove = "w";
//      provideInput(forwardMove);
//        
//    }   
}