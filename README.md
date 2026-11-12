# LMS

A library management system built for the SEC321L software construction labs.

## Layout

    src/main/java/com/hitms/lms        the service, the item hierarchy and the patterns
    src/main/java/com/hitms/lms/util   shared helper methods
    src/test/java/com/hitms/lms        the JUnit 5 suite

## Build

    mvn clean install
    java -cp target/classes com.hitms.lms.Main

## Test

    mvn test

## Documentation

    mvn javadoc:javadoc      -> target/site/apidocs/index.html

## Style

    mvn checkstyle:check

## What each lab added

| Lab | What it introduced |
| --- | --- |
| 1-2 | the Maven project and the console entry point |
| 3 | the standard Maven layout and the shared helpers |
| 4 | checked exceptions and a file logger |
| 5 | member lookup and copy-count guards |
| 6 | a README, branches, a merge conflict and pull requests |
| 7 | `LibraryItem` as an abstract class, with `Book`, `DVD` and `Magazine` |
| 8 | the Singleton, Factory and Observer patterns |
| 9 | the JUnit 5 suite and its edge cases |
| 10 | a GitHub Actions pipeline that runs the style check and the tests |
| 11 | `FineCalculator`, with the magic numbers named and extracted |
| 12 | Javadoc completed across the library and the API docs generated |
| 13 | the comment audit fixes and the maintenance guide |

See `MAINTENANCE.md` for the commands a contributor needs.
