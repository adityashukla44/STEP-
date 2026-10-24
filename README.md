# OOPS Banner App

A Java program that prints the word **OOPS** as an ASCII-art banner. It was built through eight use cases, each refactoring the previous version to use a new Java feature, and each developed on its own feature branch before being merged into `dev`.

## Usage

You need a JDK (8 or later).

```bash
javac OOPSBannerApp.java
java OOPSBannerApp
```

## Sample output

```
 ***    ***   ****    *** 
*   *  *   *  *   *  *    
*   *  *   *  ****    *** 
*   *  *   *  *          *
 ***    ***   *       *** 
```

## Use cases

| UC | Branch | What it adds |
|----|--------|--------------|
| UC1 | `feature/UC1` | Prints "OOPS" to the console |
| UC2 | `feature/UC2` | Prints the word as an ASCII-art banner, one line at a time |
| UC3 | `feature/UC3` | Builds each banner line with `String.join()` |
| UC4 | `feature/UC4` | Stores the lines in a `String` array and prints them with an enhanced `for` loop |
| UC5 | `feature/UC5` | Switches to inline array initialization |
| UC6 | `feature/UC6` | Moves each letter's pattern into its own static helper method |
| UC7 | `feature/UC7` | Stores letter patterns in a `CharacterPatternMap` inner class |
| UC8 | `feature/UC8` | Looks up letter patterns from a `HashMap<Character, String[]>` |

## Branching workflow

- `dev` is the integration branch and holds the latest version (UC8).
- Each `feature/UCn` branch contains exactly one use case and was merged into `dev` when complete.
- Commit messages follow the `feat(UCn): description` convention.

## Author

**Aditya Shukla** · [@adityashukla44](https://github.com/adityashukla44)
