import org.junit.Assert
import org.junit.Test
import xyz.javablog.sasd97.args.parser.analytics.converters.CommandFlagToKeyConverter
import xyz.javablog.sasd97.args.parser.commons.Defaults
import xyz.javablog.sasd97.args.parser.commons.converters.Projector

/**
 * Created by alexander on 11/06/2017.
 */
class ConverterTest {

    @Test
    fun commandFlagToKeyConverter_passCommandFlag_successConvertToKey() {
        val commandFlag = "-t"
        val commandFlagConverter: Projector<String> = CommandFlagToKeyConverter(Defaults.COMMAND_ARGUMENT_FLAG)
        Assert.assertEquals("t", commandFlagConverter.convert(commandFlag))
    }
}