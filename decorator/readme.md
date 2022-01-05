# Design Principle
- Classes should open for extensions, but closed for modifications
- attaches additional responsibilities to an object dynamically. Docorators provide a flexible alternative to subclassing for extending functionality

# Details for this pattern
- 在不修改已经存在类的情况下，动态扩展已经存在类的功能
- 实现细节
  - 实现一个Decorator的interface或者abstract class，这个Decorator拥有和已存在类相同的接口信息。
  - Decorator的实现类将hold一个已存在类的reference
- 实现的目标
  - 可以将Decorator类传递给任何一个接受已存在类接口的方法
  - 当调用Decortaor类中方法的时候，Decorator类就有机会给hold的reference增加相应的功能