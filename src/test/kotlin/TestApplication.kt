import xyz.javablog.sasd97.args.parser.ArgsParser
import xyz.javablog.sasd97.args.parser.extensions.getInt
import xyz.javablog.sasd97.args.parser.extensions.getString

/**
 * Created by alexander on 11/06/2017.
 */

fun main(args: Array<String>) {
    val argsParser = ArgsParser.Builder()
            .setArgs(args)
            .setScheme("int:id,text:name,int:age")
            .build()

    print("id: ${argsParser.getInt("id")}\nname: ${argsParser.getString("name")}\nage: ${argsParser.getInt("age")}")
}