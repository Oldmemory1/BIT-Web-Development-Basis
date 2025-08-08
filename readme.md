# 使用Springboot重构完成大二小学期的项目

## 如何使用

### 在IDEA中打开项目，并且修改application.properties中的spring.datasource.url=jdbc:sqlite:D:/IDEA_projects/WebProject1/score.db，将jdbc:sqlite:后的内容换为数据库的路径

### 点击启动项目（上方绿色箭头）

### 网址http://localhost:8192/ 为主页，可以跳转到onlinetest界面

### 网址http://localhost:8192/aboutMe 为小学期要求的个人主页

### 网址http://localhost:8192/onlinetest 为小学期要求的在线考试界面

### 网址http://localhost:8192//delete 为测试用，可以删除数据库中的所有数据

### 网址http://localhost:8192/api/** 为前端与后端交互的API，用于onlinetest展示所有人的成绩，提交答案，删除所有数据等功能

### 网址http://localhost:8192/test 为以前做的测试界面，无用途

### src\main\resources\static目录为前端需要用到的css，js，以及一些图片文件

### src\main\resources\templates目录为前端需要的html文件