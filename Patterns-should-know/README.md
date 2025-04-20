# Design Patterns Every Developer Should Know

This repository provides comprehensive implementations and explanations of essential design patterns in Java. Each pattern includes detailed code examples, practical use cases, and explanations to help developers understand when and how to apply these patterns effectively.

## Table of Contents

- [Introduction](#introduction)
- [Creational Patterns](#creational-patterns)
- [Structural Patterns](#structural-patterns)
- [Behavioral Patterns](#behavioral-patterns)
- [How to Use This Repository](#how-to-use-this-repository)
- [Contributing](#contributing)

## Introduction

Design patterns are proven solutions to recurring problems in software design. They represent best practices evolved over time by experienced software developers. This repository organizes patterns according to the classic categorization from the Gang of Four (GoF):

- **Creational Patterns**: Concerned with object creation mechanisms
- **Structural Patterns**: Deal with object composition and relationships
- **Behavioral Patterns**: Focus on communication between objects

Each pattern includes:
- Description and intent
- Problem statement it addresses
- Solution overview
- Complete Java implementation with multiple variants where appropriate
- Real-world practical examples
- Client code demonstrating usage

## Creational Patterns

### Singleton Pattern

The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it. This pattern is useful when exactly one object is needed to coordinate actions across the system, such as configuration managers, connection pools, or caches. Various implementations (eager, lazy, thread-safe, and enum-based) address different requirements for initialization timing and thread safety.

**Implementations:**
- Eager initialization
- Lazy initialization
- Thread-safe implementation
- Enum-based implementation

### Factory Method Pattern

The Factory Method Pattern defines an interface for creating objects but lets subclasses decide which classes to instantiate. It promotes loose coupling by eliminating the need to bind application-specific classes into the code. This pattern is widely used in frameworks, libraries, and applications where a component needs to create objects without knowing their concrete types.

**Implementations:**
- Basic factory method
- Document creation example
- Parameterized factory methods
- Abstract creator with concrete factories

### Abstract Factory Pattern

The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes. This pattern is particularly useful when a system needs to be independent from how its products are created, composed, and represented. Common applications include UI toolkits, cross-platform frameworks, and systems requiring consistent theming across components.

**Implementations:**
- UI toolkit example (light/dark themes)
- Cross-platform component creation
- Database connector families

### Builder Pattern

The Builder Pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations. This pattern is especially valuable when creating objects with numerous parameters, optional components, or complex internal structures. Modern implementations often leverage fluent interfaces for enhanced readability and usability.

**Implementations:**
- Traditional builder with director
- Fluent interface builder
- Nested builder implementation
- Builder with required/optional parameters

### Prototype Pattern

The Prototype Pattern creates new objects by copying existing ones, known as prototypes, thus avoiding the need for explicit class dependencies. This pattern is useful when the cost of creating an object is more expensive than copying an existing one, or when objects have numerous configurations that would be cumbersome to set up repeatedly through constructors.

**Implementations:**
- Basic cloning example
- Deep vs. shallow copy demonstration
- Document prototype system
- Registry of prototypes

## Structural Patterns

### Adapter Pattern

The Adapter Pattern converts the interface of a class into another interface clients expect, enabling classes to work together that couldn't otherwise due to incompatible interfaces. This pattern is commonly used in system integration, working with legacy code, or creating wrappers for third-party libraries. Both class adapters (using inheritance) and object adapters (using composition) provide flexibility in different contexts.

**Implementations:**
- Class adapter using inheritance
- Object adapter using composition
- Media player adaptation example
- Legacy system integration

### Bridge Pattern

The Bridge Pattern separates an abstraction from its implementation so that the two can vary independently. This pattern involves an interface acting as a bridge between the abstract class and implementation classes, reducing code duplication and improving extensibility. It's particularly useful in cross-platform applications, graphics libraries, and driver implementations where multiple variations exist across multiple dimensions.

**Implementations:**
- Remote controls and devices example
- Drawing API with multiple shapes
- Enterprise messaging system

### Composite Pattern

The Composite Pattern composes objects into tree structures to represent part-whole hierarchies, allowing clients to treat individual objects and compositions of objects uniformly. This pattern simplifies client code when dealing with hierarchical structures like file systems, organizational structures, or graphical user interfaces where groups of objects should be treated the same way as individual objects.

**Implementations:**
- File system directory/file structure
- Organization employee hierarchy
- Graphical shape grouping

### Decorator Pattern

The Decorator Pattern attaches additional responsibilities to objects dynamically without modifying their structure. By using composition instead of inheritance, it provides a flexible alternative to subclassing for extending functionality. Common applications include I/O streams, UI component enhancement, and permission systems where responsibilities can be layered incrementally.

**Implementations:**
- Coffee shop example with condiments
- Text formatting enhancements
- Window component decorators

### Facade Pattern

The Facade Pattern provides a simplified interface to a complex subsystem, making it easier to use. This pattern doesn't encapsulate the subsystem but rather provides a unified entry point, reducing dependencies and promoting loose coupling. It's widely used in library interfaces, API design, and system integration where complexity needs to be hidden from client code.

**Implementations:**
- Computer startup/shutdown example
- Banking system with multiple subsystems
- Media conversion library

### Proxy Pattern

The Proxy Pattern provides a surrogate or placeholder for another object to control access to it. Different types of proxies serve various purposes: protection proxies control access rights, virtual proxies delay expensive operations until needed, remote proxies represent objects in different address spaces, and caching proxies store results of expensive operations. This pattern is essential in resource management, access control, and distributed systems.

**Implementations:**
- Virtual proxy for image loading
- Protection proxy for document access control
- Caching proxy for expensive operations
- Remote proxy for service access

## Behavioral Patterns

### Observer Pattern

The Observer Pattern establishes a one-to-many dependency between objects so that when one object (the subject) changes state, all its dependents (observers) are notified and updated automatically. This pattern is commonly used in event handling systems, publish-subscribe architectures, and MVC frameworks where loose coupling between related components is essential.

**Implementations:**
- News agency and subscribers example
- Event handling system
- Stock market price notifications
- Weather monitoring system

### Strategy Pattern

The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. It allows the algorithm to vary independently from clients that use it, enabling runtime selection of appropriate algorithms based on different contexts or requirements. Common applications include payment processing systems, sorting mechanisms, and validation frameworks.

**Implementations:**
- Payment processing strategies
- Navigation routing algorithms
- Text compression algorithms
- Sorting strategy selection

### Command Pattern

The Command Pattern encapsulates a request as an object, allowing you to parameterize clients with different requests, queue or log requests, and support undoable operations. By decoupling the object that invokes an operation from the one that knows how to perform it, this pattern promotes flexibility and extensibility in systems requiring command history, undo functionality, or transactional behavior.

**Implementations:**
- Remote control with device commands
- Text editor with undo support
- Transaction processing system
- Job queue implementation

### Template Method Pattern

The Template Method Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. It lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure. This pattern is useful for implementing frameworks where invariant parts of an algorithm can be defined once while allowing customization of variable parts through inheritance.

**Implementations:**
- Data mining process framework
- Document generation system
- Build automation process
- Game development framework

### Iterator Pattern

The Iterator Pattern provides a way to access elements of an aggregate object sequentially without exposing its underlying representation. By separating the traversal behavior from the collection implementation, this pattern enables uniform access to different data structures and supports multiple concurrent traversals. It's fundamental to collection libraries and data processing systems.

**Implementations:**
- Custom collection iterators
- Tree traversal implementations
- Database result set iteration
- Social network connection traversal

### State Pattern

The State Pattern allows an object to alter its behavior when its internal state changes, appearing to change its class. By encapsulating state-specific behavior in separate state classes and delegating behavior to the current state object, this pattern eliminates the need for large conditional statements and makes state transitions explicit. It's commonly used in workflow management, game development, and UI control systems.

**Implementations:**
- Package delivery tracking system
- Document approval workflow
- Vending machine states
- Game character behavior states

## How to Use This Repository

Each pattern is contained in its own directory with the following structure:

```       
├── src/main/java/com/vladproduction    # Java source files 
│   ├── behavioral/                        
│   ├── creational/            
│   └── structural/            
├── README.md                           # Detailed explanation and usage instructions
```

To run the examples:
1. Clone this repository
2. Navigate to the pattern directory of interest
3. Compile and run the example client code

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-pattern`)
3. Commit your changes (`git commit -m 'Add some amazing pattern'`)
4. Push to the branch (`git push origin feature/amazing-pattern`)
5. Open a Pull Request

The code is organized to be educational and reference-quality, following Java best practices and design principles.