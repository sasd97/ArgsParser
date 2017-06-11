package xyz.javablog.sasd97.args.parser.syntax.converters


/**
 * Created by alexander on 11/06/2017.
 */
class BooleanConverter(val typeToken: String): TokenConverter<Boolean> {

    override fun isApplicable(token: String) = typeToken == token
    override fun convert(token: String) = token.toBoolean()
}