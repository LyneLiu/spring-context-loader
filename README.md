# spring-context-loader
1、在使用<context:component-scan>的情况下，<context:annotation-config/>标签可以移除掉，因为已经被包含进去了。
2、每一个servlet拥有一个applicationContext，并且都有一个共同的root applicationContext。

参考链接：
http://stackoverflow.com/questions/27539610/order-of-loading-contextconfiglocation-in-web-xml-of-spring-servlet-project
