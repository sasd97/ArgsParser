package xyz.javablog.sasd97.args.parser.analytics.converters

import xyz.javablog.sasd97.args.parser.commons.converters.Projector

/**
 * Created by alexander on 11/06/2017.
 */

class CommandFlagToKeyConverter(private val commandArgumentFlag: String): Projector<String> {
    override fun convert(c: String): String = c.replace(commandArgumentFlag, "")
}