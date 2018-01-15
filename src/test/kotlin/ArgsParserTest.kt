import org.junit.Assert
import org.junit.Before
import org.junit.Test
import xyz.javablog.sasd97.args.parser.ArgsParser
import xyz.javablog.sasd97.args.parser.extensions.*

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

    @Test
    fun ArgsParser_analyzeCustomScheme2_success() {
        val scheme = "text:name,double:version,boolean:isFree,text:license,text:core"
        val args = arrayOf(
                "-name", "Yandex.Browser",
                "-version", "2.001",
                "-isFree", "true",
                "-core", "blink",
                "-license", "Proprietary software")

        val argsParser = ArgsParser
                .Builder()
                .setArgs(args)
                .setScheme(scheme)
                .build()

        Assert.assertEquals("Yandex.Browser", argsParser.getString("name"))
        Assert.assertEquals(2.001, argsParser.getDouble("version"), 0.001)
        Assert.assertEquals(true, argsParser.getBoolean("isFree"))
        Assert.assertEquals("blink", argsParser.getString("core"))
        Assert.assertEquals("Proprietary software", argsParser.getString("license"))
    }
}