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
1. Copy the `scribe` folder into your `src` folder
2. Add the imports you need at the top of your file:
```java
import static scribe.Text.*;
import static scribe.Draw.*;
```

## Text
| Method | What it does |
|---|---|
| `write(String s)` | Prints text, then a new line |
| `write(String s, int n)` | Prints the text `n` times, one per line |
| `writesl(String s)` | Prints text on the same line |
| `writesl(String s, int n)` | Prints the text `n` times on one line |
| `writesl(String s, int n, boolean space)` | Same, with an optional space after each one |
| `writesl(String s, int n, boolean space, boolean divider)` | Same, with optional space and `\|` divider |
| `b()` / `b(int n)` | Skips one line / `n` lines |
| `space()` / `space(int n)` | Prints one space / `n` spaces |

## Draw
| Method | What it does |
|---|---|
| `border(String s, int n, boolean space, boolean divider, char c)` | Repeats `s` `n` times with an optional space and a custom divider char, then ends the line |

## Examples
```java
writesl("Hi", 3, true);              // Hi Hi Hi
writesl("Hi", 3, true, true);        // Hi | Hi | Hi |
border("-", 5, true, true, '+');     // - + - + - + - + - +
```
