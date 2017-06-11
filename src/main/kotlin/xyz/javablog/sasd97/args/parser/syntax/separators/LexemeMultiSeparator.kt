package xyz.javablog.sasd97.args.parser.syntax.separators

/**
 * Created by alexander on 11/06/2017.
 */
class LexemeMultiSeparator(private var delimiter: String): MultiSeparator<String, String> {
    override fun changeDelimiter(delimiter: String): MultiSeparator<String, String> {
        this.delimiter = delimiter
        return this
    }

    override fun separate(lex: String) = lex.split(delimiter)
}