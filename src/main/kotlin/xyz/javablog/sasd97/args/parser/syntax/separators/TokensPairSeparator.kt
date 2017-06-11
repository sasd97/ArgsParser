package xyz.javablog.sasd97.args.parser.syntax.separators

import xyz.javablog.sasd97.args.parser.commons.separators.PairSeparator
import xyz.javablog.sasd97.args.parser.commons.separators.SeparatedPair

/**
 * Created by alexander on 11/06/2017.
 */
class TokensPairSeparator(private var delimiter: String) : PairSeparator<String, String, String> {

    override fun changeDelimiter(delimiter: String): PairSeparator<String, String, String> {
        this.delimiter = delimiter
        return this
    }

    override fun separate(lex: String): SeparatedPair<String, String> {
        val pair = TokensPair()
        val pairArray = lex.split(delimiter)
        if (pairArray.size != 2) throw IllegalStateException("Trying to separate multiple values into the pair. Lexeme: $lex")
        pair.setPair(pairArray[0], pairArray[1])
        return pair
    }
}