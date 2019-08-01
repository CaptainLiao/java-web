https://start.spring.io/

在线定制化 spring 项目

## STS 从零搭建 Spring Boot 课程总结
[教程地址](https://www.imooc.com/video/16559)

### STS 初始化一个 Spring Boot 工程
STS 自带 Spring Boot 启动模板，只需要依次点击`New -> Project -> Spring Boot -> Sprint Starter Project`即可创建一个 Spring Boot 工程。

### 配置 pom
使用 maven 管理项目需要的 jar 包。

### 表设计和实体类
在 Mysql 中创建一个数据库，并设计需要的表结构。

接着在工程中创建对应的实体类`com.example.demo.entity.Area`。

### 配置 dao 层
*	创建接口dao：com.example.demo.dao.AreaDao
*	配置 mybatis: 见 main/resources/mybatis-config.xml
*	配置 mapper，实现接口 dao 对数据库的操作： 见 main/resources/mapper/*
*	配置 DataSource
*	配置 SessionFactory

### 对 dao 层做单元测试

### 配置 service 层( config/service)
增加事务管理

### 创建 service（demo.service）
*	创建 service 接口
*	创建接口实现类

### 创建 controller（demo.web）
接受前端发送过来的请求，做相应的处理（增删改查），返回处理后的结果。




