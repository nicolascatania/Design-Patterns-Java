# Design Patterns in Java
In this project, I explain some design patterns and provide example code.

## Factory Method
The Factory Method pattern (a creational pattern) is useful for encapsulating object creation logic. It allows you to delegate the instantiation of objects to a specific "concrete factory method," providing cleaner and more understandable code. This concept is explained in detail through comments in the code, which includes an engaging scenario where the specific class to instantiate is not known in advance. One downside of this design pattern is that it can lead to a proliferation of classes in your project.

## Abstract Factory Method
The Abstract Factory pattern uses polymorphism and interfaces to allow the instantiation of objects that are related by family without specifying their concrete classes. This reduces coupling and enhances flexibility, enabling the application to work with different families of objects seamlessly. This pattern is particularly useful in scenarios where the system needs to be independent of the way the objects are created, composed, and represented, allowing for easier maintenance and scalability.

## Composite
The Composite pattern lets you manipulate multiple instances of different object types that are related through inheritance simultaneously. For example, think of an army with different types of soldiers or translating various shapes (like selecting multiple forms in a drawing application and moving all of them at the same time).

## Advantages
Simplicity: Allows you to treat individual objects and composites uniformly.
Flexibility: Makes it easy to add new component types without modifying existing code.
Singleton
This pattern focuses on allowing only one instance of a certain class to be created during the program's life cycle. It is useful for scenarios like managing files, where you don't want multiple components accessing the file simultaneously. I cover this scenario in a simple way in the code.

## Iterator
The Iterator pattern encapsulates the behavior of iterating through a collection (such as an array, tree, list, or matrix). The logic for iteration is encapsulated within an iterator class, allowing us to use a simple for-each loop wherever needed in our application.

### Cool Sites I've Researched to Learn Design Patterns
- https://refactoring.guru/es/design-patterns
- https://www.youtube.com/@BettaTech
