import org.junit.Assert
import org.junit.Before
import org.junit.Test
import xyz.javablog.sasd97.args.parser.ArgsParser
import xyz.javablog.sasd97.args.parser.extensions.getBoolean

/**
 * Created by alexander on 11/06/2017.
 */
class ArgsParserTest {

    @Test
    fun ArgsParser_analyzeBoolean_success() {
        val scheme = "bool:hello,bool:world"
        val args = arrayOf("-hello", "false", "-world", "true")
        val argsParser = ArgsParser
                .Builder
                .setArgs(args)
                .setScheme(scheme)
                .build()

        Assert.assertEquals(false, argsParser.getBoolean("hello"))
        Assert.assertEquals(true, argsParser.getBoolean("world"))
    }
}