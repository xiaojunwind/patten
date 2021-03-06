# 设计模式
## 设计原则
+ 一、开闭原则

    + 概述：对扩展开放，对修改关闭。  
    + 目的：强调抽象构建框架、实现扩展细节。提高软件的可复用性和可维护性。 
    + 针对载体：软件实体如类、模块或者方法（函数）。
    + 适用场景：面向抽象编程，原子功能的扩展与修改，需要保持原子性。除非内部实体逻辑错误，否则以扩展为主。

+ 二、依赖倒置原则

    + 概述：依赖抽象，高层模块使用抽象，底层模块实现细节。  
    + 目的：使高层模块不依赖底层模块，两者都依赖抽象。抽象不依赖细节，细节依赖抽象。提高系统稳定性，提高代码的可读性和可维护性。
    + 针对载体：互相通信的两个或者多个软件实体。
    + 适用场景：面向抽象编程，软件实体对象依赖注入，方法调用等。从当前实体出发，实现上层细节，抽象下层依赖。

+ 三、单一职责原则

    + 概述：实现软件实体稳定的内部结构，包含基础组成、核心逻辑及外部通信。
    + 目的：降低类进行内部修改时的风险，即高内聚。保证软件实体的稳定性及健壮性。
    + 针对载体：明确职责范围的软件实体。
    + 适用场景：原子性的需求或者职责对应的软件实体，核心逻辑抽象稳定。  

+ 四、接口隔离原则

    + 概述：接口设计基于单一职责原则，实现接口的实体也遵循最少知道原则。即确定职责时，不要多余不需要的接口，也不要把多个职责放到一个接口里。  
    + 目的：明确接口的职责范围，保证接口的高内聚及可扩展性，提高类的可读性、可扩展性和可维护性。
    + 针对载体：明确职责范围的软件实体。  
    + 适用场景：接口设计与职责划分，基于原子性的职责。  

+ 五、迪米特法则

    + 概述：又叫最少知道原则，一个类对其所依赖的类知道的越少越好。  
    + 目的：降低类之间的耦合性，提高系统的可维护性，降低修改风险。  
    + 针对载体：互相通信的软件实体。
    + 适用场景：类之间的交互  

+ 六、里式替换原则

    + 概述：子类可以扩展父类的功能但不能改变父类原有的功能。  
    + 目的：约束继承泛滥，开闭原则的应用，提高程序的健壮性，兼容性，维护性，扩展性，降低需求变更引入的风险。  
    + 针对载体：有继承关系的软件实体。
    + 适用场景：类继承时的覆盖等。  

+ 七、合成复用原则

    + 概述：尽量使用对象组合、聚合，而不使用继承关系达到代码复用的目的。  
    + 目的：降低类之间的耦合度，增强代码复用的灵活性  
    + 针对载体：互相通信的软件实体。
    + 适用场景：类之间的黑盒复用  
    
## 工厂模式

   + [三种工厂模式的类结构图](https://www.processon.com/view/link/5c8a0894e4b0f88919adde88)  
    + 三种工厂模式的区别：  
    简单工厂模式针对具体的产品或者实例，通过产品名称或者实例名称生产产品或者构造实例。  
    工厂方法模式为每一个产品的创建提供一个构造工厂，即针对的是创建的动作，然后将需要创建的产品分别交给相应的产品工厂。  
    抽象工厂模式针对的是多个产品的构建，多个产品构成产品族，相同的产品族，由不同的工厂生成不同的产品。  
    抽象工厂抽象出多个产品的特性，并由不同的工厂进行构建。  
    + 工厂模式总结：  
    工厂模式的应用场景是为了创建实例，依据的角度有创建方法及实例对象。  
    具体的业务场景应当依据创建方法是否可以被抽象，或者实例对象的属性是否可以被抽象，然后确定使用哪种工厂设计模式。  
    + 源码位置：{path}\factory
## 单例模式

+ 源码位置：{path}\singleton  
+ 实现方式    
    + 饿汉式：使用前就初始化  
        + 优点：无线程安全问题  
        + 缺点：不使用时也会占据内存空间，浪费资源            
    + 懒汉式：加载时才初始化
        + 优点：使用时才初始化  
        + 缺点：线程不安全，需要处理保证线程安全  
    + 注册式：实现多个的初始化
        + 优点：集中式管理单例
        + 缺点：容器缓存存在线程不安全，需要处理
    threadlocal式：在当前线程保证单例
        + 优点：在当前线程中能保证唯一，并且线程安全
        + 缺点：在全局中不能保证唯一
+ 单例模式的破坏
    + 一般有两种，一种是反射，一种是序列化
    + 通过反射破坏单例，只能在初始化的构造方法中判断，并且抛出异常来避免。
    + 通过序列化破坏单例，可以通过重写readResolve()方法来避免。
+ 内部类的执行逻辑
    + [时序图](https://www.processon.com/view/link/5c924158e4b0afc74419c186)   

## 原型模式
+ 概述：将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象。
+ 重构源码位置：{path}/singleton

## 代理模式
+ 概述：基于被代理类进行功能增强，通常是在被代理类的方法额外进行一些其他操作，符合开闭原则。有静态代理和动态代理两种。
+ 静态代理：显式声明被代理对象。
+ 动态代理：动态配置和替换代理对象。一般有两种实现，一种使用JDK，另一种使用CGLib。
+ JDK实现动态代理：使用了反射的机制，每次都要反射动态调用，效率较低
+ CGLib实现动态代理：使用了继承的方式，同时是native的，所以效率较高，但是由于是继承，所以被代理类的final方法不能代理。
+ 总结：代理模式针对的是原有的类，并不对原有的类进行修改，只是在原有的类的基础上进行功能增强。
+ 源码位置：{path}/proxy   

## 委派模式
+ 概述：委派模式注重任务分配，关注的是结果，起到了调度的作用，通过委派一层层把任务分配到具体的实现对象。
+ 应用场景：一般用于模块分离，委派的对象或者服务是不能相互替换的。
+ 源码位置：{path}/delegate


    
    