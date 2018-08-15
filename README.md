# spring_cloud_lear_demo
--------------------------------lts
【08/08】
1、搭建eureka 注册中心
2、注册两个helloService服务,端口为8762和8763
3、搭建ribbon，使用restTemplate进行服务调用，通过ribbon进行服务负载均衡处理
【08/14】
1、定义eureka为高可用注册中心
2、通过在application.yml文件中定义
Spring.profiles.active:peer1
3、之后在本机host中定义
127.0.0.1 peer1
127.0.0.1 peer2
开启两次程序即可
4、服务消费者注册到eureka的服务，填写注册中心的地址
如： http://peerl:8762/eureka/
【遇到的问题：启动一直报地址已经被使用，之后重启电脑即可
application.yml需要的配置
eureka:
  client:
    registerWithEureka: false
    fetchRegistry: false   
spring:
  application:
    name: eureka-server
  profiles:
    active: peer1
】
--------------------------------lts