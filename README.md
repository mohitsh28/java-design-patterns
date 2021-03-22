# java-design-patterns

1.Factory: Object for creating other objects. Static Methods used for creating and returning objects. Focus on code and
implementation rather than object management / initialization.

2.Builder: Anti-Pattern -> Telescoping Constructor:Increase of object parameters which leads to exponential list of
constructors. Solution to this is Builder Design Pattern. Instead of using numerous constructors, builder uses another
object. A builder that receives each initialization parameter step by step and returns the constructed object at once.