# LMS

A small library management system built for the SEC321L software construction labs.

## Layout

    src/main/java/com/hitms/lms            the service, the exception and the entry point
    src/main/java/com/hitms/lms/util       shared helper methods
    labs/Lab-2, labs/Lab-3, labs/Lab-4    one folder per lab task

## Build

    mvn compile
    java -cp target/classes com.hitms.lms.Main

## Style

    mvn checkstyle:check

The rules live in `labs/Lab-2/Task-3/checkstyle.xml` and cover naming,
commenting and whitespace.
