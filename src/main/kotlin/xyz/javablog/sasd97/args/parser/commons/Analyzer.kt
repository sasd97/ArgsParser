package xyz.javablog.sasd97.args.parser.commons

/**
 * Created by alexander on 11/06/2017.
 */
interface Analyzer<K, V> {
    fun makeAnalyze(): Analyzer<K, V>
    fun getAnalyzed(key: K): V
}