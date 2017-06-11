package xyz.javablog.sasd97.args.parser.syntax.converters


/**
 * Created by alexander on 11/06/2017.
 */
class StringConverter(val typeToken: String): TokenConverter<String> {

    override fun isApplicable(token: String) = typeToken == token
    override fun convert(token: String) = token
}