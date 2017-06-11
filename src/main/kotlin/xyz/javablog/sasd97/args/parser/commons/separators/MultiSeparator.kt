package xyz.javablog.sasd97.args.parser.commons.separators

/**
 * Created by alexander on 11/06/2017.
 */
interface MultiSeparator<L, T> {
    fun changeDelimiter(delimiter: String): xyz.javablog.sasd97.args.parser.commons.separators.MultiSeparator<L, T>
    fun separate(lex: L): List<T>
}