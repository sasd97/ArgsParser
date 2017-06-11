import org.junit.Assert
import org.junit.Test
import xyz.javablog.sasd97.args.parser.syntax.separators.TokensPair
import xyz.javablog.sasd97.args.parser.syntax.separators.TokensPairSeparator
import xyz.javablog.sasd97.args.parser.syntax.separators.SeparatedPair
import xyz.javablog.sasd97.args.parser.syntax.separators.PairSeparator

/**
 * Created by alexander on 11/06/2017.
 */

class PairSeparatorTest {

    @Test
    fun tokensPair_obtainFirstValue_success() {
        val pair : SeparatedPair<String, String> = TokensPair()
        pair.setPair("hello", "world")
        Assert.assertEquals("hello", pair.getFirstOfPair())
    }

    @Test
    fun tokensPair_obtainSecondValue_success() {
        val pair : SeparatedPair<String, String> = TokensPair()
        pair.setPair("hello", "world")
        Assert.assertEquals("world", pair.getSecondOfPair())
    }

    @Test
    fun tokensPairSeparator_separateLexemeByComaAndObtainFirstValue_success() {
        val targetLexeme = "hello,world"
        val pairSeparator: PairSeparator<String, String, String> = TokensPairSeparator(",")
        val pair = pairSeparator.separate(targetLexeme)
        Assert.assertEquals("hello", pair.getFirstOfPair())
    }

    @Test
    fun tokensPairSeparator_separateLexemeByComaAndObtainSecondValue_success() {
        val targetLexeme = "hello,world"
        val pairSeparator: PairSeparator<String, String, String> = TokensPairSeparator(",")
        val pair = pairSeparator.separate(targetLexeme)
        Assert.assertEquals("world", pair.getSecondOfPair())
    }

    @Test
    fun tokensPairSeparator_separateLexemeByColonAndObtainFirstValue_success() {
        val targetLexeme = "hello:world"
        val pairSeparator: PairSeparator<String, String, String> = TokensPairSeparator(":")
        val pair = pairSeparator.separate(targetLexeme)
        Assert.assertEquals("hello", pair.getFirstOfPair())
    }

    @Test(expected = IllegalStateException::class)
    fun tokensPairSeparator_separateLexemeByColonWhichSeparatedByComa_throwsException() {
        val targetLexeme = "hello,world"
        val pairSeparator: PairSeparator<String, String, String> = TokensPairSeparator(":")
        val pair = pairSeparator.separate(targetLexeme)
    }
}