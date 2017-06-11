package xyz.javablog.sasd97.args.parser.syntax.converters


/**
 * Created by alexander on 11/06/2017.
 */
class IntegerConverter(val typeToken: String): TokenConverter<Int> {

    override fun isApplicable(token: String) = typeToken == token
    override fun convert(token: String) = token.toInt()
}