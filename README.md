# mybatis

mybatis使用demo

Configuration.xml 是 mybatis 用来建立 sessionFactory 用的，里面主要包含了数据库连接相关东西
还有 java 类所对应的别名，比如<typeAlias alias="User" type="com.cuiyaocy.mybatis.jdbc.mybatis.model.User"/> 
这个别名非常重要，你在 具体的类的映射中，比如 User.xml 中 resultType 就是对应这里的。
要保持一致，这里的 resultType 还有另外单独的定义方式。
Configuration.xml 里面 的<mapper resource="**.xml"/>是包含要映射的类的 xml 配置文件。
在 UserMapper.xml 文件里面 主要是定义各种 SQL 语句，以及这些语句的参数，以及要返回的类型等。

操作过程中遇到一个找不到UserMapper.java中方法的问题，是因为映射集合中不包括该方法，
具体原因是因为最初.xml和UserMapper.java在一起，但spring默认的资源扫描不包括src目录。
具体解释见连接：https://blog.csdn.net/u010648555/article/details/70880425


使用jpa时，对应的注解比如@Table @Id @GeneratedValue是javax.persistence包里的,不是spring的，没有时需要导入包。


com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException: Table 'lovecode.hibernate_sequence' doesn't exist
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method) ~[na:1.8.0_211]
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62) ~[na:1.8.0_211]
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45) ~[na:1.8.0_211]
	at java.lang.reflect.Constructor.newInstance(Constructor.java:423) ~[na:1.8.0_211]
	
解决方法：entity中主键未设置自增

提示没有avatar_url列，我的数据库中是avatarUrl,想到是spring认为驼峰字段对应数据库中的表示带下划线的命名方式，但想不到解决方式。
最后google发现可配置如下解决：
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
据说是hibernate5中修改了命名策略。