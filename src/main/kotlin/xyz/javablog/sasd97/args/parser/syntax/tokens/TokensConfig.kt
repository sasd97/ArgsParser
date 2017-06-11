package xyz.javablog.sasd97.args.parser.syntax.tokens

import xyz.javablog.sasd97.args.parser.syntax.converters.BooleanConverter
import xyz.javablog.sasd97.args.parser.syntax.converters.TokenConverter
import xyz.javablog.sasd97.args.parser.syntax.tokens.TypeTokens.BOOLEAN_TYPE_TOKEN

/**
 * Created by alexander on 11/06/2017.
 */
object TokensConfig {
    val LEXEME_DELIMITER = ","
    val TYPE_KEY_DELIMITER = ":"

    public val TYPE_TOKENS = listOf<TokenConverter<Any>>(
            BooleanConverter(BOOLEAN_TYPE_TOKEN)
    )
}