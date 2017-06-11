package xyz.javablog.sasd97.args.parser.commons.separators

/**
 * Created by alexander on 11/06/2017.
 */
interface PairSeparator<L, I1, I2> {
    fun changeDelimiter(delimiter: String): xyz.javablog.sasd97.args.parser.commons.separators.PairSeparator<L, I1, I2>
    fun separate(lex: L): SeparatedPair<I1, I2>
}