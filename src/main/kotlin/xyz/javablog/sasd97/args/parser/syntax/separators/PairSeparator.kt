package xyz.javablog.sasd97.args.parser.syntax.separators

/**
 * Created by alexander on 11/06/2017.
 */
interface PairSeparator<L, I1, I2> {
    fun changeDelimiter(delimiter: String): PairSeparator<L, I1, I2>
    fun separate(lex: L): SeparatedPair<I1, I2>
}