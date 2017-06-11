package xyz.javablog.sasd97.args.parser

import xyz.javablog.sasd97.args.parser.syntax.SchemeAnalyzer
import xyz.javablog.sasd97.args.parser.syntax.separators.LexemeMultiSeparator
import xyz.javablog.sasd97.args.parser.syntax.separators.TokensPairSeparator
import xyz.javablog.sasd97.args.parser.syntax.tokens.TokensConfig.LEXEME_DELIMITER
import xyz.javablog.sasd97.args.parser.syntax.tokens.TokensConfig.TYPE_KEY_DELIMITER

/**
 * Created by alexander on 10/06/2017.
 */

open class ArgsParser private constructor(builder: Builder) {

    private var lexemeDelimiter: String
    private var typeKeyDelimiter: String
    private var schemeAnalyzer: SchemeAnalyzer
    private val keyValueMap = mutableMapOf<String, Any>()

    init {
        lexemeDelimiter = builder.lexemeDelimiter
        typeKeyDelimiter = builder.typeKeyDelimiter

        schemeAnalyzer = SchemeAnalyzer(scheme,
                LexemeMultiSeparator(lexemeDelimiter),
                TokensPairSeparator(typeKeyDelimiter))
    }

    protected fun getKeyConverter(key: String) = schemeAnalyzer.get(key)

    public fun get(key: String): Any {
        val value = keyValueMap[key]
        if (value == null) throw IllegalStateException("There is cannot be null values in map by key $key")
        return value
    }

    companion object Builder {
        private var lexemeDelimiter: String = LEXEME_DELIMITER
        private var typeKeyDelimiter: String = TYPE_KEY_DELIMITER

        private lateinit var scheme: String
        private lateinit var args: Array<String>

        public fun setLexemeDelimiter(lexemeDelimiter: String): Builder {
            this.lexemeDelimiter = lexemeDelimiter
            return this
        }

        public fun setTypeKeyDelimiter(typeKeyDelimiter: String): Builder {
            this.typeKeyDelimiter = typeKeyDelimiter
            return this
        }

        public fun setScheme(scheme: String): Builder {
            this.scheme = scheme
            return this
        }

        public fun setArgs(args: Array<String>): Builder {
            this.args = args
            return this
        }

        public fun build(): ArgsParser = ArgsParser(this)
    }
}
