# Kotlin Arguments Parser

Scheme builds by following rule:

__typeName:argName__

## Supported Types:

- Boolean __(alias: bool, boolean)__
- Integer __(alias: int, integer)__
- Long __(alias: long)__
- Double __(alias: float, double)__
- String __(alias: text, string)__


## Usage Example:

```kotlin
fun main(args: Array<String>) {
    val argsParser = ArgsParser.Builder()
            .setArgs(args)
            .setScheme("int:id,text:name,int:age")
            .build()

    print("id: ${argsParser.getInt("id")}\nname: ${argsParser.getString("name")}\nage: ${argsParser.getInt("age")}")
}
```

To run with passed args: __-id 1 -name alex -age 20__

Output

```text
TestApplicationKt -id 1 -name alex -age 20
id: 1
name: alex
age: 20
Process finished with exit code 0
```

## License

MIT License

Copyright (c) 2017 Alexander Dadukin

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.