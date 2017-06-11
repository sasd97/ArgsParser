package xyz.javablog.sasd97.args.parser.syntax

import xyz.javablog.sasd97.args.parser.commons.Analyzer
import xyz.javablog.sasd97.args.parser.syntax.converters.TokenConverter
import xyz.javablog.sasd97.args.parser.commons.separators.MultiSeparator
import xyz.javablog.sasd97.args.parser.commons.separators.PairSeparator
import xyz.javablog.sasd97.args.parser.syntax.tokens.TokensConfig.TYPE_TOKENS

/**
 * Created by alexander on 10/06/2017.
 */

// default scheme: type#1:key#1,type#2:key#2
class SchemeAnalyzer(private val scheme: String,
                     private val lexemeSeparator: MultiSeparator<String, String>,
                     private val typeKeySeparator: PairSeparator<String, String, String>) : Analyzer<String, TokenConverter<Any>?> {

    private val typeConvertersMap = mutableMapOf<String, TokenConverter<Any>>()

    public fun get(key: String): TokenConverter<Any>? {
        return typeConvertersMap[key]
    }

    override fun getAnalyzed(key: String) = get(key)

    override fun makeAnalyze(): SchemeAnalyzer {
        separateSchemeToTypeKeyScheme()
                .forEach {
                    val pair = separateTypeAndKeySchemeToPair(it)
                    val converter = findConverterByType(pair.getFirstOfPair())
                    typeConvertersMap.put(pair.getSecondOfPair(), converter)
                }

        return this
    }

    private fun separateSchemeToTypeKeyScheme() = lexemeSeparator.separate(scheme)
    private fun separateTypeAndKeySchemeToPair(typeKeyPair: String) = typeKeySeparator.separate(typeKeyPair)

    private fun findConverterByType(type: String): TokenConverter<Any> {
        val converter = TYPE_TOKENS.find {
            return@find it.isApplicable(type)
        }

        if (converter == null) throw IllegalArgumentException("There is no type token matches your type $type")
        return converter
    }
}