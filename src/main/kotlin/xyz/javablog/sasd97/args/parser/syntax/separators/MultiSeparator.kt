package xyz.javablog.sasd97.args.parser.syntax.separators

/**
 * Created by alexander on 11/06/2017.
 */
interface MultiSeparator<L, T> {
    fun changeDelimiter(delimiter: String): MultiSeparator<L, T>
    fun separate(lex: L): List<T>
}