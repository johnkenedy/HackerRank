# HackerRank Practice

Pure Kotlin/JVM module for interview prep — fast iteration, no Android overhead.

## Structure

```
practice/src/
├── main/kotlin/<topic>/<Problem>.kt   # solution + main() for quick paste-and-run
└── test/kotlin/<topic>/<Problem>Test.kt
```

Topics: `arrays`, `strings`, `hashmaps`, `linkedlists`, `stacks`, `trees`, `graphs`,
`sorting`, `searching`, `dp`, `greedy`, `recursion`, `bitmanip`, `math`.

## Workflow per problem

1. Create `<topic>/<Problem>.kt` with the function + a `main()` that runs HackerRank's sample input.
2. Create `<topic>/<Problem>Test.kt` covering: happy path, edge cases (empty, single element,
   negatives, duplicates), and a max-constraint case if time/space matters.
3. Iterate with the green ▶ in Android Studio.

## Running

- **One solution**: click ▶ next to `main()` in the `.kt` file.
- **One test class**: click ▶ next to the class name.
- **One test method**: click ▶ in the gutter of that `@Test`.
- **All tests**: `./gradlew :practice:test`
- **Single class via CLI**: `./gradlew :practice:test --tests "arrays.TwoSumTest"`

## After adding the module

In Android Studio: **File → Sync Project with Gradle Files** so the new `:practice` module
appears in the project view.
