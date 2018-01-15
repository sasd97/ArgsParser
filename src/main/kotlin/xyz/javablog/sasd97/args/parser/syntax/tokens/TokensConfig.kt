package xyz.javablog.sasd97.args.parser.syntax.tokens

import xyz.javablog.sasd97.args.parser.syntax.converters.*

/**
 * Created by alexander on 11/06/2017.
 */

object TokensConfig {
    val TYPE_TOKENS = listOf(
            object: TypeConverter<String, Boolean>("bool", "boolean") {
                override fun convert(token: String) = token.toBoolean()
            },
            object: TypeConverter<String, Int>("int", "integer") {
                override fun convert(token: String) = token.toInt()
            },
            object: TypeConverter<String, Long>("long") {
                override fun convert(token: String) = token.toLong()
            },
            object: TypeConverter<String, Double>("float", "double") {
                override fun convert(token: String) = token.toDouble()
            },
            object: TypeConverter<String, String>("string", "text") {
                override fun convert(token: String) = token
            }
    )
}