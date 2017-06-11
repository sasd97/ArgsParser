package xyz.javablog.sasd97.args.parser.commons.verifiers

/**
 * Created by alexander on 11/06/2017.
 */
interface Verifier<V> {
    fun verify(verified: V): Boolean
}