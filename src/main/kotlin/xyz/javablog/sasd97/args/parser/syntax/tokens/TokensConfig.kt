package xyz.javablog.sasd97.args.parser.syntax.tokens

import xyz.javablog.sasd97.args.parser.syntax.converters.*
import xyz.javablog.sasd97.args.parser.syntax.tokens.TypeTokens.BOOLEAN_TYPE_TOKEN
import xyz.javablog.sasd97.args.parser.syntax.tokens.TypeTokens.INTEGER_TYPE_TOKEN
import xyz.javablog.sasd97.args.parser.syntax.tokens.TypeTokens.LONG_TYPE_TOKEN
import xyz.javablog.sasd97.args.parser.syntax.tokens.TypeTokens.STRING_TYPE_TOKEN
import xyz.javablog.sasd97.args.parser.syntax.tokens.TypeTokens.STRING_TYPE_TOKEN_ALT

/**
 * Created by alexander on 11/06/2017.
 */
object TokensConfig {
    public val TYPE_TOKENS = listOf<TokenConverter<Any>>(
            BooleanConverter(BOOLEAN_TYPE_TOKEN),
            IntegerConverter(INTEGER_TYPE_TOKEN),
            LongConverter(LONG_TYPE_TOKEN),
            StringConverter(STRING_TYPE_TOKEN),
            StringConverter(STRING_TYPE_TOKEN_ALT)
    )
}