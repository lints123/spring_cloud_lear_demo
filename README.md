# spring_cloud_lear_demo
【08/08】
1、搭建eureka 注册中心
2、注册两个helloService服务,端口为8762和8763
3、搭建ribbon，使用restTemplate进行服务调用，通过ribbon进行服务负载均衡处理
【08/14】
1、定义eureka为高可用注册中心
2、通过在application.yml文件中定义
Spring.profiles.active:peer1，之后在本机host中定义
127.0.0.1 peer1
127.0.0.1 peer2
开启两次程序即可
3、同时，注册到eureka的服务，需要将两个注册中心的地址都填写上去
如： http://peerl:llll/eureka/,http://peer2:lll2/eureka/