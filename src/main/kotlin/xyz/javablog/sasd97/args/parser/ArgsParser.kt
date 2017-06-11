package xyz.javablog.sasd97.args.parser

import xyz.javablog.sasd97.args.parser.syntax.SchemeAnalyzer

/**
 * Created by alexander on 10/06/2017.
 */

open class ArgsParser(scheme: String, args: Array<String>) {

    private val schemeAnalyzer = SchemeAnalyzer(scheme).build()
    private val keyValueMap = mutableMapOf<String, Any>()

    protected fun getKeyConverter(key: String) = schemeAnalyzer.get(key)

    public fun get(key: String): Any {
        val value = keyValueMap[key]
        if (value == null) throw IllegalStateException("There is cannot be null values in map by key $key")
        return value
    }

}
