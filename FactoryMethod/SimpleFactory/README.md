# 本小节完成了简单工厂设计模式的java代码编写。
### 遇到的问题：
1. java中的语法问题：
   
   - 获取输入：Scanner对象。(`new Sanner(Sysytem.in)`)
   - 类的抽象函数声明方式：
        ```java
        abstract int Calculate();
        ```
    - 继承了包含抽象函数的子类必须实现父类中的抽象方法
    - 必须在编写类文件指定类的构建构造函数，通常需要包含带参数和无参数的狗贼函数。
        ```java
        // 无参构造函数
        public Operation() {

        }
        // 带参构造函数
        public Operation(int numberA, int numberB) {
            this.numberA = numberA;
            this.numberB = numberB;
        }

        ```
2. 面向对象的程序设计。

    - 是一个先具象再抽象的过程

        ```text
        在设计面向对象的系统时，我们通常会首先考虑具体的对象、实体和其属性，然后逐步抽象出共性、关联和行为，形成更高层次的抽象概念和类。这种从具象到抽象的设计方法有助于建立系统的层次结构，提高系统的可维护性、可扩展性和可重用性。
        例如从加法运算和减法运算中，都有两个运算操作数，都有运算符，不同的是运算的执行计算过程。
        ```
    - uml关系图

        ```uml
        @startuml backend
        class OperationAdd extends Operation
        class OperationDiv extends Operation
        class OperationSub extends Operation
        @enduml
        ```