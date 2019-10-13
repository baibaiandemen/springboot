package com.sb.andemen.controller;
/**
 * @PackageName: com.sb.andemen.controller
 * @ClassName: demo
 * @Description:
 * @author: xjj
 * @date: 2019/10/13 10:58
 */
public class demo {
//lombok插件使用
            /*
            常用注解 @AllArgsConstructor @NoArgsConstructor @Data @Builder
            private Static final Logger log=LoggerFactory.getLogger(HelloController.class);
            直接使用log
             */
    /*
    1.idea插件安装---setting-plugins--
    2.maven依赖
       <dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
     */

//gsonformat插件使用
    /*
    1.idea插件安装
    2.快捷键:ALT+S  --把前端json字符串转成对象
     */

//热部署
    /*
    1.添加依赖
        <dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-devtools</artifactId>
		<optional>true</optional>
		</dependency>
	2.开启热部署
            <plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<fork>true</fork>
				</configuration>
			</plugin>
     */

//restful风格
    /*
    1.看url就知道要什么风格
    2.看http method就知道要针对资源干什么
    3.看http status code 就知道结果如何
     */

}
