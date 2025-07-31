一：
   创建了一个maven构建的项目，主要是演示maven创建工程的步骤；
   父工程：maven_study
        子工程：maven_java ,普通的java项目
        子工程：maven_web ,web项目（以修改packing为war的方式将工程项目改为web，且要配置web的资源路径和web.xml路径）
        子工程：maven_web_plugin ,JBLJavaToWeb插件来把普通工程改为web工程


二： 
   --学习了maven的构建声明周期：
     生命周期的构建过程就是一个流水线，
     但我们执行了某个声明周期的命令会自动执行前面的生命周期；简化了操作；
     例如：执行 mvn test， 就会自动执行 clean-->compile --->test
     且每个命令都会有对应的maven插件去实现该命令的功能；
            * mvn clean 清除target
            * mvn compile 编译
            * mvn test 测试 （测试完成直接生成报告）
            * mvn package 打包
    
   -- mvn package 和mvn install 的区别
          * mvn package 只是打包而已;
          * mvn install 安装：打包并且发布到本地仓库，便于我们本地的别的工程使用GAV坐标进行依赖的引用；