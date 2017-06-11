package xyz.javablog.sasd97.args.parser.syntax.converters

/**
 * Created by alexander on 11/06/2017.
 */
interface TypeConverter<in T, out R> {
    fun isApplicable(token: T): Boolean
    fun convert(token: T): R
}