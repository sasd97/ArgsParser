package xyz.javablog.sasd97.args.parser.syntax.separators

import xyz.javablog.sasd97.args.parser.commons.separators.SeparatedPair

/**
 * Created by alexander on 11/06/2017.
 */
class TokensPair : SeparatedPair<String, String> {

    private lateinit var firstLexeme: String
    private lateinit var secondLexeme: String

    override fun setPair(i1: String, i2: String) {
        this.firstLexeme = i1
        this.secondLexeme = i2
    }

    override fun getFirstOfPair(): String = firstLexeme
    override fun getSecondOfPair(): String = secondLexeme
}