package sixKyu;

import java.util.Arrays;

/**
 * 6 kyu Dubstep
 * @author Jiayu Zhang @version 2020-05-12
 * 
 * Polycarpus works as a DJ in the best Berland nightclub, and he often uses dubstep music in his performance. 
 * Recently, he has decided to take a couple of old songs and make dubstep remixes from them.
 * Let's assume that a song consists of some number of words (that don't contain WUB). 
 * To make the dubstep remix of this song, Polycarpus inserts a certain number of words "WUB" before 
 * the first word of the song (the number may be zero), after the last word (the number may be zero), 
 * and between words (at least one between any pair of neighbouring words), and then the boy glues together all the words, 
 * including "WUB", in one string and plays the song at the club.
 * 
 * For example, a song with words "I AM X" can transform into a dubstep remix as "WUBWUBIWUBAMWUBWUBX" and cannot transform into "WUBWUBIAMWUBX".
 * Recently, Jonny has heard Polycarpus's new dubstep track, but since he isn't into modern music, 
 * he decided to find out what was the initial song that Polycarpus remixed. Help Jonny restore the original song.
 * 
 * Input
 * The input consists of a single non-empty string, consisting only of uppercase English letters, 
 * the string's length doesn't exceed 200 characters
 * 
 * Output
 * Return the words of the initial song that Polycarpus used to make a dubsteb remix. Separate the words with a space.
 * 
 * Examples
 * songDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB")
 *  // =>  WE ARE THE CHAMPIONS MY FRIEND
 *  
 */
public class DubStep {

	public static String songDecoder(String song) {
		song = song.replaceAll("WUB", " ");
		return song.trim().replaceAll(" +", " ");
	}
	
	public static void main(String[] args) {

	   String song = "WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB";
       System.out.println(songDecoder(song));
	}

}

/*
 * import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class SongTests {
    @Test
    public void Test1() {
      assertEquals("ABC", new Dubstep().SongDecoder("WUBWUBABCWUB"));
    }
    @Test
    public void Test2()
    {
       assertEquals("R L", new Dubstep().SongDecoder("RWUBWUBWUBLWUB"));
    }
    @Test
    public void Test3()
    {
       assertEquals("JKD WBIRAQKF YE WV", new Dubstep().SongDecoder("WUBJKDWUBWUBWBIRAQKFWUBWUBYEWUBWUBWUBWVWUBWUB"));
    }

    @Test
    public void Test4()
    {
     assertEquals("KSDHEMIXUJ R S H", new Dubstep().SongDecoder("WUBKSDHEMIXUJWUBWUBRWUBWUBWUBSWUBWUBWUBHWUBWUBWUB"));
    }

    @Test
    public void Test5()
    {
      assertEquals("Q QQ I WW JOPJPBRH", new Dubstep().SongDecoder("QWUBQQWUBWUBWUBIWUBWUBWWWUBWUBWUBJOPJPBRH"));
    }

    @Test
    public void Test6()
    {
      assertEquals("O IPVCQAFWY Q XHDKCPYKCTWWY V FZ", new Dubstep().SongDecoder("WUBWUBOWUBWUBWUBIPVCQAFWYWUBWUBWUBQWUBWUBWUBXHDKCPYKCTWWYWUBWUBWUBVWUBWUBWUBFZWUBWUB"));
    }

    @Test
    public void Test7()
    {
      assertEquals("YYRTSMNWU C C FSYUINDWOBV F AU V JB", new Dubstep().SongDecoder("WUBYYRTSMNWUWUBWUBWUBCWUBWUBWUBCWUBWUBWUBFSYUINDWOBVWUBWUBWUBFWUBWUBWUBAUWUBWUBWUBVWUBWUBWUBJB"));
    }

    @Test
    public void Test8()
    {
      assertEquals("KSDHEMIXUJ R S H", new Dubstep().SongDecoder("WUBKSDHEMIXUJWUBWUBRWUBWUBWUBSWUBWUBWUBHWUBWUBWUB"));
    }

    @Test
    public void Test9()
    {
      assertEquals("A", new Dubstep().SongDecoder("AWUBWUBWUB"));
    }

    @Test
    public void Test10()
    {
      assertEquals("A B C D", new Dubstep().SongDecoder("AWUBBWUBCWUBD"));
    }

    @Test
    public void Test11()
    {
      assertEquals("W U B", new Dubstep().SongDecoder("WUBWWUBWUBWUBUWUBWUBBWUB"));
    }

    @Test
    public void Test12()
    {
     assertEquals("WU BW UB", new Dubstep().SongDecoder("WUWUBBWWUBUB"));
    }

    @Test
    public void Test13()
    {
      assertEquals("WUAB", new Dubstep().SongDecoder("WUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUABWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUB"));
    }

    @Test
    public void Test14()
    {
      assertEquals("U", new Dubstep().SongDecoder("U"));
    }

    @Test
    public void Test15()
    {
      assertEquals("WU", new Dubstep().SongDecoder("WUWUB"));
    }

    @Test
    public void Test16()
    {
      assertEquals("UB",new Dubstep().SongDecoder("UBWUB"));
    }

    @Test
    public void Test17()
    {
      assertEquals("WU UB U",new  Dubstep().SongDecoder("WUWUBUBWUBUWUB"));
    }

    @Test
    public void Test18()
    {
      assertEquals("W A", new Dubstep().SongDecoder("WUBWWUBAWUB"));
    }

    @Test
    public void Test19()
    {
      assertEquals("WUUUUU",new  Dubstep().SongDecoder("WUUUUU"));
    }

    @Test
    public void Test20()
    {
     assertEquals("A", new Dubstep().SongDecoder("WUBWUBA"));
    }
}
*/
