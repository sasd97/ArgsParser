package xyz.javablog.sasd97.args.parser.analytics

import xyz.javablog.sasd97.args.parser.analytics.verifiers.CommandFlagVerifier
import xyz.javablog.sasd97.args.parser.commons.Analyzer
import xyz.javablog.sasd97.args.parser.commons.converters.Projector
import xyz.javablog.sasd97.args.parser.commons.verifiers.Verifier
import xyz.javablog.sasd97.args.parser.syntax.SchemeAnalyzer
import xyz.javablog.sasd97.args.parser.syntax.converters.TokenConverter

/**
 * Created by alexander on 11/06/2017.
 */
class ArgumentsAnalyzer(private val args: Array<String>,
                        private val commandFlagVerifier: Verifier<String>,
                        private val commandFlagConverter: Projector<String>,
                        private val schemeAnalyzer: Analyzer<String, TokenConverter<Any>?>): Analyzer<String, Any?> {

    private val keyValueMap = mutableMapOf<String, Any>()

    override fun getAnalyzed(key: String): Any? = keyValueMap[key]

    override fun makeAnalyze(): Analyzer<String, Any?> {
        var i = 0

        while(i < args.size) {
            if (i == args.size - 1) break
            if (!commandFlagVerifier.verify(args[i])) {
                i++
                continue
            }

            if (commandFlagVerifier.verify(args[i + 1])) {
                i++
                continue
            }

            makePair(i)
            i++
        }

        return this
    }

    private fun makePair(i: Int) {
        val key = commandFlagConverter.convert(args[i])
        val valueConverter = schemeAnalyzer.getAnalyzed(key)
        if (valueConverter == null) throw IllegalArgumentException("There is no key in scheme that match ${args[i]}")
        val value = valueConverter.convert(args[i + 1])
        keyValueMap.put(key, value)
    }
}