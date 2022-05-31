
# JAVA 撰寫注意事項

- Java程式由類別 class 組成
- 如果將一個類別宣告為public，則它的檔案名稱必須與類別名稱相同才能順利編譯
- main() 沒有回傳值，所以在他之前要加上 void 關鍵字
- public 是 Java 的關鍵字，也是類別、成員的修飾子 (modifier)
- args[] 是用來接收傳入程式的引數(arguments)

```java
    public class app2_1 // 定義public類別app2_1
    {
        ...   // 類別的內容
    }
```

# 變數宣告的方式
1. 
```java
    int num; // 宣告 num 為整數變數
```
2. 
```Java
    int num1, num2, num3; // 同時宣告 num1, num2, num3 為整數變數
```
# 變數的設值
1. 在宣告的時候設值
```java
    int num=2; // 宣告變數，並直接設值
```
2. 宣告後再設值
```java
    int num1, num2; // 宣告變數
    char ch;
    num1 = 2;
    num2 = 30;
    ch = 'm';
```
3. 於程式中適當的位置宣告變數並設值
```java
    for (int num = 1 ; num<= 10; num++)
    {
        ...
    }
```
# 識別字與關鍵字
- 識別字 (identifier)：使用者自行定義的文字
- 關鍵字 (keywords)：編譯程式本身使用的識別字