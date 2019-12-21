# SpringBoot 实现DBManager

## Step 1 (坑点)  
1. config-location用于设置mybatis配置文件的路径, 配置文件中，可以配置Mapper文件位置，以及MyBatis的其他基础配置
2. mapper-locations用于配置xxxmap.xml文件位置
   ```
   mapper-locations: classpath:mappers/*.xml
   此处设置map文件扫描路径位于classpath\mappers\  
   ```
   如果非要配置map文件在src目录中，请在pom.xml中做如下修改, 否则项目打包时，无法加入scr目录中的mapper文件
   ```
    <build>
        <resources>
            <!-- 如果不加，那么打包的时候非JAVA文件不会被打包进来 -->
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.properties</include>
                    <include>**/*.xml</include>
                </includes>
                <filtering>false</filtering>
            </resource>
        </resources>
    </build>    
   ```
3. 在Mapper类中，如果不希望出现红字（并不影响运行），加上@Repository注解，@Mapper注解必须存在
    1). @Repository是Spring的注解, 需要在Spring中配置扫描地址，然后生成Dao层的Bean才能被注入到Service层中。  
    2). @Mapper是MyBatis的注解,不需要配置扫描地址，通过xml里面的namespace里面的接口地址，生成了Bean后注入到Service层中。  
    3). 如果@Repository和@Mapper都不想写，请在启动类上加入@MapperScan, 将会自动扫描路径下的所有接口
4. 实体类如果有自定义构造方法，必须收工写一个无参构造方法  