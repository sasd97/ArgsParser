import org.junit.Assert
import org.junit.Test
import xyz.javablog.sasd97.args.parser.analytics.verifiers.CommandFlagVerifier
import xyz.javablog.sasd97.args.parser.commons.Defaults.COMMAND_ARGUMENT_FLAG
import xyz.javablog.sasd97.args.parser.commons.verifiers.Verifier

/**
 * Created by alexander on 11/06/2017.
 */

class VerifierTest {

    @Test
    fun commandFlagVerifier_passCommandFlag_successVerification() {
        val currentFlag = "-t"
        val commandFlagVerifier: Verifier<String> = CommandFlagVerifier(COMMAND_ARGUMENT_FLAG)
        Assert.assertEquals(true, commandFlagVerifier.verify(currentFlag))
    }

    @Test
    fun commandFlagVerifier_passNonCommandFlag_unsuccessVerification() {
        val currentFlag = "t"
        val commandFlagVerifier: Verifier<String> = CommandFlagVerifier(COMMAND_ARGUMENT_FLAG)
        Assert.assertEquals(false, commandFlagVerifier.verify(currentFlag))
    }
}