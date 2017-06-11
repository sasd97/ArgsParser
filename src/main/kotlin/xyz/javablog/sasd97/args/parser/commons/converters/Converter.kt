package xyz.javablog.sasd97.args.parser.commons.converters

/**
 * Created by alexander on 11/06/2017.
 */
interface Converter<in I, out O> {
    fun convert(c: I): O
}