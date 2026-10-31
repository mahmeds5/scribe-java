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

### Spacing
| Method | What it does |
|---|---|
| `b()` / `b(int n)` | Skips one line / `n` lines |
| `space()` / `space(int n)` | Prints one space / `n` spaces |
| `spaceRet()` / `spaceRet(int n)` | Returns one space / `n` spaces as a String (doesn't print) |

## Examples
```java
write("Hello", 2);                    // Hello
                                      // Hello
writesl("Hi", 3, true);               // Hi Hi Hi
writesl("Hi", 3, true, true);         // Hi | Hi | Hi |
writesl("-", 5, false, true, '+');    // -+-+-+-+-+
writesl("-", 5, true, true, '+');     // - + - + - + - + - +

write("Name:" + spaceRet(3) + "Sam"); // Name:   Sam
```

## Notes
- Methods that print on the same line (`writesl`) don't end the line. Use `b()` after them if you want to move on.
- `spaceRet` returns a String, so you can drop it inside other text.
