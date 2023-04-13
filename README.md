# kook-spring-boot-stater

![OpenJDK](https://img.shields.io/badge/OpenJDK-17-white?style=flat-square&logo=OpenJDK)
![SpringBoot](https://img.shields.io/badge/SpringBoot-3-green?style=flat-square&logo=SpringBoot)
![Maven-Central](https://img.shields.io/maven-central/v/cn.enaium/kook-spring-boot-starter?style=flat-square)
![JitPack](https://img.shields.io/jitpack/version/com.github.Enaium/kook-spring-boot-starter?style=flat-square)
![GitHub](https://img.shields.io/github/license/enaium/kook-spring-boot-starter?style=flat-square)

支持了所有的HttpAPI和Websocket事件,可以在`kookstarter-sample`里查看例子

最新版本以maven仓库中版本为准

## 依赖

```xml
<dependency>
    <groupId>cn.enaium</groupId>
    <artifactId>kook-spring-boot-starter</artifactId>
    <version>最新版本</version>
</dependency>
```

```groovy
implementation 'cn.enaium:kook-spring-boot-starter:最新版本'
```

```kts
implementation("cn.enaium:kook-spring-boot-starter:最新版本")
```

本项目使用了`webflux`也需要添加`webflux`依赖

提交pr时请提交到`develop`而不是`master`