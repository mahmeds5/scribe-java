# scribe-java

Printing and formatting in Java is tedious. Scribe is a small toolbox of static methods that makes console output shorter and cleaner.

## Before / After
```java
// Without Scribe
System.out.println("Hello");
System.out.println();
System.out.print("Hi ");
System.out.print("Hi ");
System.out.print("Hi ");

// With Scribe
write("Hello");
b();
writesl("Hi", 3, true);
```

## Setup
1. Copy the `scribe` folder into your project's `src` folder
2. Add this import at the top of your file:
```java
import static scribe.Text.*;
```

## Methods

### Printing (new line)
| Method | What it does |
|---|---|
| `write(String s)` | Prints text, then a new line |
| `write(String s, int n)` | Prints the text `n` times, one per line |

### Printing (same line)
| Method | What it does |
|---|---|
| `writesl(String s)` | Prints text, stays on the same line |
| `writesl(String s, int n)` | Prints the text `n` times in a row |
| `writesl(String s, int n, boolean space)` | Same, with an optional space after each one |
| `writesl(String s, int n, boolean space, boolean divider)` | Same, with an optional `\|` divider |
| `writesl(String s, int n, boolean space, boolean divider, char c)` | Same, but you pick the divider character |

### Returning text (doesn't print)
| Method | What it does |
|---|---|
| `writeRet(String s)` | Returns the text as is (kinda useless, but it's there for consistency) |
| `writeRet(String s, int n)` | Returns the text repeated `n` times, no line breaks |
| `spaceRet()` / `spaceRet(int n)` | Returns one space / `n` spaces |

### Spacing
| Method | What it does |
|---|---|
| `b()` / `b(int n)` | Skips one line / `n` lines |
| `space()` / `space(int n)` | Prints one space / `n` spaces |

## Examples
```java
write("Hello", 2);                    // Hello
                                      // Hello
writesl("Hi", 3, true);               // Hi Hi Hi
writesl("Hi", 3, true, true);         // Hi | Hi | Hi |
writesl("-", 5, false, true, '+');    // -+-+-+-+-+
writesl("-", 5, true, true, '+');     // - + - + - + - + - +

String line = writeRet("=", 10);      // "=========="
write(line);                          // ==========
write("Name:" + spaceRet(3) + "Sam"); // Name:   Sam
```

## Notes
- `writesl` methods don't end the line. Use `b()` after them to move on.
- `writeRet` and `spaceRet` return a String, so you can store them or put them inside other text.
- `writeRet(String s)` just hands back what you give it. It's pretty useless on its own, but it's there so the `write` / `writeRet` pair stays matched.
- `writeRet(String s, int n)` joins the text with no line breaks, unlike `write(String s, int n)`, which prints one per line.
