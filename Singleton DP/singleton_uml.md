# Singleton Design Pattern — UML Class Diagram (Mermaid)

## Before (No Singleton — Multiple Instances)

```mermaid
classDiagram
    class DatabaseConnection {
        +DatabaseConnection()
        +executeQuery(sql: String) void
    }

    class Main {
        +main(args: String[]) void
    }

    Main ..> DatabaseConnection : creates multiple instances
```

## After (Singleton Pattern — Single Instance)

```mermaid
classDiagram
    class DatabaseSingleton {
        -static DatabaseSingleton instance
        -DatabaseSingleton()
        +static getInstance() DatabaseSingleton
        +executeQuery(sql: String) void
    }

    class Main {
        +main(args: String[]) void
    }

    Main ..> DatabaseSingleton : uses getInstance()
    DatabaseSingleton --> DatabaseSingleton : static instance
```

## Complete Singleton Pattern (Generic UML)

```mermaid
classDiagram
    class Singleton {
        -static Singleton instance
        -Singleton()
        +static getInstance() Singleton
        +operation() void
    }

    class Client {
        +main() void
    }

    Singleton --> Singleton : «creates single instance»
    Client ..> Singleton : calls getInstance()

    note for Singleton "Constructor is PRIVATE\nOnly one instance exists\nGlobal access via getInstance()"
```
