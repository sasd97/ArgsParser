import org.junit.Assert
import org.junit.Before
import org.junit.Test
import xyz.javablog.sasd97.args.parser.ArgsParser
import xyz.javablog.sasd97.args.parser.extensions.getBoolean
import xyz.javablog.sasd97.args.parser.extensions.getInt
import xyz.javablog.sasd97.args.parser.extensions.getLong
import xyz.javablog.sasd97.args.parser.extensions.getString

/**
 * Created by alexander on 11/06/2017.
 */
class ArgsParserTest {

    @Test
    fun ArgsParser_analyzeBoolean_success() {
        val scheme = "bool:hello,bool:world"
        val args = arrayOf("-hello", "false", "-world", "true")
        val argsParser = ArgsParser
                .Builder()
                .setArgs(args)
                .setScheme(scheme)
                .build()

        Assert.assertEquals(false, argsParser.getBoolean("hello"))
        Assert.assertEquals(true, argsParser.getBoolean("world"))
    }

    @Test
    fun ArgsParser_analyzeCustomScheme1_success() {
        val scheme = "long:id,text:name,text:description,int:age,bool:isScholar"
        val args = arrayOf(
                "-id", "12",
                "-name", "alex",
                "-age", "22",
                "-isScholar", "true")

        val argsParser = ArgsParser
                .Builder()
                .setArgs(args)
                .setScheme(scheme)
                .build()

        Assert.assertEquals(12, argsParser.getLong("id"))
        Assert.assertEquals("alex", argsParser.getString("name"))
        Assert.assertEquals(22, argsParser.getInt("age"))
        Assert.assertEquals(true, argsParser.getBoolean("isScholar"))
    }
}