package xyz.javablog.sasd97.args.parser.extensions

import xyz.javablog.sasd97.args.parser.ArgsParser

/**
 * Created by alexander on 11/06/2017.
 */

fun ArgsParser.getBoolean(key: String) = this.get(key) as Boolean
fun ArgsParser.getInt(key: String) = this.get(key) as Int
fun ArgsParser.getLong(key: String) = this.get(key) as Long
fun ArgsParser.getString(key: String) = this.get(key) as String
fun ArgsParser.getDouble(key: String) = this.get(key) as Double