@echo off
echo 编译C++文件...

if "%1"=="" (
    echo 用法: compile.bat 文件名.cpp
    echo 例如: compile.bat basics/hello_world.cpp
    exit /b 1
)

set filename=%~n1
g++ -std=c++17 -o %filename%.exe %1

if %errorlevel%==0 (
    echo 编译成功! 运行 %filename%.exe
    %filename%.exe
) else (
    echo 编译失败!
)