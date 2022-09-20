# Java Loom Virtual Threads

## JEP 425

https://openjdk.org/jeps/425

https://www.heise.de/news/Java-19-verbessert-die-Nebenlaeufigkeit-mit-virtuellen-Threads-aus-Project-Loom-7269453.html

## Virtual Threads

Compile the Main.java with preview enabled and release 19.

```
javac --enable-preview --release 19 -d target/classes src/main/java/com/joel/java/Main.java
```

Run the Main.class with preview enabled and release 19.

```
(cd target/classes && java --enable-preview com.joel.java.Main --enable-preview)
```

## Executor Service

https://www.baeldung.com/java-start-thread

https://download.java.net/java/early_access/loom/docs/api/java.base/java/util/concurrent/ExecutorService.html