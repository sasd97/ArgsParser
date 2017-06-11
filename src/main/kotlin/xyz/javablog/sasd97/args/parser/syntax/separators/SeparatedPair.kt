package xyz.javablog.sasd97.args.parser.syntax.separators

/**
 * Created by alexander on 11/06/2017.
 */
interface SeparatedPair<I1, I2> {
    fun setPair(i1: I1, i2: I2)
    fun getFirstOfPair(): I1
    fun getSecondOfPair(): I2
}