import org.junit.Assert
import org.junit.Test
import xyz.javablog.sasd97.args.parser.syntax.separators.LexemeMultiSeparator
import xyz.javablog.sasd97.args.parser.syntax.separators.MultiSeparator

/**
 * Created by alexander on 11/06/2017.
 */
class MultiSeparatorTest {

    @Test
    fun lexemeMultiSeparator_separateLexemesByComa_success() {
        val lexemes = "t1:k1,t2:k2,t3:k3,t4:k4"
        val multiSeparator: MultiSeparator<String, String> = LexemeMultiSeparator(",")
        Assert.assertEquals(4, multiSeparator.separate(lexemes).size)
    }
}