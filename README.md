# Tạo mới 1 level log
- Sử dụng câu lệnh dưới đây để tạo mới 1 level với có intLevel = 350
```java
  final static Level Le_Thanh_350 = Level.forName("LeThanh-350", 350);
```
# Cách sử dụng
```java
    Logger logger = LogManager.getLogger("com.lethanh.example.MainTest");
        logger.info("Log Info Level");
        // show log bằng level log
        logger.log(Le_Thanh_350, "Log Le Thanh level");
```
# Full code

```java

    // Tạo 1 level log mới
    final static Level Le_Thanh_350 = Level.forName("LeThanh-350", 350);

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger("com.lethanh.example.MainTest");
        logger.info("Log Info Level");
        // show log bằng level log
        logger.log(Le_Thanh_350, "Log Le Thanh level");
    }
```
# REF
- https://logging.apache.org/log4j/2.x/manual/customloglevels.html
