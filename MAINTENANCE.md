# LMS Project - Maintenance Guide

## Build

    mvn clean install

## Test

    mvn test

## Run

    java -cp target/classes com.hitms.lms.Main

## Documentation

    mvn javadoc:javadoc

Then open `target/site/apidocs/index.html` in a browser.

## Notes for contributors

- All checked exceptions must extend `Exception` and carry a clear message.
- New `LibraryItem` subtypes must be registered in `LibraryItemFactory`.
- New `LoanObserver` implementations must be registered on the `Loan`.
- Utility classes take a private constructor and expose static helpers only.
- Serializable classes declare a fixed `serialVersionUID`.
- Run `mvn checkstyle:check` before opening a pull request.
- The CI workflow on `.github/workflows/ci.yml` runs the style check and the
  test suite on every push to `main`.

## Where things live

| Path | What it holds |
| --- | --- |
| `src/main/java/com/hitms/lms` | the service, the item hierarchy and the patterns |
| `src/main/java/com/hitms/lms/util` | shared helper methods |
| `src/test/java/com/hitms/lms` | the JUnit 5 suite |
