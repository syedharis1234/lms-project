# LMS

A library management system built for the SEC321L software construction labs.

## Layout

    src/main/java/com/hitms/lms        the service, the exceptions and the entry point
    src/main/java/com/hitms/lms/util   shared helper methods

## Build

    mvn compile
    java -cp target/classes com.hitms.lms.Main

## Style

    mvn checkstyle:check
