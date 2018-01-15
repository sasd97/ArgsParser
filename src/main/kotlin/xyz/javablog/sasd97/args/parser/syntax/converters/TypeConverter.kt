package xyz.javablog.sasd97.args.parser.syntax.converters

/**
 * Created by alexander on 11/06/2017.
 */

abstract class TypeConverter<T, out R>(vararg val typeTokens: T) {

    fun isApplicable(token: T): Boolean {
        return typeTokens.contains(token)
    }

    abstract fun convert(token: T): R
}