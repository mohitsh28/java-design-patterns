# java-design-patterns

Creational Design Patterns:
1.Factory: Object for creating other objects. Static Methods used for creating and returning objects. Focus on code and
implementation rather than object management / initialization.

2.Builder: Anti-Pattern -> Telescoping Constructor:Increase of object parameters which leads to exponential list of
constructors. Solution to this is Builder Design Pattern. Instead of using numerous constructors, builder uses another
object. A builder that receives each initialization parameter step by step and returns the constructed object at once.

3. Singleton: Singleton Patterns ensure that the class can have only one existing instance per Java classLoader instance
   and provides global access to it. Risky is setting up in Distributed environment and can be tricky to debug the same.
   A single ClassLoader is easy to work with.

Structural Patterns:

1. Decorator: The Decorator pattern is a more flexible alternative to subclassing. The Decorator class implements the
   same interface as the target and uses composition to "decorate" calls to the target. Using the Decorator pattern it
   is possible to change the behavior of the class during runtime.
   
Behavioural Patterns:

1. Strategy: The LambdaStrategy pattern (also known as the policy pattern) is a software design pattern that enables an
   algorithm's behavior to be selected at runtime. Before Java 8 the Strategies needed to be separate classes forcing
   the developer to write lots of boilerplate code. With modern Java it is easy to pass behavior with method references
   and lambdas making the code shorter and more readable.