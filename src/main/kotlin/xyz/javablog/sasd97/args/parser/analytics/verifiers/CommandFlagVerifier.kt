package xyz.javablog.sasd97.args.parser.analytics.verifiers

import xyz.javablog.sasd97.args.parser.commons.verifiers.Verifier

/**
 * Created by alexander on 11/06/2017.
 */
class CommandFlagVerifier(var commandArgumentFlag: String): Verifier<String> {
    override fun verify(verified: String): Boolean = verified.contains(commandArgumentFlag)
}